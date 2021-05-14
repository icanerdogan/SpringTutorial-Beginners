package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// Session'lar bizim Veritabanına sorgu göndermek için kullanılır ve normal sorgulardan farklı örnek olarak
		// eklediğimiz bir veriyi, update vs. gibi tek seferde yönetmeyi sağlar.
		// Örnek olarak banka hesabımızdan para gönderdiğimizde hesabımızın bakiyesi güncellenir ancak bir hata olduğunda hesabımızdaki para gitmez! Session bu işlemi sağlıyor, geri dönülebilir işlemler.
		// Sorgularımızı göndermek için "SessionFactory" sınfını kullanırız.
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession(); // Session ile sorgulamalarımızı gönderiririz.
		
		try {
			session.beginTransaction();
			
			// Gelen datayı ArrayLis'te çekiyoruz.
			// Select * From city
			// List<City> cities = session.createQuery("from City").getResultList();
			
			
			// KOŞULLU SORGULAR
			
			// countryCode'u TUR olan veya USA olan şehirleri getir
			List<City> cities = session.createQuery("from City c where c.countryCode='TUR' OR c.countryCode='USA'").getResultList();
			
			// countryCode'u TUR olan ve bölgesi Ankara olan şehirler
			List<City> cities = session.createQuery("from City c where c.countryCode='TUR' AND c.district='Ankara'").getResultList();
			
			// İsminde "kar" geçen şehir isimleri getirme sorgusu
			// %kar -> kar ile başlayan 
			// kar% -> kar ile biten şehir isimleri
			List<City> cities = session.createQuery("from City c where c.name LIKE '%kar%'").getResultList();
			
			
			//ORDER BY - Sıralama 
			
			// Default olarak ASC sıralamsında gelir ancak DESC ile sıralamayı tersine çevirebilirsin!
			List<City> cities = session.createQuery("from City c ORDER BY c.name DESC").getResultList();
			
			
			//GROUP BY - Gruplama

			//City içinden countryCode'ları grupla, ve o şehir kodlarını ekrana yazdır!
			List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();

				
			for(String countryCode:countryCodes) {
				System.out.println(countryCode);
			}
			
			
			
			// INSERT - Ekleme
			
			City city = new City();
			city.setName("Düzce");
			city.setCountryCode("TUR");
			city.setDistrict("Karadeniz");
			city.setPopulation(100000);
			
			session.save(city);
	
			
			// UPDATE - Güncelleme
			
			City city2 = session.get(City.class, 1); // ID'si 1 olan elemanı seçtik
			System.out.println("City2: "+ city2.getPopulation());
			
			city2.setPopulation(110000);
			System.out.println("Güncellenen City2: "+ city2.getPopulation());
			session.save(city2);
			
			
			// DELETE - Silme
			
			City city3 = session.get(City.class, 2);
			session.delete(city3);
			
			session.getTransaction().commit();
			
			//System.out.println("Şehir Eklendi!");
			//System.out.println("Şehir Güncellendi!");
			//System.out.println("Şehir Silindi!");
		}finally {
			factory.close();
		}

	}

}
