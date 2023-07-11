package inheritence;
import java.util.Scanner;
//super class
class Collage{
	String name;
 public Collage(String nm) {
		 name=nm;
		System.out.println("Name is: "+name);
	}
}
 //sub class
	class Person extends Collage{
String name;
String role;
public Person(String name, String role){
	//super as constructor
	super(name);
	this.role=role;
	System.out.println("Role is:"+role);
		}
	}
	public class SingleInheritence1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name and role: ");
		String name = s.next();
		String role = s.next();
		
Person s1= new Person(name, role);

	}

}
