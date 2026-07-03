package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.AddressResponse;
import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AddressResponse>> getAllAddresses() {
        return ResponseEntity.ok(service.getAllAddresses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressResponse> getAddress(@PathVariable Long id) {

        AddressResponse address = service.getAddressById(id);

        if (address == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(address);
    }

    @PostMapping
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {

        return new ResponseEntity<>(service.saveAddress(address), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id,
                                                 @RequestBody Address address) {

        Address updatedAddress = service.updateAddress(id, address);

        if (updatedAddress == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedAddress);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable Long id) {

        AddressResponse address = service.getAddressById(id);

        if (address == null) {
            return ResponseEntity.notFound().build();
        }

        service.deleteAddress(id);

        return ResponseEntity.ok("Address deleted successfully");
    }
}