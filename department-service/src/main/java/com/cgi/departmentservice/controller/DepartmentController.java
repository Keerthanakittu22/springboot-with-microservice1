package com.cgi.departmentservice.controller;

 
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.departmentservice.entity.Department;
import com.cgi.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
		
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department)
	{
		  System.out.println("inside the save department method");
		 return this.departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long id)
	{
		   return this.departmentService.getDepartmentById(id);
		   
	}
	
}
