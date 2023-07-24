package garbage;
public class FinalizeMethod 
	{
	String s;
	public FinalizeMethod(String s) {
		this.s=s;
	}
	public static void main(String[] args) {
		FinalizeMethod s1=new FinalizeMethod("s1");
		FinalizeMethod s2=new FinalizeMethod("s2");
		s1=s2;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
	}
	
	}