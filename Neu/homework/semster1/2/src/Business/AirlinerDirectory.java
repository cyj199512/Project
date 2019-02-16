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
public class AirlinerDirectory {
    private ArrayList<Airliners> airlinerList;

    public AirlinerDirectory() {
        
        this.airlinerList = new ArrayList();
        Airliners x = new Airliners();
        x.setAirlinerId(2018);
        x.setAirlinerName("Boying");
        this.addAirliners(x);
    }

    
    public ArrayList<Airliners> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliners> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
     public Airliners addAirliners(){
        Airliners newAirliner = new Airliners();
        airlinerList.add(newAirliner);
        return newAirliner;
    }
     
     public void addAirliners(Airliners a){
         airlinerList.add(a);
         
     }
    
    public void deleteAirliners(Airliners airliner){
        airlinerList.remove(airliner);
    }
    
}
