package me.zakariae.essaiydy.Microservicesproject;

import me.zakariae.essaiydy.Microservicesproject.entity.Employee;
import me.zakariae.essaiydy.Microservicesproject.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MicroservicesProjectApplication implements CommandLineRunner {



	private final EmployeeRepository employeeRepository;

	public MicroservicesProjectApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {



		List<String> names = List.of("zakariae", "mohammed", "Hamza");

		names.forEach(name->{
			Employee employee = new Employee();
			employee.setEmailId(name+"@gmail.com");
			employee.setFirstName(name);
			employee.setLastName("Essaiydy");
			employee.setDepartment("It");

			employeeRepository.save(employee);

		});









	}

}
