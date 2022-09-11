package interfaces;

public class Main {

	public static void main(String[] args) {
	
		CustomerManager customerManager1 = new CustomerManager(new SmsLogger());
		Customer customer1 = new Customer(1,"Doğu","Güner");
		
		customerManager1.add(customer1);
		
		
		Logger[] loggers = {new SmsLogger() , new DatabaseLogger() , new FileLogger()};
		Customer customer2 = new Customer(1,"Ahmet", "Güner");
		CustomerManager custoManager2 = new CustomerManager(loggers);
		custoManager2.multiAdd(customer2);

	}

}
