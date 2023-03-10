package com.Department.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name ="Department")
public class Department {
	@jakarta.persistence.Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long Id;
	private String DepartmentName;
	private String DepartmentHead;
	private String DepartmentEmployee;
	private String Gender;
	private String EmployeeQualification;
	
	public Department(Long id, String departmentName, String departmentHead, String departmentEmployee, String gender,
			String employeeQualification) {
		super();
		Id = id;
		DepartmentName = departmentName;
		DepartmentHead = departmentHead;
		DepartmentEmployee = departmentEmployee;
		Gender = gender;
		EmployeeQualification = employeeQualification;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getDepartmentHead() {
		return DepartmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		DepartmentHead = departmentHead;
	}

	public String getDepartmentEmployee() {
		return DepartmentEmployee;
	}

	public void setDepartmentEmployee(String departmentEmployee) {
		DepartmentEmployee = departmentEmployee;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmployeeQualification() {
		return EmployeeQualification;
	}

	public void setEmployeeQualification(String employeeQualification) {
		EmployeeQualification = employeeQualification;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", DepartmentName=" + DepartmentName + ", DepartmentHead=" + DepartmentHead
				+ ", DepartmentEmployee=" + DepartmentEmployee + ", Gender=" + Gender + ", EmployeeQualification="
				+ EmployeeQualification + "]";
	}
	
	
	

}
