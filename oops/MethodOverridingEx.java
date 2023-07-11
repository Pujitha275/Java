package oops;
class learner{
	 void display() {
	System.out.println("Name is Pujitha Rama");	
	System.out.println("Data Analytics");
	 }
	void display2() {
		System.out.println("duration is 4 months");
	}
}
class course extends learner{
	 void display1() {
		super.display();// to access method from parent class
		System.out.println("Java Full Stack");
	}
	 @Override// to override the method in parent class
	 void display2() {
			System.out.println("duration is 2 months");
			}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
course c= new course();
c.display1();
c.display();// to print parent class with child class variable
c.display2();
learner l=new learner();// new variable can also be accessed through child class learner l=new course();
l.display();l.display2();
	}

}
