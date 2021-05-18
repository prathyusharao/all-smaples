package com.sampleproject.springbootdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sampleproject.springbootdemo.entity.Employee;


public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> saveEmployees(List<Employee> employees);

	Employee updateEmployee(Employee employee);

	String deleteEmployee(int employee_Id);

	String deleteAllEmployees();

	void deleteSomeEmployees(Integer[] ids);





	
	
}

