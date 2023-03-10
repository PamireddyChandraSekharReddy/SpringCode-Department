package com.Department.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Department.Entity.Department;
import com.Department.Service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/Department")
public class DepartmentController {
	private DepartmentService departmentService;
@PostMapping	
	public ResponseEntity<Department> createDepartment(@RequestBody Department department){
		Department savedDepartment = departmentService.createDepartment(department);
		return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);	
	}
@GetMapping("/{Id}")
public ResponseEntity<Department>getDepartmentById(@PathVariable("Id") Long departmentId){
	Department department = departmentService.getDepartmentById(departmentId);
	return new ResponseEntity <>(department , HttpStatus.OK);	
}
@GetMapping("/All")
public ResponseEntity <List<Department>>getAllDepartment(){
	List<Department>department = departmentService.getAllDepartment();
	return new ResponseEntity<>(department,HttpStatus.OK);
}
@PutMapping("/{Id}")
public ResponseEntity<Department>updatedepartment(@PathVariable("Id")Long departmentId,@RequestBody Department department){
	department.setId(departmentId);
	Department updatedepartment =departmentService.updateDepartment(department);
	return new ResponseEntity<>(updatedepartment,HttpStatus.OK);
	
}

}
