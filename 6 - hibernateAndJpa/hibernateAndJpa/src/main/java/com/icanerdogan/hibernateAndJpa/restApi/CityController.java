//application.properties dosyasına gerekli eklemeleri yapmayı unutma!!!

package com.icanerdogan.hibernateAndJpa.restApi;
import com.icanerdogan.hibernateAndJpa.Entities.City;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icanerdogan.hibernateAndJpa.Business.Abstracts.CityService;

// Arayüz işlemleri restApi sınıfında yapılır

@RestController
@RequestMapping("/api")
public class CityController {
	//Api katmanına eklediğimiz ve haberleştiğimiz katman Bussiness katmanı!
	private CityService cityService;

	@Autowired // Hızlı Injection
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}
	
	@PostMapping("/add") // Kullanıcıdan işlemlerde 
	public void add(@RequestBody City city) {
		cityService.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityService.delete(city);
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id){
		return cityService.getById(id);
	}
}

