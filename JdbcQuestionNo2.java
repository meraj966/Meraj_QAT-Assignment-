import java.sql.*;
public class JdbcQuestionNo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "SYSTEM";
		String password = "oracle";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Databse Connected");
		Statement stmt = con.createStatement();
		String query = "create table student(id number, name varchar(40))";
		int rowcount = stmt.executeUpdate(query);
		System.out.println("Table Created");
		query = "insert into student values( 1 , 'Meraj')";
		rowcount = stmt.executeUpdate(query);
		System.out.println("1 row Created");
		query = "insert into student values( 3 , 'Meraj')";
		rowcount = stmt.executeUpdate(query);
		System.out.println("2 row Created");
		query = "select * from student";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name"));
		}
		query = "update student set name = 'Meraj Alam' where id = 3";
		rowcount = stmt.executeUpdate(query);
		query = "select * from student";
		rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name"));
		}
		con.close();
	}
		
}
