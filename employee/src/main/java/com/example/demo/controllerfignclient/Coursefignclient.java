package com.example.demo.controllerfignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.CourseResponse;

@FeignClient(name = "corseclient",url = "${course.url}")
public interface Coursefignclient {
	@GetMapping("/{id}")
	CourseResponse getCourse(@PathVariable long id);
}
