package inheritence;
//super class
class Student{
	String name="Puja";
	void display() {
		System.out.println(name);
	}
}
//sub class
class Developer extends Student{
	String role="Backend";
	void displayRole() {
		System.out.println(role);
	}
	
}
public class SingleInheritenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Developer s=new Developer();
	s.display();
	s.displayRole();
	}

}
