package com.jpa.hibernatejpa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      JPACrudOperation jpa=new JPACrudOperation();
//      EmployeeEx e= new EmployeeEx(1, "Pujitha", "IT");
//      EmployeeEx e1= new EmployeeEx(2, "charan", "Dev");
//      EmployeeEx e2= new EmployeeEx(3, "Chandhu", "Testing");
//      jpa.insertRecord(e2);
//      jpa.insertRecord(e);
//      jpa.insertRecord(e1);
//      jpa.deleteRecord(3);
//      jpa.findRecordById(1);
      jpa.updateRecordById(1, "Suhail","IT");
      //  jpa.RetriveAll();
    }
}
