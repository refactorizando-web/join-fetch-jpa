package com.refactorizando.example.joinfetch;

import com.refactorizando.example.joinfetch.entity.Department;
import com.refactorizando.example.joinfetch.entity.Employee;
import com.refactorizando.example.joinfetch.repository.DepartmentRepository;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoinfetchApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(JoinfetchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department department  = new Department();
		department.setName("IT");

		Employee employee = new Employee();
		employee.setName("Noel");
		employee.setSurname("Rodríguez");

		department.setEmployees(Arrays.asList(employee));

		departmentRepository.save(department);

	}
}
