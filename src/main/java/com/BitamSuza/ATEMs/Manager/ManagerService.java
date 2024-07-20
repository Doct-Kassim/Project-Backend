package com.BitamSuza.ATEMs.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ManagerService {

    private final ManagerRepository managerRepository;

    @Autowired
    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public List<Manager> getManagers() {
        return managerRepository.findAll();
    }

    public void addNewManager(Manager manager) {
        // Logic to add a new manager
    }

    public void deleteManager(long managerId) {
        // Logic to delete a manager by ID
    }

    public void updateManager(long managerId, String managerName, String email, String password) {
        // Logic to update manager details
    }
}
