package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
	    individualCustomer.setId(1);
	    individualCustomer.setFirstName("Doğu");
	    individualCustomer.setCustomerNumber("34234234");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
	    corporateCustomer.setId(2);
	    corporateCustomer.setCustomerNumber("3243242341");
	    corporateCustomer.setCompanyName("Hepsi Burada");
	    corporateCustomer.setTaxNumber("1111");
	   
	   
	    CustomerManager customerManager1 = new CustomerManager();
	    customerManager1.add(individualCustomer);
	    customerManager1.add(corporateCustomer);
	   
	    Customer[] customers = {individualCustomer, corporateCustomer };
	    customerManager1.addMultiple(customers);

	}

}
