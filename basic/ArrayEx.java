package basic;

public class ArrayEx {

	public static void main(String[] args) {
		//int num[]= {6,9,4};
		//for(int i=0;i<num.length;i++) {
		//	System.out.println(num[i]);
		//}
		int num[]= {1,8,9,3,2,9,7};
		for(int i=6;i>=1;i--) {
			System.out.println(num[i]);
		}
		
		int a[][] = { { 6, 7,7 }, { 0, 5 ,9} };
		System.out.println("a[0][0]: " + a[0][0]);
		System.out.println("a[0][1]: " + a[0][1]);
		System.out.println("a[1]0]: " + a[1][0]);
		System.out.println("a[1][1]: " + a[1][1]);
		// System.out.println(num.length);
		for (int i = 0; i < 2; i++) { // row
			for (int j = 0; j < 2; j++) { // column
				System.out.println(a[i][j]);
			}

		}
		
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
}
