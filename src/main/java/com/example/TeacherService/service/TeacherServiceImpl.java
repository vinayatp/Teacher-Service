package com.example.TeacherService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TeacherService.model.Teacher;
import com.example.TeacherService.repository.ITeacherRepository;
@Service
public class TeacherServiceImpl implements ITeacherService {
	
	@Autowired
	ITeacherRepository iteacherrepository;

	@Override
	public Teacher createTeacher(Teacher teacher) {
		
		return iteacherrepository.save(teacher);
	}

	@Override
	public Teacher getTeacherbytclass(int tClass) {
		
		return iteacherrepository.findBytClass(tClass);
	}
	

}
