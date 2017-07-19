package com.javacodepoint.customer.services;

public class CustomerService {
	private String name;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printCustomerName() {
		System.out.println("Name of Customer : " + this.name);
	}

	public void printAddress() {
		System.out.println("Address of Customer : " + this.address);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}