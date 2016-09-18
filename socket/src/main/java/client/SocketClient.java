package client;

import java.io.*;
import java.net.Socket;

public class SocketClient {


    public static void main(String[] args) throws Exception {
        SocketClient client = new SocketClient();
        client.run();

    }

    private void run() throws IOException {
        Socket socket = new Socket("localhost", 8085);
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("Hello to SERVER from Client");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg = in.readLine();
        System.out.println(msg);

    }
}
