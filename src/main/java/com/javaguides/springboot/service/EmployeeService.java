package com.javaguides.springboot.service;

import java.util.List;

import com.javaguides.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployees(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeId(long id);

}
