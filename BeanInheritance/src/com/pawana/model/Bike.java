package com.pawana.model;

public class Bike {
	private String id;
	private String company;
	private String capacity;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", company=" + company + ", capacity=" + capacity + "]";
	}
	
	
}
