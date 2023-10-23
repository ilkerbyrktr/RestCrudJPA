package com.ilker.RestCrud.implementation;

import com.ilker.RestCrud.dao.EmployeeRepository;
import com.ilker.RestCrud.entity.Employee;
import com.ilker.RestCrud.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findbyId(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        Employee employee = byId.get();
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override

    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }
}
