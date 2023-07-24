package FileHandling;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
File newFile0=new File("C:\\Users\\ASUS\\eclipse-workspace\\CorejavaPart1\\src\\FileHandling\\list");
if(newFile0.createNewFile()) {
System.out.println("File Created.");
	}else {
		System.out.println("File exists");
	}
System.out.println("Relavtive path: "+newFile0.getAbsolutePath());
System.out.println("Canonical path: "+newFile0.getCanonicalPath());
System.out.println("can read :"+newFile0.canRead());
System.out.println("Getname: "+newFile0.getName());
System.out.println("can read: "+newFile0.canWrite());

File newFile2=new File("D:\\corejava");
String[] list=newFile2.list();
System.out.println("List of files :"+list.length);
for(int i =0;i<list.length;i++) {
	System.out.println(list[i]);
}
Path absolutePath1 = Paths.get("C:\\Users\\ASUS\\eclipse-workspace\\CorejavaPart1\\bin\\collectioframework");
Path absolutePath2 = Paths.get("C:");

// convert the absolute path to relative path
Path relativePath = absolutePath2.relativize(absolutePath1);
System.out.println("Relative Path: " + relativePath);


}
}
