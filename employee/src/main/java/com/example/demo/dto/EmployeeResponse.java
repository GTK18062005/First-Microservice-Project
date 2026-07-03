package com.example.demo.dto;

public class EmployeeResponse {

	private Long id;
    private String name;
    private String department;
    private double salary;
    private CourseResponse coursereponse;
    private AddressResponse address;
    public EmployeeResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

	public AddressResponse getAddress() {
		return address;
	}

	public void setAddress(AddressResponse address) {
		this.address = address;
	}

	public CourseResponse getCoursereponse() {
		return coursereponse;
	}

	public void setCoursereponse(CourseResponse coursereponse) {
		this.coursereponse = coursereponse;
	}
}