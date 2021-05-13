package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// Artık oluşturduğumuz bu sınıf ve eklediğimiz ComponentScan ile bu applicationContext.xml kullanımını sonlandırdık.
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")
public class IocConfig {
	
	//Diğer Dal sınıfların başına Components("database") yapmak yerine xml dosyasındaki gibi class'lar ekledik.
	@Bean
	public CustomerDalService database() {
		return new MsSqlCustomerDal();
	}
	
	@Bean
	public CustomerManagerService service() {
		return new CustomerManager(database());
	}
}

