package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AddressResponse;
import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

@Service
public class AddressService {

    private final AddressRepository repository;
    private final ModelMapper modelMapper;

    public AddressService(AddressRepository repository,
                          ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public List<AddressResponse> getAllAddresses() {
        return repository.findAll()
                .stream()
                .map(address -> modelMapper.map(address, AddressResponse.class))
                .collect(Collectors.toList());
    }

    public AddressResponse getAddressById(Long id) {

        Address address = repository.findById(id).orElse(null);

        if (address == null) {
            return null;
        }

        return modelMapper.map(address, AddressResponse.class);
    }

    public Address saveAddress(Address address) {
        return repository.save(address);
    }

    public Address updateAddress(Long id, Address address) {

        Address existingAddress = repository.findById(id).orElse(null);

        if (existingAddress == null) {
            return null;
        }

        modelMapper.map(address, existingAddress);

        return repository.save(existingAddress);
    }

    public void deleteAddress(Long id) {
        repository.deleteById(id);
    }
}