package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V15",2000.0,"32GB Ram" ,15.2 , 222.4  ); //Referans Alma
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Casper G14");
		product2.setUnitPrice(30000.0);
		product2.setDetail("40GB");
		product2.setDiscount(10.0); 	
		
		Product product3 = new Product();
		product3.setId(2);
		product3.setName("Huawei D15");
		product3.setUnitPrice(30000.0);
		product3.setDetail("40GB");
		product3.setDiscount(10.0);
		
		
		
		//Çoğul olan isimler dizi ifade eder genellikle. Ürünlerine verilen gelen isimg ibi
		//Baştaki product ise Veritürü demek, String ali gibi buda Product x.
		Product[] products = {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(1);
		category2.setName("Ev/Bahçe");
		
		Category[] categorys = {category1, category2};
 		
		for (Category category : categorys) {
			System.out.println(category.getName());
		}
		
		System.out.println(products.length);
		
		ProductManager productManager = new ProductManager();
		//Product unreferansınıyolladık.
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
	}

}
