package com.icanerdogan.hibernateAndJpa.Business.Abstracts;

import java.util.List;

import com.icanerdogan.hibernateAndJpa.Entities.City;

public interface CityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
