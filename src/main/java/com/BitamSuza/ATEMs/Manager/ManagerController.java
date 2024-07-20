package com.BitamSuza.ATEMs.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/api/v2/Manager")
public class ManagerController {

    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping
    public List<Manager> getManagers() {
        return managerService.getManagers();
    }

    @PostMapping
    public void registerNewManager(@RequestBody Manager manager) {
        managerService.addNewManager(manager);
    }

    @DeleteMapping(path = "{managerId}")
    public void deleteManager(@PathVariable("managerId") long managerId) {
        managerService.deleteManager(managerId);
    }

    @PutMapping(path = "{managerId}")
    public void updateManager(@PathVariable("managerId") long managerId,
                              @RequestParam(required = false) String managerName,
                              @RequestParam(required = false) String email,
                              @RequestParam(required = false) String password) {
        managerService.updateManager(managerId, managerName, email, password);
    }
}
