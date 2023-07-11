package oops;
class UserInput{
	public void data(int a,int b) {
		System.out.println(a+" "+b);
	}
}
class UserAddition extends UserInput{
	public void data(int a,int b) {
		System.out.println("Sum: "+(a+b));
	}
}
public class OverrideParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserInput s=new UserAddition();
s.data(4,3);
UserInput s1=new UserInput();
s1.data(5, 7);
	}
}
