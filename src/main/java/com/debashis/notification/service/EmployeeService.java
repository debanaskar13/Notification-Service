package com.debashis.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.debashis.notification.model.Employee;
import com.debashis.notification.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAllEmployees() {
        return this.repository.findAll();
    }

    public Employee createNewEmployee(Employee employeeRequest) {
        return this.repository.addEmployee(employeeRequest);
    }

}
