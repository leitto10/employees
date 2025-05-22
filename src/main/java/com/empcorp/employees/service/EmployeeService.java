package com.empcorp.employees.service;

import com.empcorp.employees.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    public List<EmployeeDTO> getEmployees();
}
