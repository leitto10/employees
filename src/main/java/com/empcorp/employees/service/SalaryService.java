package com.empcorp.employees.service;

import com.empcorp.employees.dto.SalaryDTO;

import java.util.List;

public interface SalaryService {

    List<SalaryDTO> getSalaries();
}
