package com.Department.Service;

import java.util.List;

import com.Department.Entity.Department;

public interface DepartmentService {
	//create a method to post mapping//
	Department createDepartment(Department department);
	//create a method to GetById//
	Department getDepartmentById(long departmentId);
	//create a method to getAll//
	List<Department>getAllDepartment();
	//create a method to update//
	Department updateDepartment(Department department);
}
