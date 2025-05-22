package com.empcorp.employees.service;

import com.empcorp.employees.dto.DepartmentDTO;
import com.empcorp.employees.entity.Department;
import com.empcorp.employees.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    public DepartmentRepository departmentRepository;

    public List<DepartmentDTO> getDepartments() {
        List<DepartmentDTO> departments = new ArrayList<>();
        List<Department> getDepartments = (List<Department>) departmentRepository.findAll();

        for(Department department: getDepartments) {
            DepartmentDTO deptDTO = new DepartmentDTO();
            deptDTO.setDeptNo(department.getDeptNo());
            deptDTO.setDeptName(department.getDeptName());
            departments.add(deptDTO);
        }

        return departments;
    }
}
