package client;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class A_Chat_Client implements Runnable {

    Socket SOCK;
    Scanner INPUT;
    Scanner SEND = new Scanner(System.in);
    PrintWriter OUT;


    public A_Chat_Client(Socket SOCK) {
        this.SOCK = SOCK;
    }

    public void run() {

        try{
            try{

                    INPUT = new Scanner(SOCK.getInputStream());
                    OUT   = new PrintWriter(SOCK.getOutputStream());
                    OUT.flush();
                    checkStream();

            }finally {
                SOCK.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    //----------------------------------------------------------------------------------------------
    public void DISCONNECT() throws IOException {
        OUT.println(A_Chat_Client_GUI.UserName + " has disconnected.");
        OUT.flush();
        SOCK.close();
        JOptionPane.showMessageDialog(null,"you disconnected!");
        System.exit(0);
    }

    //----------------------------------------------------------------------------------------------
    public void checkStream(){
        while (true){
            RECEIVE();
        }
    }

    //----------------------------------------------------------------------------------------------
    public void RECEIVE(){
        if (INPUT.hasNext()){
            String MESSAGE = INPUT.nextLine();

            if (MESSAGE.contains("#?!")){
                String TEMP1 = MESSAGE.substring(3);
                       TEMP1 = TEMP1.replace("[","");
                       TEMP1 = TEMP1.replace("]","");

                String[] currentUsers = TEMP1.split(", ");
                A_Chat_Client_GUI.JL_ONLINE.setListData(currentUsers);
            }else {
                A_Chat_Client_GUI.TA_CONVERSATION.append(MESSAGE + "\n");
            }
        }
    }

    //----------------------------------------------------------------------------------------------
    public void SEND(String X){
        OUT.println(A_Chat_Client_GUI.UserName + ": " + X);
        OUT.flush();
        A_Chat_Client_GUI.TF_Message.setText("");
    }
    //----------------------------------------------------------------------------------------------

}
