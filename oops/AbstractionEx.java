package oops;
abstract class stationary{
	 stationary() {
		System.out.println("constructor");
	}
	abstract void show();//abstract method 
	void display() {
		System.out.println("Stationary-implemented method");//non abstract method  {
	}
	static void display1() {
		System.out.println("Static method");//static and final methods cannot be declared in abstract class
	}
}
class books extends stationary{

	@Override
	void show() {//abstract method 
	System.out.println("Non implemented method");
	}
	
}
class pens extends stationary{

	@Override
	void show() {
		System.out.println("Pen ");
		
	}
	
}
public class AbstractionEx {

	public static void main(String[] args) {
	stationary s=new books();
	s.display();
	s.show();
	stationary s1=new pens();
	s1.show();
	s1.display1();
//	pens p=new stationary();- we cannot create instance of abstraction class

	}

}
