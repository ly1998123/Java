package myproject3_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA_2_3.portable.OutputStream;



public class Client {
	public static void main(String[] args)throws Exception {
		Socket socket=new Socket("172.20.10.6",8888);
		InputStreamReader reader = new InputStreamReader(socket.getInputStream());
		BufferedReader buffer_reader = new BufferedReader(reader);
		Scanner input= new Scanner(System.in);
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		boolean f=true;
		String name=null;//发送方姓名
		String toName=null;//接收方姓名
		String str=null;
		int temp=0;
		int i=0;
		int logout=0; //判断是否退出
		System.out.println("请选择：1、register 2、login 3、send message 4、logout");
		while(f) {
			i=input.nextInt();
			if(i==1) {
				 System.out.print("我说:");
				 String str1=input.next(); 
				 str="<register  name=”"+str1+"”/>";
				 writer.println(str);
				 writer.flush();	
				 String echo= buffer_reader.readLine();
				 System.out.println("服务器响应:"+echo);
			}else if(i==2){
				System.out.print("我说:");
				 String str1=input.next(); 
				 name=str1;
				 str="<login  name=”"+str1+"”/> ";
				 writer.println(str);
				 writer.flush();	
				 String echo= buffer_reader.readLine();
				 System.out.println("服务器响应:"+echo);
			}else if(i==3) {
				String message=null;
				 if(temp==0){
					 System.out.print("接受方姓名:");
					 toName=input.next();
					 System.out.print("我说("+name+"):");	
					 message=input.next();
					 temp=1;
			}else {
				System.out.print("我说("+name+"):");	
			 message=input.next();
			}
				 if(message.equals("logout")){//如果输入logou就代表退出聊天服务器
					 logout=1;
		}else{
			 str="<message from=”"+name+"”"+" to=”"+toName+"”"+"  message=”"+message+"”>";
			 writer.println(str);
			 writer.flush();	
			 String echo= buffer_reader.readLine();//读到消息
			 System.out.println(toName+":"+echo);//读到消息
			 }			 			 
	 }
	 if(i==4||logout==1){//退出
		 str="<logout  name=”"+name+"”/";//退出
		 writer.println(str);
		 writer.flush();	
		 String response = buffer_reader.readLine();
        System.out.println("服务器响应:"+ response);
		 f=false;
	 }
			writer.close(); 
			buffer_reader.close(); 
			socket.close();
		}
		
	}
		 public static void FileInformation(String texts){//显示收到的文本
				JFrame showInfo=new JFrame();
				JPanel jp=new JPanel();
				JTextArea text=new JTextArea(20,20);//文本区
				text.append(texts+"\n");//输入
				jp.add(text);
				showInfo.add(jp);
				
				showInfo.setTitle("回答！");
				showInfo.setVisible(true);
				showInfo.setSize(300,200);
				showInfo.setLocation(500, 500);
				showInfo.setDefaultCloseOperation(1);
		}

}
