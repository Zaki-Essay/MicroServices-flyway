package me.zakariae.essaiydy.Microservicesproject.TestData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import me.zakariae.essaiydy.Microservicesproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@Slf4j
public class Insertion  {


    private EmployeeRepository employeeRepository;


    @Autowired
    public Insertion(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }




}
