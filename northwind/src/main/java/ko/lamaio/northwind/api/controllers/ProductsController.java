package ko.lamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import ko.lamaio.northwind.business.abstracts.ProductService;
import ko.lamaio.northwind.entities.concretes.*;

@RestController
@RequestMapping("/api/products")
public class ProductsController { //Bizim projenin dış dünya ile iletişim kurduğu yer burası

	
	private ProductService productService;
	@Autowired //Autowired gidiyor projeyi tarıyor. Ararken soru şu kim productServici implements etmiş.
	//Arka planda ProductManager p = new ProductManager(); yapıyor
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") //kodlama.io/api/products/getall yazdığımızda altaki kod çalışacak demek
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
