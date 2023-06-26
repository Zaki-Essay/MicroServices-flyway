package me.zakariae.essaiydy.Microservicesproject.services;


import lombok.AllArgsConstructor;
import lombok.Data;
import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import me.zakariae.essaiydy.Microservicesproject.repository.EmployeeRepository;
import org.springframework.stereotype.Service;


public interface IServiceEmployee {


    public Employee saveEmployee(Employee employee);


    public Employee updateEmployee(Employee employee);

    public void deleteEmployeeById(Long id);


    public Employee getEmployeeById(Long id);




}
