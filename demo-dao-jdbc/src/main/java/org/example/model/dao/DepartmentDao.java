package org.example.model.dao;

import org.example.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department department);
    void upDate(Department department);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}