package basic;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i=0;
//while(i<5) {
//	if(i==2) {
//		break;
//	}
//	System.out.println(i++);
//}
//int j=0;
//while(j<5) {
//	if(j==2) {
//		j++;
//		continue;
//	}
//	System.out.println(j++);
//	}
//	}
		int a, b;
	       Scanner s=new Scanner(System.in); 
	       System.out.println("Enter First Number: ");
	       a=Integer.parseInt(s.nextLine());
	       System.out.println("Enter Second Number: ");
	       b=Integer.parseInt(s.nextLine());
	       
	       while(true){
	          System.out.println("Select an Option...");
	          System.out.println("1. Add");
	          System.out.println("2. Subtract");
	          System.out.println("3. Multiply");
	          System.out.println("4. Divide");
	          System.out.println("5. Exit");
	          System.out.println("Type your selection here: ");
	   
	         // String choice=s.nextLine();
	         // int choice=s.nextInt();
	          char choice=s.next().charAt(0);
	          switch(choice){
	              case '1':
	                  System.out.println("Sum = "+(a+b));
	                  break;
	              case '2':
	                  System.out.println("Difference = "+(a-b));
	                  break;
	              case '3':
	                  System.out.println("Product = "+(a*b));
	                  break;
	              case '4':
	                  System.out.println("Division = "+(a/b));
	                  break;
	              case '5':
	                  System.exit(0);
	              default:
	                  System.out.println("Wrong Choice!!");
	                  break;
	                      
	                
	          }//switch
	       }//while
	}
}
