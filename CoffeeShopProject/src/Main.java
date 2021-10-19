import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbuksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbuksCustomerManager(new MernisServiceAdapter());
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Ümmü Betül","Kayam",1995,"1234567890"));
		


	}

}
