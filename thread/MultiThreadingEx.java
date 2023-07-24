package thread;
class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running ");
	}
	
}
public class MultiThreadingEx {

	public static void main(String[] args) {
		Threadeven t=new Threadeven();
		Thread t1=new Thread(t);
	t1.start();
//int num=4;
//for(int i=1;i<=10;i++) {
//	System.out.println(num+"*"+i+"="+num*i);
//}
	}

}
class ThreadFact implements Runnable{

	@Override
	public void run() {
		int Num=9;
		int fact=1;
		for(int i=1;i<=Num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+Num+ " is "+fact);
		
	}
	
}
class Threadfibo extends Thread{

	@Override
	public void run() {
		System.out.println();
		System.out.println("Fibonacci series");
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);//printing 0 to 1
		for(int i1=2;i1<count;i1++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		
	}
	}
}
class  Threadeven extends Thread{

	@Override
	public void run() {
		System.out.println();
		System.out.println("Even odd numbers");
		int num=20;
		for(int i2=2;i2<num;i2++) {
			if(i2%2==0) {
				System.out.println(i2);
			}
		}
		System.out.println();
	}
	
}