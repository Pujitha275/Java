package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos = new FileOutputStream("D:/WriteableFile");
	
	String s="java is fun";
	byte b[]=s.getBytes();
	fos.write(b);
	System.out.println("file content is");
	FileInputStream fis=new FileInputStream("D:/WriteableFile");
	int i=fis.read();
	while(i!=-1) {
		System.out.println(i);
		System.out.print((char)i);
		i=fis.read();
	}
	fis.close();
	}
}
