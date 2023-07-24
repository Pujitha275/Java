package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
private	int age;
private String name;
public Person(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
public class SerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person p=new Person(21, "Pujitha");
FileOutputStream fos=new FileOutputStream("List of courses.txt");// to write the data into a file
ObjectOutputStream oos=new ObjectOutputStream(fos);//to convert obj into a byte stream
oos.writeObject(p);
fos.close();
oos.close();
System.out.println("Serialization successful");


//deserialization
FileInputStream fis=new FileInputStream("List of courses.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Person p1=(Person)ois.readObject();
	ois.close();
	fis.close();
	System.out.println("Deserialization Successfull");
	System.out.println(p1.getAge());
	System.out.println(p1.getName());
	}
	

}
