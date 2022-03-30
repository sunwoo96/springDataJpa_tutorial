package com.sungwoo.test;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeeByLastNameContaining(String str);
    List<Employee> findEmployeeByFirstNameContaining(String str);
}
