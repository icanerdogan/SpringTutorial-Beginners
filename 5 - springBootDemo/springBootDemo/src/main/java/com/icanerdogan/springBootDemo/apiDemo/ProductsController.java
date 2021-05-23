package com.icanerdogan.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controllerde class sınıflandırması çoğul yapılır!
@RestController 
public class ProductsController {
	// MVC
	// Model: View-Controller veya Controller-View arası gönderilecek data transferi model ile yapılır.
	// View: Controllerdan aldığı görüntüyü, isteği view'a yönlendirir.
	// Controller: Kullanıcı tarafından isteneni ilk karşılayan kısımdır. İsteğin nasıl yanıtlanacağına karar verir.
	
	@GetMapping("/") // Bu kod satırında tek "/" varsa ana ekranımızı belirliyor!
	public String get() {
		return "Ana ekran";
	}
	
	@GetMapping("/products") // Artık "localhost:8080/products" şeklinde bir adres eklenmiş oldu! 
	public String get2() {
		return "products sekmesi";
	}
}
