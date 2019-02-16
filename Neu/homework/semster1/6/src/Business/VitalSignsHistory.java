/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsHistory;
   

    public List<VitalSigns> getAbnormalList(double maxBP, double minBP) {
        List<VitalSigns> abnList = new ArrayList<>();
        
        for(VitalSigns vs : vitalSignsHistory){
            if(vs.getBlood()> maxBP || vs.getBlood()< minBP){
                abnList.add(vs);
            }
        }
        
        return abnList;
    }

    
    
    public VitalSignsHistory(){
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVital(){
        VitalSigns vs = new VitalSigns();
        vitalSignsHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        vitalSignsHistory.remove(v);
    }
    
}
