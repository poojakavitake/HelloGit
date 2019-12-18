package com.csi.jpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	
	private static SessionFactory factory;
public static void main(String[] args) {
	
	factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session =factory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee e1=new Employee();
	e1.setEmpName("ABC");
	e1.setEmpSalary(2500.0);
	session.save(e1);
	
	transaction.commit();
	
	List<Employee>emplist=session.createQuery("from Employee").list();
	emplist.forEach(emp->System.out.println(emp));
	System.out.println("");
}
}
