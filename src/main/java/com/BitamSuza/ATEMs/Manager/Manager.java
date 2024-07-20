package com.BitamSuza.ATEMs.Manager;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Manager")



public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ManagerId;
    public String MangerName;
    public  int ManagerContact;
    public  String Email;


    public Manager() {
    }

    public Manager(int managerId, String mangerName, int managerContact, String email) {
        ManagerId = managerId;
        MangerName = mangerName;
        ManagerContact = managerContact;
        Email = email;
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int managerId) {
        ManagerId = managerId;
    }

    public String getMangerName() {
        return MangerName;
    }

    public void setMangerName(String mangerName) {
        MangerName = mangerName;
    }

    public int getManagerContact() {
        return ManagerContact;
    }

    public void setManagerContact(int managerContact) {
        ManagerContact = managerContact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ManagerId=" + ManagerId +
                ", MangerName='" + MangerName + '\'' +
                ", ManagerContact=" + ManagerContact +
                ", Email='" + Email + '\'' +
                '}';
    }
}

