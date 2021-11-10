package com.example.TeacherService.service;

import com.example.TeacherService.model.Teacher;

public interface ITeacherService  {
	
	public Teacher createTeacher(Teacher teacher);
	public Teacher getTeacherbytclass(int tClass);

}
