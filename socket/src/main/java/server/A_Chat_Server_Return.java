package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class A_Chat_Server_Return implements Runnable {

    Socket SOCK;
    private Scanner INPUT;
    private PrintWriter OUT;
    String MESSAGE = "";

    public A_Chat_Server_Return(Socket SOCK) {
        this.SOCK = SOCK;
    }

    public void CheckConnection() throws IOException {
        if (!SOCK.isConnected()){
            for (int i = 1; i <= A_Chat_Server.connectionArray.size(); i++) {
                if (A_Chat_Server.connectionArray.get(i) == SOCK){
                    A_Chat_Server.connectionArray.remove(i);
                }
            }

            for (int i = 1; i <= A_Chat_Server.connectionArray.size(); i++){
                Socket TEMP_SOCK = (Socket) A_Chat_Server.connectionArray.get(i-1);
                PrintWriter TEMP_OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
                TEMP_OUT.println(TEMP_SOCK.getLocalAddress().getHostName()+ " disconnected");
                TEMP_OUT.flush();
                //show disconnection at server
                System.out.println(TEMP_SOCK.getLocalAddress().getHostName()+ " disconnected");
            }
        }
    }

    @Override
    public void run(){
        try{
            try{
                INPUT = new Scanner(SOCK.getInputStream());
                OUT   = new PrintWriter(SOCK.getOutputStream());

                while (true){
                    CheckConnection();

                    if (!INPUT.hasNext()){
                        return;
                    }

                    MESSAGE = INPUT.nextLine();

                    System.out.println("Client said: " + MESSAGE);

                    for (int i = 1; i <= A_Chat_Server.connectionArray.size(); i++) {
                        Socket TEMP_SOCK = (Socket) A_Chat_Server.connectionArray.get(i-1);
                        PrintWriter TEMP_OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
                        TEMP_OUT.println(MESSAGE);
                        TEMP_OUT.flush();
                        System.out.println("Sent to: "+ TEMP_SOCK.getLocalAddress().getHostName());
                    }
                }

            }finally {
                SOCK.close();
            }
        }catch (Exception x){
            System.out.println(x);
        }

    }
}
