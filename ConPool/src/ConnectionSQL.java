import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSQL extends Thread{
	public void run() {
		try {
			String driverName="com.microsoft.sqlserver.jdbc";
			String url="jbdc:sqlserver//localhost:1433;DatebaseName=Student";
			String userName="sa";
			String password="12345";
			Class.forName(driverName);
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();
			for(int i=0;i<ConPoolTest.InsertTime;i++) {
				String sql="insert into";
				st.execute(sql);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}

}
