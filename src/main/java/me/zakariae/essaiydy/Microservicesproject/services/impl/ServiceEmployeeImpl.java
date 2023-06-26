package me.zakariae.essaiydy.Microservicesproject.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import me.zakariae.essaiydy.Microservicesproject.repository.EmployeeRepository;
import me.zakariae.essaiydy.Microservicesproject.services.IServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceEmployeeImpl implements IServiceEmployee {



    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.findById(id).ifPresent(employee -> employeeRepository.delete(employee));
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }


}
