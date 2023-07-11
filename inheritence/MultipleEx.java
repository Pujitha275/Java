package inheritence;
class university{
	String name="JNTU";
	void display0() {
		System.out.println("University : "+name);
	}	
	}
class college extends university{
	String name="SRIT";
	void display1() {
		System.out.println("College : "+name);
	}
}
class scholar extends college{
	String name="Pujitha";
	void display2() {
		System.out.println("Scholar : "+name);
	}
}
public class MultipleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
scholar d=new scholar();
d.display0();
d.display1();
d.display2();
	}

}
