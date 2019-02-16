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
public class Flight {
     private String flightName;
     private String flightAirlinersName;
     private int flightId;
     
     private String flightSchedule;
     public ArrayList<Seat> seatList;
     
     
     public Flight(){
         this.seatList = new ArrayList();
     }

    public ArrayList<Seat> getSeat() {
        return seatList;
    }

    public void setSeat(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }

    

    public String getFlightAirlinersName() {
        return flightAirlinersName;
    }

    public void setFlightAirlinersName(String flightAirlinersName) {
        this.flightAirlinersName = flightAirlinersName;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(String flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
     

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
     
    @Override
    public String toString(){
        return flightName;
    }
    
    public Seat addSeat(String id){
        Seat newseat = new Seat(id);
        seatList.add(newseat);
        return newseat;
        
    }
    public boolean seatJudge(String id){
        boolean bb = true;
        for(Seat sss: seatList){
            if(sss.getSeatID() == id){
                return false;
            }
        }
        return bb;
    }
    
   
    
}
