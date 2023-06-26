package me.zakariae.essaiydy.Microservicesproject.controller;

import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import me.zakariae.essaiydy.Microservicesproject.services.IServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {


    @Autowired
    private IServiceEmployee serviceEmployee;




    @GetMapping
    @RequestMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return serviceEmployee.getEmployeeById(Long.valueOf(id));
    }



}
