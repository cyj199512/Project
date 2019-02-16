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
public class Airliners {
    
    private String airlinerName;
    private int airlinerId;
    

    public int getAirlinerId() {
        return airlinerId;
    }

    public void setAirlinerId(int airlinerId) {
        this.airlinerId = airlinerId;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    
    @Override
    public String toString(){
        return airlinerName;
    }
    
    
}
