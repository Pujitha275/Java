package oops;
class PrivateEx{
	int c=2;

	PrivateEx(int a){
		c=a;
		System.out.println(c);
	}
//	public PrivateEx(int a) {
//		this.c=a;
//	}
	void display() {
		int b=32;
		System.out.println(b);
		}
}
public class PrivateAccessEx {
	private int a;
	private int b=1;
	public void test() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrivateAccessEx s=new PrivateAccessEx();
PrivateEx d=new PrivateEx(10);
d.display();
System.out.println(d.c);
s.a=10;


	}

}
