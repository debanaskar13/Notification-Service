package com.debashis.notification.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.debashis.notification.model.Address;
import com.debashis.notification.model.Employee;

@Component
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    EmployeeRepository() {
        for (int i = 0; i < 2; i++) {
            Employee employee = new Employee();
            employee.setEmployeeId(i);
            employee.setEmployeeName("Employee-" + i);
            employee.setEmployeeEmail("Email-" + i + "@gmail.com");
            employee.setContactNumber("+91" + (1000000000 + new Random().nextLong(999999999)));

            Address address = new Address();
            address.setId(i);
            address.setHouseNumber("House-" + i);
            address.setPincode(String.valueOf(100000 + new Random().nextLong(99999)));
            address.setCountry("Country-" + i);

            employee.setAddress(address);

            employees.add(employee);
        }
    }

    public List<Employee> findAll() {
        return employees;

    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

}
