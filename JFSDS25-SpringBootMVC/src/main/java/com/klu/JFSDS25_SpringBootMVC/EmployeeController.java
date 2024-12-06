package com.klu.JFSDS25_SpringBootMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController
{
	@Autowired
	private EmployeeService empservice;
	
      @GetMapping("/add")
      public String addEmp()
      {
    	  
    	  return "add";
      }
      
      @PostMapping("/insertemp")
      public String insertemp(@RequestParam("eid") int eid, @RequestParam("ename") String ename,@RequestParam("esal") double esal)
      {
    	 Employee emp=new Employee();
    	 emp.setEid(eid);
    	 emp.setEname(ename);
    	 emp.setEsal(esal);
    	 empservice.insertEmployee(emp);
    	 return "insertsuccess";
    	 }
      
}
