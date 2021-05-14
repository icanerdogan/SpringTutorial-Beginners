package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Burada new Objesi mesela 100 yerde kullanılsa heryerde değiştirmek yerine IOC kullanıyoruz!
		// CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		// customerManager.add();
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//IoC - Inversion of Controll
		// getBean("database") burada applicationContext dosyasında ID'si database olan kısımdaki class'ı döndürecek!
		//CustomerManager customerManager = new CustomerManager(context.getBean("database", CustomerDalService.class));
		//customerManager.add();
		
		//Yukarıdaki oluşturulan kısım doğru ancak "new" sayısını azaltmak için CustomerManager sınıfımızı bir interface'e bağladık
		// applicastionContext içinde "constructor-arg" etiketiyle
		CustomerManagerService customerService = context.getBean("service", CustomerManagerService.class);
			
		customerService.add();
	}

}
