
package basic;

class Method {
	void mod(int a, int b) {
		System.out.println("modulus of a and b: " + (a % b));
	}

	float addition(float a, float b, float c) {
		return a + b + c;
	}

	long division(int a, int b) {
		return a / b;
	}

	double sub(double a, double b, double c) {
		return a - b - c;
	}


	public static void main(String[] args) {
		Method m = new Method();
		m.mod(10, 2);
		System.out.println("addition of a and b : " + m.addition(10f, 20f, 20f));
		System.out.println("Division of a and b : " + m.division(15, 3));
		System.out.println("substraction of 3 numbers:" + m.sub(20.3, 5.33, 2.7));
	}
}