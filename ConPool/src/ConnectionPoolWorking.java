import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPoolWorking extends Thread{
	private ConnectionPool cp;
	public ConnectionPoolWorking (ConnectionPool cp) {
		this.cp=cp;
	}
	public void run() {
		Connection c=cp.getConnection();
		try {
			Statement st=c.createStatement();
			for(int i=0;i<ConPoolTest.InsertTime;i++) {
				String sql="insert into";
				st.execute(sql);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		cp.returnConnection(c);
	}

}
