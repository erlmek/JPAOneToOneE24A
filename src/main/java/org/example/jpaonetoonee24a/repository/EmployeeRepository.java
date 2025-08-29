package org.example.jpaonetoonee24a.repository;

import org.example.jpaonetoonee24a.model.Employee;
import org.example.jpaonetoonee24a.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByGender(Gender gender);
    List<Employee> findEmployeeByName(String name);

}
