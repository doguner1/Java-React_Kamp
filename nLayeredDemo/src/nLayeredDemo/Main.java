package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//entitiler hariç newliyorsak ilerde problem olacaktır
		
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product1 = new Product(1,1,"Elma",12,50);
		productService.add(product1); //Bu kategori ürün kabul etmiyor
		
		Product product2 = new Product(1,2,"Masa",124,21);
		productService.add(product2); //Bu kategori ürün kabul etmiyor
	}

}
