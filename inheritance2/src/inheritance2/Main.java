package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger emailLogger = new EmailLogger();
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(new DataBaseLogger());
		customerManager.Add(new FileLogger());
		customerManager.Add(emailLogger);

	}

}
