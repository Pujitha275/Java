package oops;
abstract class software{
	abstract void type();
}
class coding extends software{

	@Override
	void type() {
		System.out.println("coding");
	}
}
class testing extends software{

	@Override
	void type() {
		System.out.println("testing");
	}
	
}
public class AbstractionEx1 {

	public static void main(String[] args) {
		software s=new coding();
		s.type();
		software s1=new testing();
		s1.type();

	}

}
