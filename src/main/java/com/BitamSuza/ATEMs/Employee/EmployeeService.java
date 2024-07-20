package com.BitamSuza.ATEMs.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private  final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;

    }

    public void deleteEmployee(Long Employeeid){

    }

    public void deleteEmployee(long employeeId) {
    }

    public void updateEmployee(long employeeId, String employeeName, int contact, String email, String password) {
    }

    public Employee createEmployee(Employee employee) {
        return employee.save(employee);
    }

    public List<Employee> getEmployee() {
        return getEmployee();
    }

    public void deleteManager(long employeeId) {
    }
}





