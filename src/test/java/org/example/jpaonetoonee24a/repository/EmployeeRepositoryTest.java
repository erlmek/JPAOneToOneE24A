package org.example.jpaonetoonee24a.repository;

import org.example.jpaonetoonee24a.model.Employee;
import org.hibernate.JDBCException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    void testAtLeastOneJens() {
        List<Employee> lst = employeeRepository.findEmployeeByName("jens");
        assertTrue(lst.size() > 0);
    }

    @Test
    void testDeleteUser() {
        List<Employee> lst = employeeRepository.findEmployeeByName("jens");
        Employee emp1 = lst.get(0);
        assertEquals("jens", emp1.getName());
        //userRepository.delete(emp1.getUser());
        assertThrows(Exception.class, () -> employeeRepository.delete(emp1));

    }



}