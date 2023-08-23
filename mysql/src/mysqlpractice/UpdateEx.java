package mysqlpractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class UpdateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="puji";
		String url="jdbc:mysql://localhost:3306/capgemini";
		
		
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter id ");
	int id=s.nextInt();
    System.out.println("enter student name to be changed: ");
	String name=s.next();
	
	
		try {
			//	step 1
				Class.forName(driver);
				//step 2
				 conn=DriverManager.getConnection(url, un, pass);
				 st=conn.createStatement();
				 String sel= "update student set name='"+name+"' where id= "+id;
				 int value=st.executeUpdate(sel);
				 System.out.println("record has been updated");


 
			}catch(Exception e){
				System.out.println(e);	
			}
	}

}
