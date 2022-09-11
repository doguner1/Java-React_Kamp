package interfaces;

public class CustomerManager {
	
	private Logger logger;
	
	private Logger[] loggers;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}



	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}



	public void add(Customer customer) {
		System.out.println("Müşteri Eklendi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri Silindi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
	
	public void multiAdd(Customer customer) {
		System.out.println("Müşteri Eklendi : " + customer.getFirstName());
	
		Utils.runLoggers(loggers, customer.getFirstName());
	}


}
