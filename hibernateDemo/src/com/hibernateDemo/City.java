package com.hibernateDemo;


import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.Column;

@Entity // City Class'ımız bir veritabanı nesnesi olduğunu bu Annotation ile veriyoruz.
@Table(name="city") // City Class'ımız hangi tabloya bağlıdır.
public class City {
	// Tablodaki tüm sütun değerlerini ekliyoruz
	@Id // Tablomuzun "ID" kolonu Id'yi bize verdiğini bu annotation ile gösteriyoruz.
	@Column(name="ID")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="CountryCode")
	private String countryCode;
	@Column(name="District")
	private String district;
	@Column(name="Population")
	private int population;
	
	
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
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
}
