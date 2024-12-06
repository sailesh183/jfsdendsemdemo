package com.klu.JFSDS25_SpringBootMVC;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>
{
}
