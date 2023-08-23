package namequeryex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;                                                            

public class DepartmentMain {
	public static void main( String[] args ) {	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    Session s=sf.openSession(); 
	 Transaction t=s.beginTransaction();
//	 Department d =new Department(1, "IT", "Delhi");
//	 s.save(d);
//	 Department d1 =new Department(2, "Testing", "Bangalore");
//	 s.save(d1);
//	 Department d2 =new Department(3, "Sales", "Warangal");
//	 s.save(d2);
//	 Department d3 =new Department(4, "HR", "Bangalore");
//	 s.save(d3);
//	 Department d4 =new Department(5, "Maintainence", "Anantapur");
//	 s.save(d4);
//	 t.commit();
//	 System.out.println("Record Inserted");
//	 Query q= s.getNamedQuery("findDepartmentByName");
//	 q.setString("Dname", "IT");
//	 Query q2 = s.createQuery("select count(id),dlocation from Department group by dlocation having count(id)>1");
//	 List<Department> f=q.list();
//	 Iterator<Department> itr=f.iterator();
//	 while(itr.hasNext()) {
//		 Department d5=itr.next();
//		 System.out.println(d5);

	 Query q1 = s.createQuery("select count(*) from Department");
     System.out.println("Count : "+q1.list().get(0));
     Query q2= s.createQuery("select count(Id),Dname from Department group by Dname");
     System.out.println("Count : "+q2.list().get(0));
     List<Object[]> list = q2.list();
     for(Object[] arr: list)
     {
     	System.out.println(Arrays.toString(arr));
     }
     //	 }
//	 Query q2 = s.createSQLQuery("select count(Id),Dlocation from Department group by Dlocation having count(Id)>0");
//
//	 //	 Query q1=s.createQuery("select count(distinct dname from Department");
//	 List<Department> k=q2.list();
//	 System.out.println("Count:"+q2.list().get(0));
//	 for(int i=0;i<k.size();i++) {
//		 System.out.println(k.get(i).getDname());
//	 }
//     
     
//     Criteria c = s.createCriteria(Department.class);
//     c.add(Restrictions.eq("Dname", "IT")); 
//     List<Department> dep = c.list();     
//     for(Department d : dep) {
//      System.out.println(d);
//     }
  
     
     
//     Criteria c1 = s.createCriteria(Department.class);
//     c1.addOrder(Order.asc("Dname"));
//	 
//	 List<Department> dep = c1.list();
//   
//      for(Department d : dep) {
//       System.out.println(d);
     
     
     Criteria cr = s.createCriteria(Department.class);

      cr.setProjection(Projections.rowCount());
      List rowCount = cr.list();
      System.out.println("Total Count : " + rowCount.get(0) );
      
      Criteria crit = s.createCriteria(Department.class);
      ProjectionList projList = Projections.projectionList();
     // projList.add(Projections.max("id"));
     //projList.add(Projections.min("id"));
       //projList.add(Projections.avg("price"));
      projList.add(Projections.countDistinct("Dname"));
      
      crit.setProjection(projList);
      List results=crit.list();
      System.out.println(results);
      
   }
	}