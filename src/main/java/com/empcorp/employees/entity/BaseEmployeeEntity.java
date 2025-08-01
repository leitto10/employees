package com.empcorp.employees.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEmployeeEntity {
    @Id
    @Column(name = "emp_no", nullable = false)
    protected Integer empNo;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

}
