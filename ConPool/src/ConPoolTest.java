import java.util.ArrayList;
import java.util.List;

public class ConPoolTest {
	private static int threadNumber=10;
	public static int InsertTime=1;
	public static void main(String[] args) {
		ConnectionSQLWay();
		ConnectionPoolWay();
	}
	private static void ConnectionPoolWay() {
		ConnectionPool cp=new ConnectionPool(10);
		long startime=System.currentTimeMillis();
		List<Thread> ts=new ArrayList<>();
		for(int i=0;i<=threadNumber;i++) {
			Thread t=new ConnectionPoolWorking(cp);
			t.start();
			ts.add(t);
		}
		for(Thread t:ts) {
			try {
				t.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endtime=System.currentTimeMillis();
		long time=endtime-startime;
		System.out.println("连接池连接时间：");
		System.out.print(time);
	}
	private static void ConnectionSQLWay() {
		
		long startime=System.currentTimeMillis();
		List<Thread> ts=new ArrayList<>();
		for(int i=0;i<=threadNumber;i++) {
			Thread t=new ConnectionSQL();
			t.start();
			ts.add(t);
		}
		for(Thread t:ts) {
			try {
				t.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endtime=System.currentTimeMillis();
		long time=endtime-startime;
		System.out.print("不使用连接池的时间：");
		System.out.print(time);
		
	}
	
	

}
