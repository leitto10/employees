package com.empcorp.employees.service;

import com.empcorp.employees.dto.SalaryDTO;
import com.empcorp.employees.entity.Salary;
import com.empcorp.employees.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SalaryServiceImpl implements SalaryService {

    @Autowired
    public SalaryRepository salaryRepository;

    @Override
    public List<SalaryDTO> getSalaries() {
        List<SalaryDTO> salaries = new ArrayList<>();
        Iterable<Salary> getSalaries = salaryRepository.findAll();

        for (Salary salary : getSalaries) {
            SalaryDTO salaryDTO = new SalaryDTO();
            salaryDTO.setSalary(salary.getSalary());
            salaryDTO.setEmpNo(salary.getEmpNo());
            salaryDTO.setFromDate(salary.getFromDate());
            salaryDTO.setToDate(salary.getToDate());
            salaries.add(salaryDTO);
        }

        return salaries;
    }
}
