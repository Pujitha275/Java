package Practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp=0,n;
Scanner s=new Scanner(System.in);
System.out.println("enter value of n :");
n=s.nextInt();
for(int i = 2;i<=n-1;i++) {
if(n%i==0) {
	
	temp=temp+1;
}
}

if(temp>0){
	System.out.println("is not prime");
	}
else {
	System.out.println("is prime");
}
}
}
