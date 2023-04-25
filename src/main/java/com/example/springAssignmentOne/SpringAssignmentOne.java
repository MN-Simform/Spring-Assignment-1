package com.example.springAssignmentOne;

import com.example.springAssignmentOne.repository.EmployeeJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAssignmentOne implements CommandLineRunner {

	@Autowired
	EmployeeJdbc employeeJdbc;

	public static void main(String[] args) {
		SpringApplication.run(SpringAssignmentOne.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("All Records Of Employee : " + employeeJdbc.dispAllEmp());
	}
}
