/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import java.util.Date;

/**
 *
 * @author harshalneelkamal
 */
public class Customer extends User implements Comparable <Customer>{

    private Date dateCreate;
    private CustomerDirectory customerDirectory;
    
    public Customer(Date dateCreate, String password, String userName) {
        super(password, userName, "Customer");
        customerDirectory = new CustomerDirectory();
        this.dateCreate = dateCreate;
    }

    public Date getDateCreated(){
        return dateCreate;
    }
    
    public void setDateCreate(Date dateCreate){
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean verify(String password) {
        if(password.equals(getPassword()))
            return true;
        return false;
    }

    @Override
    public int compareTo(Customer o) {
        return getUserName().compareTo(o.getUserName());
    }
    
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
}
