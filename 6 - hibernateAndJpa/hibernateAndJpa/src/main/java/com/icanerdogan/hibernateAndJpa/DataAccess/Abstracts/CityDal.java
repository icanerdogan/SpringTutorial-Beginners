package com.icanerdogan.hibernateAndJpa.DataAccess.Abstracts;
import java.util.List;

// City sınıfını kullanmak için sınıfı import ediyoruz.
import com.icanerdogan.hibernateAndJpa.Entities.City;

public interface CityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
