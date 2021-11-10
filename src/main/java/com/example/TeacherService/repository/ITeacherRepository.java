package com.example.TeacherService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TeacherService.model.Teacher;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher,Long> {

	public Teacher findBytClass(int tClass);
}
