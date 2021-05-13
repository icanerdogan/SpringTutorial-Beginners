package com.springdemo;

// Çıplak Class: Herhangi bir implement veya extends almayan class'dır
// Projelerimizde çıplak class kalmamalıdır

public class CustomerManager implements CustomerManagerService{
	//Dependency Injection
	private CustomerDalService customerService;

	// Constructor Injection
	public CustomerManager(CustomerDalService customerService) {
		super();
		this.customerService = customerService;
	}
	
	public void add() {
		customerService.add();
	}
}
