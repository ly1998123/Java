import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	List<Connection> cs=new ArrayList<Connection>();
	int size;
	public ConnectionPool(int size){
		this.size=size;
		Init();
	}
	public void Init() {
		try {
			String driverName="com.microsoft.sqlserver.jdbc";
			String url="jbdc:sqlserver//localhost:1433;DatebaseName=Student";
			String userName="sa";
			String password="12345";
			Class.forName(driverName);
			for(int i=0;i<=size;i++) {
			Connection con=DriverManager.getConnection(url,userName,password);
			cs.add(con);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}

  }
	public synchronized Connection getConnection() {
		while(cs.isEmpty()) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		Connection con=cs.remove(0);//将第0个移出去
		return con;
	}
	public synchronized void returnConnection(Connection con) {
		cs.add(con);
		this.notifyAll();
	}
}
