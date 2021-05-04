package coffeeShop;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: " + customer.getFirstName()+ " " + customer.getLastName()+
					" " + customer.getNationalId());
		}else {
			throw new Exception("Not a valid person");
		}
		
	}

}
