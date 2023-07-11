package basic;

public class StudentEx {
	int rollno;
	String name;
	public StudentEx(){
		rollno=45;
		name="Yoga";
	}
	//2 parameter constructor
	public StudentEx(int no,String nm){
		this.rollno=no;
		name=nm;
	}//1 parameter constructor
	public StudentEx(String name) {
		rollno=21;
		
	}
	//copy constructor
	public StudentEx(StudentEx i) {
		rollno=i.rollno;
		name=i.name;
	}
	
	void display() {
		System.out.println("Student roll no: "+rollno);
		System.out.println("Student name : "+name);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEx s4=new StudentEx();
		s4.display();
		StudentEx s3=new StudentEx("PUJA");
		
		StudentEx s2=new StudentEx(87," Uma");
				s2.display();
		StudentEx i=new StudentEx();
	i.rollno=275;
	i.name="Pujitha";
	i.display();

	}

}
