package com.Department.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Department.Entity.Department;
import com.Department.Repository.DepartmentRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
	
	private DepartmentRepository departmentRepository;

	@Override
	public Department createDepartment(Department department) {
		return  departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(long departmentId) {
		Optional<Department> OptionalDepartment = departmentRepository.findById(departmentId);
		return OptionalDepartment.get();
	}

	@Override
	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public Department updateDepartment(Department department) {
		Department existingDepartment=departmentRepository.findById(department.getId()).get();
		           existingDepartment.setDepartmentName(department.getDepartmentName());
		           existingDepartment.setDepartmentHead(department.getDepartmentHead());
		           existingDepartment.setDepartmentEmployee(department.getDepartmentEmployee());
		           existingDepartment.setGender(department.getGender());
		           existingDepartment.setEmployeeQualification(department.getEmployeeQualification());
		           Department updatedDepartment = departmentRepository.save(existingDepartment);          
		           return updatedDepartment;
	}

}
