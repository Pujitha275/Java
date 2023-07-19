package Practice;

import java.util.Scanner;

public class PrintNum {
	public static void main(String[] args)throws MinBalanceException {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value: ");
		n=s.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.print(" "+i);
	}
	}
}
