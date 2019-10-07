package myproject3_3;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
	public static HashMap<String, PrintWriter> users= new HashMap<String,PrintWriter>();
	public static void main(String[] args)throws Exception{
		ServerSocket server=new ServerSocket(888);
		while(true) {
			System.out.print("请等待...");
			Socket socket=server.accept();
			SocketHandler handler=new SocketHandler(socket);
			
			Thread thread=new Thread(handler);
			thread.start();
		}
	}

}
