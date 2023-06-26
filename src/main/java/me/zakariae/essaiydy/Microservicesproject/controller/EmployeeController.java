package me.zakariae.essaiydy.Microservicesproject.controller;

import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import me.zakariae.essaiydy.Microservicesproject.services.IServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {


    @Autowired
    private IServiceEmployee serviceEmployee;




    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return serviceEmployee.getEmployeeById(Long.valueOf(id));
    }



    @GetMapping
    public List<Employee> getEmployees(){
        return serviceEmployee.getEmployees();
    }



    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){

        return serviceEmployee.saveEmployee(employee);

    }


    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return serviceEmployee.updateEmployee(employee);
    }


    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id){
        serviceEmployee.deleteEmployeeById(Long.valueOf(id));
    }













}
