package com.ilker.RestCrud.service;

import com.ilker.RestCrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findbyId(int id);
    Employee save(Employee employee);
    void remove(Integer id);
}
