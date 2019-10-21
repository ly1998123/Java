


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connet_SQLserver {
	 public static void main(String args[]) {
		 String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=Student";
		 String user ="ly";
		 String password = "12345";
		 String sqlStr = "select StudentID, StudentName, ContactName from Student";

		 try {
		 Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		 System.out.println( "" );

		 Connection con = DriverManager.getConnection( url, user, password );
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery( sqlStr );

		 while(rs.next()) {
		 System.out.print(rs.getString("StudentID") + " ");
		 System.out.print(rs.getString("StudentName") + " ");
		 System.out.println(rs.getString("ContactName"));
		 }
		 rs.close();
		 st.close();
		 con.close();
		 } catch(Exception err) {
		 err.printStackTrace(System.out);
		 }
		 }

}
