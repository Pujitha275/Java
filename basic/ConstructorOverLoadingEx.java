package basic;

public class ConstructorOverLoadingEx {
	public ConstructorOverLoadingEx() {
		System.out.println("welcome: ");
			
	}
	public ConstructorOverLoadingEx(String name) {
		System.out.println("Name : "+name);
	}
	public ConstructorOverLoadingEx(int rno,String nm) {
		System.out.println("rno: "+rno+", " + "Name : "+nm);
	}	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorOverLoadingEx s=new ConstructorOverLoadingEx();
ConstructorOverLoadingEx s1=new ConstructorOverLoadingEx("Puja");
ConstructorOverLoadingEx s2=new ConstructorOverLoadingEx(23, "puja");

	}

}
