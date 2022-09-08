package oopIntro;

public class Category {
	
	private int id;
	private String name;
	
	
	public Category() {
		
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name + " !"; //Tek bir hareketle tüm  çağırdığımız sayfalar değişiyor. Set get önemli
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
