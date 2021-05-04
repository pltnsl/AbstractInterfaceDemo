package coffeeShop;

import java.sql.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Neslihan","PULAT", new Date(1991, 13,11),"12452132411"));
			
		

		
		

	}

}
