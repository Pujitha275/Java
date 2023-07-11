package basic;

public class MethodOverloaingEx {

void add(int x,int b) {
	System.out.println("Addition: "+(x+b));
}
void add() {
	int a=2,y=5;
	System.out.println("Addition: "+(a+y));
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloaingEx i=new MethodOverloaingEx();
i.add(5, 5);
i.add();
	}

}
//public class Shape {
//	static int area(int l, int b) {
//		return l * b;
//	}
//
//	static double circle(double pie, double r) {
//		return pie * (r * r);
//	}
//
//	public static void main(String[] args) {
//		System.out.println("area of square :" + Shape.area(20, 18));
//		System.out.println("Area of circle :" + Shape.circle(3.14, 6));
//	}
//
//}