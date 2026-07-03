package com.example.demo.dto;

public class CourseResponse {
	private long id;
	private String coursename;
	private long price;
	private int duration_months;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getDuration_months() {
		return duration_months;
	}
	public void setDuration_months(int duration_months) {
		this.duration_months = duration_months;
	}
	public long getId() {
	    return id;
	}

	public void setId(long id) {
	    this.id = id;
	}
}
