package inheritence;
import java.util.Scanner;
class item{
	String name;
	public item(String name) {
	System.out.println(name);
	}
}
class brand extends item{
	String name,brand,type;
public brand(String name) {
	super (name);
	System.out.println("Brand :"+brand);// TODO Auto-generated constructor stub
}
}
class type extends brand{
	String type;
	public type(String name,String brand,String type) {
		super(brand);
		System.out.println("type is: "+type);
	}
}
//super as variable
//class item {
//	int age=40;
//	int rno=1;
//}
//class school extends item{
//	int age=20; 
//	void display() {
//		System.out.println("Super :"+super.age );
//		System.out.println(age);
//		System.out.println(rno);
//	}
//}
public class Multiple1 {
//
public static void main(String[] args) {
//	school s=new school();
//	s.display();
//		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter item,brand and type: ");
		String item = s.next();
		String brand= s.next();
		String type = s.next();
		type t=new type(item, brand, type);

	}
}
