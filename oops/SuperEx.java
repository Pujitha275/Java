package oops;
class AnimalEats{
void display() {
	System.out.println("The animal eats :");
}
}
class dog extends AnimalEats{
	void display1() {
		super.display();
		System.out.println("Dog eats meat");
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d=new dog();
d.display1();

	}

}
