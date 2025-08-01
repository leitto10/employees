package com.empcorp.employees.repository;

import com.empcorp.employees.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
}
