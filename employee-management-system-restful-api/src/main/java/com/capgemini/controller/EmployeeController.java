package com.capgemini.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.entity.Employee;
import com.capgemini.model.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public void postEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@PostMapping("/saveEmployees")
	public void postEmployees(@RequestBody List<Employee> employees) {
		employeeService.saveEmployees(employees);
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployees(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployesses() {
		return employeeService.getEmployees();
	}
	
	@PutMapping("/completeUpdateEmployee/{id}")
	public Employee putEmployees(@PathVariable Integer id,@RequestBody Employee employee) {
		return employeeService.updateEmployee(id,employee);
	}
	
	@PatchMapping("partialUpdateEmployee/{id}")
	public Employee patchEmployee(@PathVariable Integer id,@RequestBody Map<String, Object> fields) {
		return employeeService.updateEmployee(id,fields);
	}
	
	@DeleteMapping("deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
	}
	
}