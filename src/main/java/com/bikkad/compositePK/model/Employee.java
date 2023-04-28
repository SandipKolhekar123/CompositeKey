package com.bikkad.compositePK.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EMPLOYEE_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EmployeePKId.class)
public class Employee {
	@Id
	private int employeeId;
	@Id
	private int deptId;
	
	private String name;
	
	private String email;
	
	private String phone;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", deptId=" + deptId + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
}
