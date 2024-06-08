package com.debashis.notification.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private Address address;
    private String contactNumber;

}
