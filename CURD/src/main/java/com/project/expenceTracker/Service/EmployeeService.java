package com.project.expenceTracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.expenceTracker.model.Employee;
import com.project.expenceTracker.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee)
	{
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

}