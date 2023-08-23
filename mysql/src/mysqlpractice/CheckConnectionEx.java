package mysqlpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckConnectionEx {

	public static void main(String[] args)  {
	String driver="com.mysql.cj.jdbc.Driver";
	String un="root";
	String pass="puji";
	String url="jdbc:mysql://localhost:3306/capgemini";
	
	try {
	//	step 1
		Class.forName(driver);
		//step 2
		Connection conn=DriverManager.getConnection(url, un, pass);
		Statement st=conn.createStatement();
		String sel="select * from student";
		ResultSet rs=st.executeQuery(sel);
		System.out.println("Information about student");
		System.out.println("id\t name");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
		}
		
	}catch(Exception e){
		System.out.println(e);	
	}
	}

}
