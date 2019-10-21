import java.beans.Statement;

public class DBTest {
	public static void main(String[] args)throws Exception{
		java.sql.Statement stmt=ConnectMySQL.getStatement();
		String sql="create table student(no int primary key,name char(20))";
		stmt.execute(sql);
		stmt.close();
	}

}
