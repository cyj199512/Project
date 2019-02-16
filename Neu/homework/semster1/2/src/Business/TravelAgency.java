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
public class TravelAgency {
    
    
    public CustomerDirectory customerDirectory;
    public AirlinerDirectory airlinerDirectory;
    public FlightDirectory flightDirectory;
    

    public TravelAgency() {
        
        
        this.customerDirectory =  new CustomerDirectory();
        this.airlinerDirectory = new AirlinerDirectory();
        this.flightDirectory = new FlightDirectory();
    }

    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customer) {
        this.customerDirectory = customer;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airliner) {
        this.airlinerDirectory = airliner;
    }
    
    
   
    
    
}
