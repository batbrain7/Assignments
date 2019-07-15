package com.iontrading.assignment;

public class Client {
	
	public int id;
	public String type;
	
	
	public Client(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", type=" + type + "]";
	}
	
	
}
