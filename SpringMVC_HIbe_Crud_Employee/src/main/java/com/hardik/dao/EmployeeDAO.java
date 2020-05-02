package com.hardik.dao;

import java.util.List;

import com.hardik.model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public void removeEmployee(int id);
	
	public List<Employee> listEmployees();

}
