package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.controllerfignclient.AddressFeignclient;
import com.example.demo.controllerfignclient.Coursefignclient;
import com.example.demo.dto.AddressResponse;
import com.example.demo.dto.CourseResponse;
import com.example.demo.dto.EmployeeResponse;
import com.example.demo.entity.Employee;
import com.example.demo.repository.*;

@Service
public class EmployeeService {

	private final EmployeeRepository repository;
    private final ModelMapper modelMapper;
    private final RestTemplate restTemplate;
   @Autowired
   AddressFeignclient feign;
   @Autowired
   Coursefignclient courseclient;
    public EmployeeService(EmployeeRepository repository,
                           ModelMapper modelMapper,
                           RestTemplateBuilder restremplatebuilder, @Value("${address.url}") String baseurladdress) {

        this.repository = repository;
        this.modelMapper = modelMapper;
        this.restTemplate = restremplatebuilder.rootUri(baseurladdress).build();
    }

    public List<EmployeeResponse> getAllEmployees() {

        List<Employee> employees = repository.findAll();

        List<EmployeeResponse> responses = new ArrayList<>();

        for (Employee employee : employees) {

            EmployeeResponse response =
                    modelMapper.map(employee, EmployeeResponse.class);
            AddressResponse address=feign.getaddress(response.getId());
            CourseResponse coursee=courseclient.getCourse(response.getId());
            response.setCoursereponse(coursee);
            response.setAddress(address);
            responses.add(response);
        }

        return responses;
    }
    public EmployeeResponse getEmployeeById(Long id) {

        Employee employee = repository.findById(id).orElse(null);

        if (employee == null) {
            return null;
        }

        EmployeeResponse response =
                modelMapper.map(employee, EmployeeResponse.class);

        AddressResponse address =feign.getaddress(id);
        CourseResponse coursee=courseclient.getCourse(response.getId());
        response.setCoursereponse(coursee);

        response.setAddress(address);

        return response;
    }
    

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee employee) {

        Employee existingEmployee = repository.findById(id).orElse(null);

        if (existingEmployee == null) {
            return null;
        }

        modelMapper.map(employee, existingEmployee);	
        return repository.save(existingEmployee);
    }
}