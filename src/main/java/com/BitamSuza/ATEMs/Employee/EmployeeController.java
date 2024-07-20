package com.BitamSuza.ATEMs.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/Employee")

public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") long employeeId) {
        employeeService.deleteManager(employeeId);
    }

    @PutMapping(path = "{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") long employeeId,
                               @RequestParam(required = false) String employeeName,
                               @RequestParam(required = false) String email,
                               @RequestParam(required = false) int contact,
                               @RequestParam(required = false) String password){

        employeeService.updateEmployee(employeeId, employeeName,contact, email, password);
    }
}
