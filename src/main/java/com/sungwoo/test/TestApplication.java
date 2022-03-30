package com.sungwoo.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}


	@Bean
	public CommandLineRunner run(EmployeeRepository repository) throws Exception{
		return (args -> {
//			insertJavaAdvocates(repository);
//			System.out.println(repository.findAll());

			System.out.println(repository.findEmployeeByLastNameContaining(" "));
			System.out.println(repository.findEmployeeByFirstNameContaining("Kim"));
		});
	}
	private void insertJavaAdvocates(EmployeeRepository repository) {
		repository.save(new Employee("Daia","Abo Sheasha"));
		repository.save(new Employee("Trisha","Gee"));
		repository.save(new Employee("Jeon","sungwoo"));
		repository.save(new Employee("Kim","suji"));
	}

}
