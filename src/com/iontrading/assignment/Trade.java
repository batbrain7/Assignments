package com.iontrading.assignment;

public class Trade {
	
	private int id;
	private Client client;
	private Contract contract;
	private String verb;
	private int quantity;
	private double fees;	
	
	public Trade(int id, Client client, Contract contract, String verb, int quantity) {
		super();
		this.id = id;
		this.client = client;
		this.contract = contract;
		this.verb = verb;
		this.quantity = quantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Contract getContract() {
		return contract;
	}


	public void setContract(Contract contract) {
		this.contract = contract;
	}


	public String getVerb() {
		return verb;
	}


	public void setVerb(String verb) {
		this.verb = verb;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getFees() {
		return fees;
	}




	@Override
	public String toString() {
		return "Trade [id=" + id + ", client=" + client + ", contract=" + contract + ", verb=" + verb + ", quantity="
				+ quantity + ", fees=" + fees + "]";
	}


	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
