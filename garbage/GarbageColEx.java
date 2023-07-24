package garbage;

public class GarbageColEx {
public void finalize() {
	System.out.println ("Garbage Collection performed by JVM");
}
public static void main (String args[])
{
	GarbageColEx s1 = new GarbageColEx();
	GarbageColEx s2 = new GarbageColEx();
	s1 = null;
	s2 = null;
    System.gc();
	
	}

}
