package com.payroll.Repository;

import com.payroll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
