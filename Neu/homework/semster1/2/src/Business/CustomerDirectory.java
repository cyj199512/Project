/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class CustomerDirectory {
     private ArrayList<Customers> customerList;

    public CustomerDirectory() {
        
        this.customerList = new ArrayList();
//        Customers x = new Customers();
//        x.setCustomerId(2014213209);
//        x.setCustomerName("cyj");
//        this.addCustomers(x);
    }

    
    public ArrayList<Customers> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customers> customerList) {
        this.customerList = customerList;
    }
    
     public Customers addCustomers(){
        Customers newCustomer = new Customers();
        customerList.add(newCustomer);
        return newCustomer;
    }
     public void addCustomers(Customers c){
         customerList.add(c);
     }
    
    public void deleteCustomers(Customers customer){
        customerList.remove(customer);
    }
    
}
