package com.empcorp.employees.api;

import com.empcorp.employees.dto.DepartmentDTO;
import com.empcorp.employees.dto.EmployeeDTO;
import com.empcorp.employees.service.DepartmentService;
import com.empcorp.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empcore")
public class EmpCoreAPI {

    @Autowired
    public EmployeeService employeeService;
    @Autowired
    public DepartmentService departmentService;

    @RequestMapping("/employees")
    public ResponseEntity<List<EmployeeDTO>> getEmployees() {
        List<EmployeeDTO> employees = employeeService.getEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @RequestMapping("/departments")
    public ResponseEntity<List<DepartmentDTO>> getDepartments() {
        List<DepartmentDTO> departments = departmentService.getDepartments();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    public ResponseEntity<List<String>> getSalaries() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
