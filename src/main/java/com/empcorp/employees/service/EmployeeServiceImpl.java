package com.empcorp.employees.service;

import com.empcorp.employees.dto.EmployeeDTO;
import com.empcorp.employees.entity.Employee;
import com.empcorp.employees.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> getEmployees() {
        List<EmployeeDTO> employees = new ArrayList<>();
        List<Employee> getEmployees = (List<Employee>) employeeRepository.findAll();

        for(Employee employee:getEmployees) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setEmpNo(employee.getEmpNo());
            employeeDTO.setGender(employee.getGender());
            employeeDTO.setBirthDate(employee.getBirthDate());
            employeeDTO.setFirstName(employee.getFirstName());
            employeeDTO.setLastName(employee.getLastName());
            employeeDTO.setHireDate(employee.getHireDate());
            employees.add(employeeDTO);
        }

        return employees;
    }
}
