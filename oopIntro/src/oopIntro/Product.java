package oopIntro;

public class Product {
	
	//final sadece constructorda set edilir. Bu yüzden yine diğererişebilirlik olan private kullandık. 
	//Private özel demek. Private sadece ve sadece bu classda erişilebilir
	
	//encapsulation
	private int id;
	private String name;
	private Double unitPrice;
	private String detail;
    private Double discount;
    

	
	//Constructor ==Yapıcı demek yani o classı oluştururken olmasını istediğimizi buraya yazıyoruz
	public Product() {
		
	}


	public Product(int id, String name, Double unitPrice, String detail, Double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}
	//Get ve Setter okuma ve yazma anlamındadır.
	 


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	//İndirimden sonraki fiyatı okunabilir fakat yazılması doğru olmadığından sadece get yazdırdık

	public Double getUnitPriceAfterDicount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
}