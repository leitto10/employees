package com.empcorp.employees.repository;

import com.empcorp.employees.entity.Salary;
import org.springframework.data.repository.CrudRepository;

public interface SalaryRepository extends CrudRepository<Salary, Integer> {

}
