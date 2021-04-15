package com.var.restcourse;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.var.restcourse.model.Course;

@Path("/courseservices")
public interface CourseService {
	
	
	@Path("/courses")
	@GET
	public List<Course> getCourses();
	
	@Path("/courses/{id}")
	@GET
	public Course getCourse(@PathParam("id") Long id);
	
	@Path("/createcourse")
	@POST
	public Response createCourse(Course course);
	
	
	@Path("/update/course")
	@PUT
	Response updateCourse(Course course);
	
	@Path("/deletecoures/{id}")
	@DELETE
	Response deleteCourse(@PathParam("id") Long id);

}
