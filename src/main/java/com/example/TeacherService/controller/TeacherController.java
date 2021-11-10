package com.example.TeacherService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TeacherService.model.Teacher;
import com.example.TeacherService.service.ITeacherService;
@RestController
@RequestMapping(value="/api/teacher")
public class TeacherController {
	@Autowired
	ITeacherService iteacherservice;
@RequestMapping(value="/api/createTeacher",method=RequestMethod.POST)
public Teacher createTeacher(@RequestBody Teacher teacher)
	{
	    return iteacherservice.createTeacher(teacher);
		
	}
@RequestMapping(value="/api/getTeacherbyTclass/{tClass}",method=RequestMethod.GET)
public Teacher getTeacherbytClass(@PathVariable int tClass)
{
	return iteacherservice.getTeacherbytclass(tClass);
}

	

}
