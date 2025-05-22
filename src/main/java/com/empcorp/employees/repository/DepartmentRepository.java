package com.empcorp.employees.repository;

import com.empcorp.employees.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, String> {
}
