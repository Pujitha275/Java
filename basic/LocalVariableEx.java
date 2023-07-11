package basic;

	public class LocalVariableEx {
		public void displayAge() {
			int age=0;
			age=age+21;
			System.out.println("age is:"+age);	
		}
		public static void main(String[]args) {
			 LocalVariableEx ex=new LocalVariableEx();
					ex.displayAge();
					
		}
}
