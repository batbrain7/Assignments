package com.iontrading.assignment;

public class Contract {

	int id;
	String exchange;

	public Contract(int id, String exchange) {
		super();
		this.id = id;
		this.exchange = exchange;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@Override
	public String toString() {
		return "Contract [id=" + id + ", exchange=" + exchange + "]";
	}



}
