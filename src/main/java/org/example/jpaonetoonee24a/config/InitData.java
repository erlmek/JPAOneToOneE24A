package org.example.jpaonetoonee24a.config;

import org.example.jpaonetoonee24a.model.Employee;
import org.example.jpaonetoonee24a.model.Gender;
import org.example.jpaonetoonee24a.model.User;
import org.example.jpaonetoonee24a.repository.EmployeeRepository;
import org.example.jpaonetoonee24a.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        User us1 = new User();
        us1.setEmail("erik@aol.com");
        us1.setPassword("afdasdf");
        userRepository.save(us1);

        Employee emp1 = new Employee();
        emp1.setBorn(LocalDateTime.of(1990, 5, 10, 16, 10, 12));
        emp1.setGender(Gender.FEMALE);
        emp1.setName("jens");
        emp1.setUser(us1);
        employeeRepository.save(emp1);


    }
}
