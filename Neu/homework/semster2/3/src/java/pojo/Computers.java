/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Richard
 */
public class Computers {
    private String name;
    
    
    public Computers(){}
    
    public Computers(String name){
        this.name = name;
        
    }

    
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    @Override
    public String toString() {
        return "Computers{" + "name=" +name + '}';
    }
    
}
