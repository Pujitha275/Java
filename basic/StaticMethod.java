package basic;

class Operation {
	// modifier returnType nameOfMethod (Parameter List) {
	// method body }
	void addition(int a, int b, int c) {
		System.out.println("Addition :" + (a + b + c));
	}

	int division(int a, int b) {
		return a / b;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int divide(int c, int d) {
		return c / d;
	}

}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation O = new Operation();
		O.addition(3, 9, 7);
		System.out.println("division of a and b :" + O.division(9, 9));
		System.out.println("addtion of a and b: " + O.add(8, 10));
		System.out.println("division of c and d :"+ O.divide(9, 3));
	}

}
