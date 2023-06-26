package me.zakariae.essaiydy.Microservicesproject.repository;

import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
