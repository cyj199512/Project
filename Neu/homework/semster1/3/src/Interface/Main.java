/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Richard
 */
public class Main {
    Product product = new Product();
     public Main(){}
    
    public Main(Product product) throws IOException{
        
        this.product = product;
        
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                
            if(product.getSupplier()!= null && product.getSupplier().getSupplierName() != null){
                System.out.println("Dear " + product.getSupplier().getSupplierName());
            }
            
            
           
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Hi!");
            System.out.println("1: Create a New Product; ");
            System.out.println("2: Update Your product; ");
            System.out.println("3: View Your Product; ");
            System.out.println("4: Close. ");
            System.out.println("Please selcet a number to tell us what you want to do: ");
            String choise = reader.readLine();
            
            System.out.println("Your select is： " + choise);
            switch(choise){
                case "1":
                    Create create = new Create(product);
                    
                    break;
                case "2":
                    Update update = new Update(product);
                    
                    break;
                case "3":
                    View view = new View(product);
                    
                    break;
                case "4":
                    reader.close();
                    
                    
                    
                    System.exit(0);
                    
                    
                default:
                    System.out.println("Please selcet a number in (1,2,3,4)!!! ");
                    
                    continue;
                    
                    
                    
            }
            }
        
            
        
    }
     
     
   
        
        
     
        
        
        
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Product product = new Product();
        Main m = new Main(product);
    
    }
        
        
        
               
        
       
    
}
