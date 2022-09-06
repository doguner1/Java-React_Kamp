package oopIntro;

public class ProductManager {

	//Sınıflar iş yapan ve özellik tanımlananlar olarak iki ye ayrılır
	//Cart sepet demek card kart gibi.
	public void addToCart(Product product) {
		System.out.println(product.getName() + " EKlendi");
	}
}