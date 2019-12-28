package com.csi.dao;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeDao {
	public void saveEmployee(Employee employee);
	public List<Employee> showAllEmployees();
	public void updateEmployee(int empId,String empName,int empSalary);
	public void deleteEmployee(Employee employee);


}
