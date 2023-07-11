package basic;

public class RelationalEx {
	public static void main(String[] args) {
		// relational operator
		int a = 15;
		int b = 23;
		String s = "hello";
		String s1 = "hi";
		System.out.println("== " + (a == b));
		System.out.println("< " + (a < b));
		System.out.println("!= " + (s != s1));
		// bitwise operator
		int c = 1011;
		int d = 1000;
		System.out.println("& :" + (c & d));
		System.out.println("| :" + (c | d));
		System.out.println("^ :" + (c ^ d));
		// shift operators
		int e = 0010;
		System.out.println("left shift << :" + (e << 1));
		System.out.println("left shift << :" + (e << 2));
		System.out.println("left shift << :" + (e << 3));
		System.out.println("right shift >> :" + (e >> 1));
		// ternary operators
		int x = 10;
		int y = 3, max,min;
		int z = 1;
		max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Max of 3 num: "+max );
		min = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
		System.out.println("min of 3num : "+min);
		//assignment operator
	
	}
}
