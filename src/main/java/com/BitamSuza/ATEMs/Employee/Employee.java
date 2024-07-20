package com.BitamSuza.ATEMs.Employee;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int EmployeeId;
    private   String EmployeeName;
    private String Email;
    private int Contact;
    private String Password;

    public Employee(){
    }

    public Employee(int employeeId, String employeeName, String email, int contact, String password) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        Email = email;
        Contact = contact;
        Password = password;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", Email='" + Email + '\'' +
                ", Contact=" + Contact +
                ", Password='" + Password + '\'' +
                '}';
    }

    public Object EmployeeName() {
        return EmployeeName;
    }

    public Employee save(Employee employee) {
        return employee;
    }
}
