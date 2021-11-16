package ExecutorFramework;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultiThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Executor ex = Executors.newFixedThreadPool(10);
        while (true) {
           Socket connection = serverSocket.accept();
           ex.execute(new Runnable() {
               @Override
               public void run() {
//                   serveRequest(connection);//need to create srveReq method
               }
           });

//           Thread t = new Thread(()->{
//               serveRequest(connection);//need to create srveReq method
//           });
//           t.start();
//        }
        }
    }}
