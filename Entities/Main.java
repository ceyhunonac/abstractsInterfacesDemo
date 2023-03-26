package Entities;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.*;


public class Main {
    public static void main(String[] args)  {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Ceyhun");
        customer1.setLastName("Onaç");
        customer1.setNationalityId("00000000000");
        customer1.setDateOfBirth(2003);
        


        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(new Customer(1,"Ceyhun","Onaç",2003,"00000000000"));
        
        BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
        baseCustomerManager2.save(customer1);
        
        
        
        
    }
}