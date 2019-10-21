import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
	public static Connection getConnection()throws Exception{
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:127.0.0.1/student";
		String userName="root";
		String password="12345";
		Class.forName(driverName);
		Connection con=DriverManager.getConnection(url,userName,password);
		return con;
	}
	public static java.sql.Statement getStatement()throws Exception{
		java.sql.Statement stmt=getConnection().createStatement();
		return stmt;
	}
}
