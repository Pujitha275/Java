package oops;

public class Ex {
int a,c, b;
public Ex() {
	this(5, 8, 3);//to access value of parameter
	System.out.println("My default constructor");
}
public Ex(int a,int b, int c) {
	//this();// to print the constructor
	this.a=a;//to clear confusion we use this keyword
	this.b=b;
	this.c=c;
}
void msg() {
	System.out.println("Hii");
}
//public void setdata(int a,int b,int c1) {
//	this.a=a;
//	this.b=b;
//	c=c1;
//}
public void displaydata() {
	this.msg();//represent a current method
	System.out.println("value of a "+a);
	System.out.println("value of b "+b);
	System.out.println("value of c "+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ex x=new Ex();
//Ex x=new Ex(8, 3, 2);
//x.setdata(5, 9, 4);
x.displaydata();
	}

}
