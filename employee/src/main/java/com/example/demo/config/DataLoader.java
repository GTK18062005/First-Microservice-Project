package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    public DataLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        if (repository.count() == 0) {

        	Employee e1 = new Employee();
        	e1.setName("Tharun");
        	e1.setDepartment("IT");
        	e1.setSalary(100000);
        	e1.setAddressId(1L);

        	repository.save(e1);
        	Employee e2 = new Employee();
        	e2.setName("Rahul");
        	e2.setDepartment("HR");
        	e2.setSalary(85000);
        	e2.setAddressId(2L);

        	repository.save(e2);
        	Employee e3 = new Employee();
        	e3.setName("Priya");
        	e3.setDepartment("Finance");
        	e3.setSalary(90000);
        	e3.setAddressId(3L);

        	repository.save(e3);

            System.out.println("Default employees inserted.");
        }
    }
}