
public class Main {

	public static void main(String[] args) {
		Logger []loggers={new DatabaseLogger(),new SmsLogger(),new FileLogger()};
	CustomerManager customerManager =new CustomerManager(loggers);
	Customer customer=new Customer(1,"ilyas","aktas");
	customerManager.Add(customer);

	}

}
