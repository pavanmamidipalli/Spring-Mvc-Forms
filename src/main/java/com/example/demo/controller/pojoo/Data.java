package com.example.demo.controller.pojoo;

public class Data {
	private int id;
	private String name;
	private String place;
	private String college;
	public Data() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", place=" + place + ", college=" + college + "]";
	}
	

}
