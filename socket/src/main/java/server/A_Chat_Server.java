package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Chat_Server  {


    public static ArrayList<Socket> connectionArray = new ArrayList<>();
    public static ArrayList<String> currentUsers = new ArrayList<>();

    public static void main(String[] args) {


        try {
            final int PORT = 8085;
            ServerSocket SERVER = new ServerSocket(PORT);
            System.out.println("Waiting for a clients...");

            while(true){
                Socket SOCK = SERVER.accept();
                connectionArray.add(SOCK);

                System.out.println("Client connected from: " + SOCK.getLocalAddress().getHostName());

                addUserName(SOCK);

                A_Chat_Server_Return CHAT = new A_Chat_Server_Return(SOCK);
                Thread X = new Thread(CHAT);
                X.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addUserName(Socket X) throws IOException {

        Scanner INPUT = new Scanner(X.getInputStream());
        String UserName = INPUT.nextLine();
        currentUsers.add(UserName);

        for (Socket s: connectionArray) {
            PrintWriter out = new PrintWriter(s.getOutputStream());
            out.println("#?!"+ currentUsers);
            out.flush();
        }
    }

}
