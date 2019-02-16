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
public class FlightDirectory {
    private ArrayList<Flight> flightList;

    public FlightDirectory() {
        
        this.flightList = new ArrayList();
//        Flight x = new Flight();
//        x.setFlightAirlinersName("Boying");
//        x.setFlightId(1993);
//        x.setFlightName("A380");
//        x.setFlightSchedule("Morning");
//        this.addflights(x);
    }

    
    public ArrayList<Flight> getflightList() {
        return flightList;
    }

    public void setflightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
     public Flight addflights(){
        Flight newflight = new Flight();
        flightList.add(newflight);
        return newflight;
    }
     public void addflights(Flight f){
        
        flightList.add(f);
        
    }
    
    public void deleteflights(Flight flight){
        flightList.remove(flight);
    }
    
     public Flight searchFlight(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Flight p : flightList) {
            if(p.getFlightId() == id) {
                return p;
            }
        }
        return null;
    }
    
}
