package com.javaweb.controller;

import com.javaweb.model.Department;
import com.javaweb.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Lấy tất cả các phòng ban
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Thêm mới một phòng ban
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    // Lấy thông tin phòng ban theo ID 
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return departmentRepository.findOne(id);  
    }

    // Cập nhật thông tin phòng ban
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable int id, @RequestBody Department departmentDetails) {
        Department department = departmentRepository.findOne(id);  
        if (department != null) {
            department.setName(departmentDetails.getName());
            return departmentRepository.save(department);
        }
        return null;
    }

    // Xóa phòng ban theo ID 
    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable int id) {
        departmentRepository.delete(id);  
    }
}
