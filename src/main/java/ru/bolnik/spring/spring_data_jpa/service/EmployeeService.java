package ru.bolnik.spring.spring_data_jpa.service;

import ru.bolnik.spring.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> findAllByName(String name);
}
