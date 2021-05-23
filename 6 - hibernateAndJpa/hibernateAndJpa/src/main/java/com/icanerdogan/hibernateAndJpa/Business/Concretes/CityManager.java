package com.icanerdogan.hibernateAndJpa.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icanerdogan.hibernateAndJpa.Business.Abstracts.CityService;
import com.icanerdogan.hibernateAndJpa.DataAccess.Abstracts.CityDal;
import com.icanerdogan.hibernateAndJpa.Entities.City;

@Service // Bunun bir iş katmanı olduğunu belirten etiketi ekliyoruz!
public class CityManager implements CityService{
	
	private CityDal cityDal;
	
	@Autowired // Constructor injectionlar için "Autowired" kullanılır
	public CityManager(CityDal cityDal) {
		this.cityDal = cityDal;
	}

	
	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// Burada bu sınıftaki dğer katmanlarda olduğu gibi iş fonskiyonları yazılır!
		// Meseala bu fonskiyonda şehir eklenirken istenen bir şart yazılır!
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}


	@Override
	@Transactional
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
