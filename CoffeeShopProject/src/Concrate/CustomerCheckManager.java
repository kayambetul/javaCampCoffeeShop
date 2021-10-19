package Concrate;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
