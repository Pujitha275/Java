package com.hibernateproj;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf=new Configuration().configure().buildSessionFactory();
       
    		  
              Session s=sf.openSession(); //database operations
    		 Transaction t=s.beginTransaction();//to run multiple operations    		  
    		//Student s1=new Student();
    		Student s2=new Student();
    		//Student s3=new Student();
    		//s1.setName("pooji");
    		s2.setName("Bittu");
    		//s3.setName("Charan");
    		//s.save(s1);
    		s.save(s2);
    		//s.save(s3);
    		t.commit();
    		System.out.println("Inserted");
    		sf.close();
//    		Query query = s.createQuery("from Student");
//            List<Student> arr = query.list();
            
//            for(int i=0;i<arr.size();i++)
//            {
//            	System.out.println("Id :"+arr.get(i).getSid() +"\nName : "+arr.get(i).getSname());
//            }
            
//            
//           for(Student e : arr)
//            {
//            	System.out.println("Id : "+e.getId()+"\nName : "+e.getName());
//            }
////        

    }
}
