package com.example.TeacherService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher456")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long tId;
	private int tClass;
	private String tName;
	public Teacher() {
		super();
	}
	public Teacher(Long tId, int tClass, String tName) {
		super();
		this.tId = tId;
		this.tClass = tClass;
		this.tName = tName;
	}
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public int gettClass() {
		return tClass;
	}
	public void settClass(int tClass) {
		this.tClass = tClass;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
	

}
