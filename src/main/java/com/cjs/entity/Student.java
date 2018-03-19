package com.cjs.entity;

import java.util.List;
import java.util.Map;

public class Student {

	private String name;
	
	private int age;
	
	private String sex;

	private City city;
	
	private List<String> tels;
	
	private Map<String,String> qq;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<String> getTels() {
		return tels;
	}

	public void setTels(List<String> tels) {
		this.tels = tels;
	}

	public Map<String, String> getQq() {
		return qq;
	}

	public void setQq(Map<String, String> qq) {
		this.qq = qq;
	}
	
}
