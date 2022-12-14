package ko.lamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity  //Anatosyon : Bir klasın çalışma anında veya derleme anında onunla ilgili bilgi toplama ile ilgili bir yapı. 
//Bu hareketi yaparak Product bir Entity dir demiş olduk.
@Table(name= "Product") //Veri tabanında alanını gösterdik
 // @Data //class isminin üstüne yazılır. Get ve setleri otomatik kurmuş oldu
public class Product {
	
	@Id
	@GeneratedValue //id ler bir bir otomatik artacak demek. Diğer yollarını araştır.
	@Column(name = "product_id") //hangi alan hangi alana karşılık geliyor demek
	private int id;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
	private double unitPrice;
	
	@Column(name = "product_in_stock")
	private short unitsInStock;
	
	public Product() {
		
	}
	
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public short getUnitsInStock() {
		return unitsInStock;
	}


	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
