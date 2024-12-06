package com.klu.JFSDS25_SpringBootMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	@Transactional
	public String insertEmployee(Employee emp)
	{
		employeeRepository.save(emp);
		return "Employee Inserted Successfully";
	}

}
