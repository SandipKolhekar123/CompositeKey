package com.bikkad.compositePK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkad.compositePK.model.Employee;
import com.bikkad.compositePK.model.EmployeePKId;

@Repository
public interface EmpRepository extends JpaRepository<Employee, EmployeePKId>{

}
