package com.javaweb.service;

import com.javaweb.model.Employee;
import java.util.List;

public interface EmployeeService {

    // Lưu một nhân viên mới hoặc cập nhật thông tin nhân viên
    Employee saveEmployee(Employee employee);

    // Lấy danh sách tất cả các nhân viên
    List<Employee> getAllEmployees();

    // Lấy thông tin nhân viên theo ID
    Employee getEmployeeById(int id);

    // Xóa nhân viên theo ID
    void deleteEmployee(int id);
}
