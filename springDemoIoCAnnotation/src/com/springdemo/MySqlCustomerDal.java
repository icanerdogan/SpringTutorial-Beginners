package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements CustomerDalService{
	// Bu Stringi nereden okuyayacağını "PropertySource" içinde dosya yolunu verdik 
	@Value("${database.sqlConnectionString}")
	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String: "+ this.connectionString);
		System.out.println("MySQL Veritabanına Eklendi!");
		
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
