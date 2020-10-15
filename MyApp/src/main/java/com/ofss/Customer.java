package com.ofss;

public class Customer {
	private String customerName;
	private String location;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, String location) {
		super();
		this.customerName = customerName;
		this.location = location;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", location=" + location + "]";
	}

}
