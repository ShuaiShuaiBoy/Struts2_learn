package com.cjs.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.cjs.entity.City;
import com.cjs.entity.Student;

import ognl.Ognl;

public class OgnlTest {

	@Test
	public void test1() throws Exception {
		Student stu = new Student("ceshi",20,"��");
		
		System.out.println(Ognl.getValue("name", stu));
		System.out.println(Ognl.getValue("age", stu));
	}
	
	@Test
	public void test2() throws Exception {
		Student stu = new Student("ceshi",20,"��");
		City city = new City("����");
		stu.setCity(city);
		
		System.out.println(Ognl.getValue("city.name", stu));
	}
	
	@Test
	public void test3() throws Exception {
		Student stu = new Student("ceshi",20,"��");
		City city = new City("����");
		stu.setCity(city);
		List<String> tels = new ArrayList<String>();
		tels.add("123456789");
		tels.add("987654321");
		stu.setTels(tels);
		
		System.out.println(Ognl.getValue("tels[0]", stu));
		System.out.println(Ognl.getValue("tels[1]", stu));
	}
	
	@Test
	public void test4() throws Exception {
		Student stu = new Student("ceshi",20,"��");
		City city = new City("����");
		stu.setCity(city);
		List<String> tels = new ArrayList<String>();
		tels.add("123456789");
		tels.add("987654321");
		stu.setTels(tels);
		Map<String,String> qq = new HashMap<String,String>();
		qq.put("�ǳ�1", "12345678");
		qq.put("�ǳ�2", "22345678");
		qq.put("�ǳ�3", "32345678");
		stu.setQq(qq);
		
		System.out.println(Ognl.getValue("qq.�ǳ�1", stu));
		System.out.println(Ognl.getValue("qq.�ǳ�2", stu));
		System.out.println(Ognl.getValue("qq.�ǳ�3", stu));
		System.out.println(Ognl.getValue("qq['�ǳ�1']", stu));
		System.out.println(Ognl.getValue("qq['�ǳ�2']", stu));
		System.out.println(Ognl.getValue("qq['�ǳ�3']", stu));
	}
	
	@Test
	public void test5() throws Exception {
		Student stu = new Student("ceshi",20,"��");
		City city = new City("����");
		stu.setCity(city);
		List<String> tels = new ArrayList<String>();
		tels.add("123456789");
		tels.add("987654321");
		stu.setTels(tels);
		Map<String,String> qq = new HashMap<String,String>();
		qq.put("�ǳ�1", "12345678");
		qq.put("�ǳ�2", "22345678");
		qq.put("�ǳ�3", "32345678");
		stu.setQq(qq);
		
		System.out.println(Ognl.getValue("qq.�ǳ�1.length()", stu));
		System.out.println(Ognl.getValue("name.toUpperCase()", stu));
		System.out.println(Ognl.getValue("age>18", stu));
	}
	
	
	@Test
	public void test6() throws Exception{
		Map<String,Student> map = new HashMap<String,Student>();
		
		Student stu1 = new Student("ceshi1",16,"��");
		Student stu2 = new Student("ceshi2",22,"Ů");
		Student stu3 = new Student("ceshi3",27,"��");
		
		map.put("one",stu1);
		map.put("two",stu2);
		map.put("three",stu3);
		
		System.out.println(Ognl.getValue("#one.name", map,stu1));
		System.out.println(Ognl.getValue("#two.name", map,stu1));
		System.out.println(Ognl.getValue("#three.name", map,stu1));
	}
}
