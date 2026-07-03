package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Course;
import com.example.demo.Service.Courseservic;

@RestController
@RequestMapping("/course")
public class coursecontroller {
	@Autowired
	Courseservic courseservic;
@GetMapping
public List<Course> getallcourses() {
    return courseservic.getallcourses();
}
@GetMapping("/{id}")
public Course getcoursebyid(@PathVariable("id") long id)
{
	return courseservic.getcoursebyid(id);
	
}
@PostMapping
public String addcourses(@RequestBody Course course)
{
	courseservic.addcourse(course);
	return "added sucessfully";
	
}
{
	
}
}
