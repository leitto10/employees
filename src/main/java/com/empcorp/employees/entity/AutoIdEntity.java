package com.empcorp.employees.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AutoIdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer empNo;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }
}
