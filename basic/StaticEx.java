package basic;
class Student{
    public static int fee;
	public static String name="Pujitha";
}
public class StaticEx {
	public static void main (String[]args) {
	Student.fee=10000;
	System.out.println("fee : "+Student.fee);
	System.out.println("Name : "+Student.name);
	}
}
package basic;
class customer{
	public static int bill;
}
public class Bill {
	public static void main(String[] args) {
		customer.bill=8500;
		System.out.println("Bill : "+customer.bill);
	}
}