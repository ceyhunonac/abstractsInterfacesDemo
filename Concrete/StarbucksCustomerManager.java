package Concrete;

import Abstracts.BaseCustomerManager;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    public StarbucksCustomerManager(CustomerCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    private CustomerCheckService personCheckService;

    @Override
    public void save(Customer customer)  {

        if(personCheckService.checkIfRealPerson(customer)){
        	super.save(customer);
           
        }else {
           System.out.println ("Not a valid person");
        }
    }

}
