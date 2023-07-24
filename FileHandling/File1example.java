package FileHandling;

import java.io.File;
import java.io.IOException;

public class File1example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File ob=new File("C:/Users/ASUS/eclipse-workspace/CorejavaPart1/src/FileHandling/Pujitha1.txt");
if(ob.createNewFile())
{
	System.out.println("File created");
}else {
	System.out.println("File exist");
}
	}

}
