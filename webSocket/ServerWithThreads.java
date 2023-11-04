/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudante
 */
import java.io.*;
import java.net.*;

public class ServerWithThreads implements Runnable {

    private Socket conn;
    
    public ServerWithThreads(Socket conn) {
        this.conn = conn;
    }

    @Override
    public void run() {
        
        System.out.println("Client connected");

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            PrintWriter out = new PrintWriter(conn.getOutputStream(), true);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received message from client: " + inputLine);
                out.println("Server received message: " + inputLine);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {

        // inicia servidor
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started");

        // Ao receber um cliente, abre uma thread
        while (true) {
            Socket clientSocket = serverSocket.accept();
            ServerWithThreads client = new ServerWithThreads(clientSocket);
            Thread tClient = new Thread(client);
            tClient.start();
        }
    }
}
