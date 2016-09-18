package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws Exception {

        SocketServer server = new SocketServer();
        server.run();
    }


    public void run() throws Exception {
        ServerSocket serverSocket = new ServerSocket(8085);
        Socket socket = serverSocket.accept();
        BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(socket.getInputStream()));

        String msg = reader.readLine();
        System.out.println(msg);

        if (msg != null){
            PrintStream out = new PrintStream(socket.getOutputStream());
            out.println("Message received");

        }
    }


}
