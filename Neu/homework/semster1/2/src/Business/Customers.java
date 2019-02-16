/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Richard
 */
public class Customers {
     private String customerName;
     private int customerId;
     public FlightDirectory flightDirectory;
     public Customers(){
         this.flightDirectory = new FlightDirectory();
     }

    public FlightDirectory getFlightDirectory() {
        
        
        
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
     

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Override
    public String toString(){
        return customerName;
    }
}
