package com.var.restcourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.var.restcourse.model.Course;

@Service
public class CourseImpl implements CourseService {
	
	Map<Long,Course> courses=new HashMap<>();
	long courseId=1;
	
	public CourseImpl() {
		init();
	}

	private void init() {
		Course course=new Course();
		course.setId(courseId);
		course.setName("Varun Singh");
		course.setTaughtBy("Shikha Singh");
		course.setPrice("1000");
		course.setRate(5);
		
		courses.put(course.getId(), course);
	}

	@Override
	public List<Course> getCourses() {
		Collection<Course> course = courses.values();
		return new ArrayList<Course>(course);
	}

	@Override
	public Course getCourse(Long id) {
		Course course=courses.get(id);
		return course;
	}

	@Override
	public Response createCourse(Course course) {
		course.setId(++courseId);
		courses.put(course.getId(), course);
		return Response.ok(course).build();
		
	}

	@Override
	public Response updateCourse(Course course) {
		Course c=courses.get(course.getId());
		
		Response response;
		if(c !=null) {
			courses.put(c.getId(), course);
			response=Response.ok(course).build();
		}else {
			response=Response.notModified().build();
		}
		return response;
	}

	@Override
	public Response deleteCourse(Long id) {
		Course c=courses.get(id);
		Response response;
		if(c!=null) {
			courses.remove(id);
			response=Response.ok().build();
			
		}else {
			response=Response.notModified().build();
		}
		return response;
	}

}
