package basic;

public class PublicAccessEx {
public String name ="Puja";
public void msg() {
	System.out.println("Name is : "+name);
	
}
public static void main(String[] args) {
PublicAccessEx s=new PublicAccessEx();
s.msg();
}
}
