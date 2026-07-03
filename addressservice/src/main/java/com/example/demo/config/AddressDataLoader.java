package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

@Component
public class AddressDataLoader implements CommandLineRunner {

    private final AddressRepository repository;

    public AddressDataLoader(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        if (repository.count() == 0) {

            repository.save(new Address("Hyderabad", "Telangana", 500001));
            repository.save(new Address("Bengaluru", "Karnataka", 560001));
            repository.save(new Address("Chennai", "Tamil Nadu", 600001));

            System.out.println("Default addresses inserted.");
        }
    }
}