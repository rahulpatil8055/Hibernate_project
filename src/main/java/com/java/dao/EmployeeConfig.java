package com.java.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.java.entity.Employee;

public class EmployeeConfig {
	public static void main(String[]args) {
		Configuration config=new Configuration();
		SessionFactory factory=config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
//		Transaction tc= session.beginTransaction();
//		Employee e1= session.find(Employee.class,21);
		
//		System.out.println("Id :"+e1.getId());
//		System.out.println("Name : "+e1.getName());
//		System.out.println("Salary : "+e1.getSalary());
//		
		List<Object[]> resultList = session.createNativeQuery("SELECT * FROM Employee").getResultList();
		for (Object[] row : resultList)
		{
		    int id = (int) row[0];	
		    int salary = (int) row[1];
		    String name = (String) row[2];
		
		    System.out.println("ID: " + id);    
		    System.out.println("Salary: " + salary);
		    System.out.println("Name: " + name);
		    
		}

		session.close();
		
//		e1.setId(23);
//		e1.setName("rahul");
//		e1.setSalary(45000);
//		session.delete(e1);
//		tc.commit();
		
//	Employee e1=session.find(Employee.class, 21);
//	e1.setName("Rahul");
//	session.save(e1);
//	session.beginTransaction().commit();
		
	}
}