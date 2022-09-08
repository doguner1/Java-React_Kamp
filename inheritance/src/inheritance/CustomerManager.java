package inheritance;

import java.util.Iterator;

public class CustomerManager {
	
	//Customer customer yazıdığımız yerde, Customer sınıfını extends eden sınıfların referanslarını tutabiliyor.
	//Buna polimorfizim denir
	
	public void add(Customer customer) {
		//customer.get yazdığımızda sadece Customer sınıfındaki özellikler geliyor
		//Yakında nasıl olduğunu öğreneceğiz
		System.out.println(customer.getCustomerNumber());
	}
	
	public void addMultiple(Customer[] customers) {
		for(Customer customer  : customers) {
			add(customer); //Gönderdiğim her bir müşteriyi tektek dönecek ve yukardaki add fonk çalıştıracak
		}
	}

}