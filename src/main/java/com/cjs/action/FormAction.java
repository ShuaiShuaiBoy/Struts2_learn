package com.cjs.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cjs.entity.City;
import com.cjs.entity.Student;
import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport{

	private String text;
	
    private List<String> listText;
    
    private Map<String,String> mapText;
    
    private Student student;
	
	@Override
	public String execute() throws Exception {

		text = "textfield1";
	
		listText = new ArrayList<String>();
		listText.add("listText1");
		listText.add("listText2");
		listText.add("listText3");
		listText.add("listText4");
		listText.add("listText5");
	
        mapText = new HashMap<String,String>();
        mapText.put("map1", "mapText1");
        mapText.put("map2", "mapText2");
        mapText.put("map3", "mapText3");
        mapText.put("map4", "mapText4");
        
        City city = new City("北京");
        List<String> tels = new ArrayList<String>();
        tels.add("123456789123");
        tels.add("234567891234");
        Map<String,String> qq = new HashMap<String,String>();
        qq.put("测试1", "123456789");
        qq.put("测试2", "234567891");
        student = new Student("用户1",20,"男");
        student.setCity(city);
        student.setTels(tels);
        student.setQq(qq);
        
        
		return SUCCESS;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getListText() {
		return listText;
	}

	public void setListText(List<String> listText) {
		this.listText = listText;
	}

	public Map<String, String> getMapText() {
		return mapText;
	}

	public void setMapText(Map<String, String> mapText) {
		this.mapText = mapText;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}
