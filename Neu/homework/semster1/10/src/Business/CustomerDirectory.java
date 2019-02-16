/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Customer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class CustomerDirectory {
    
    private List<User> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public List<User> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<User> supplierList) {
        this.customerList = supplierList;
    }
    
    
    public Customer addCustomer(Date dateCreate, String password, String userName){
        Customer c = new Customer(dateCreate, password, userName);
        customerList.add(c);
        return c; 
    }
    
    public void removeCustomer(Customer c){
        customerList.remove(c);
    }
    
    public User searchCustomer(String keyword){
        for (User customer : customerList) {
            if(customer.getUserName().equals(keyword)){
                return customer;
            }
        }
        return null;
    }
    
    
}
