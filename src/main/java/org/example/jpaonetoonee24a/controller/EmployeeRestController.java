package org.example.jpaonetoonee24a.controller;

import org.example.jpaonetoonee24a.model.Employee;
import org.example.jpaonetoonee24a.model.User;
import org.example.jpaonetoonee24a.repository.EmployeeRepository;
import org.example.jpaonetoonee24a.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;


    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        User usr = employee.getUser();
        usr = userRepository.save(usr);
        employee.setUser(usr);
        return employeeRepository.save(employee);
    }


}
