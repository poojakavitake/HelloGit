/**
 * 
 */
package com.csi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.search.annotations.Factory;

import com.csi.model.Employee;

/**
 * @author SUNNY
 *
 */
public class EmployeeDAOimpl implements EmployeeDAO {
	
	private static SessionFactory factory;

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
		
	}

	@Override
	public List<Employee> showAllEmployees() {
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		List<Employee>employeeList=new ArrayList();
		Query query=session.createQuery("From Employee");
		employeeList=query.list();
		
		return employeeList;
	}

	@Override
	public void updateEmployee(int empId, String empName, int empSalary) {
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee empdetails=(Employee)session.load(Employee.class, empId);
		empdetails.setEmpName(empName);
		empdetails.setEmpSalary(empSalary);
		session.update(empdetails);
		tx.commit();
		session.close();
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(employee);
		tx.commit();
		session.close();
		
		
		
		
	}

}
