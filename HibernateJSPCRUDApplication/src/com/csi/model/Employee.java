/**
 * 
 */
package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author SUNNY
 *
 */
@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	
	private int empId;
	private String empName;
	private int empSalary;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empSalary
	 */
	public int getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	

}
