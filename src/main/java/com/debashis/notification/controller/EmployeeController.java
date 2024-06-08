package com.debashis.notification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.debashis.notification.model.Employee;
import com.debashis.notification.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return this.service.findAllEmployees();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employeeRequest) {
        return this.service.createNewEmployee(employeeRequest);
    }

}
