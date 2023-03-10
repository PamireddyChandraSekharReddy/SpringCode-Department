package com.Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Department.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>  {

}
