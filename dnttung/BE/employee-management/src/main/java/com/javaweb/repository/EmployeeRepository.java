package com.javaweb.repository;

import com.javaweb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByNameContaining(String name);
    List<Employee> findByDepartmentId(int departmentId);
}
