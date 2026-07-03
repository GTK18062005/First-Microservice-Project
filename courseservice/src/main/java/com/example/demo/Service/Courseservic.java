package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.Repo.courserepo;

@Service
public class Courseservic {
	private final  courserepo reporiso;
	
	
	public Courseservic(courserepo reporiso)
	{
		this.reporiso=reporiso;
	}
	public Course addcourse(Course cour)
	{
		return reporiso.save(cour);
	}
	public Course getcoursebyid(long id)
	{
		Course cor=reporiso.findById(id).orElse(null);
		if(cor==null)
		{
			return null;
		}
		return cor;
		
	}
	public List<Course> getallcourses() {
	    return reporiso.findAll();
	}

}
