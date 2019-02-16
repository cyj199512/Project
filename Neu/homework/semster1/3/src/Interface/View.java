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

/**
 *
 * @author Richard
 */
public class View {
    private Product product ;
    
    public View(Product product) throws IOException{
           this.product = product;
        // TODO code application logic here
           
        
        while( true ){
            BufferedReader reade = new BufferedReader(new InputStreamReader(System.in));
            
             System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
            
           
            System.out.println("Your product details are:");
            System.out.println("Name:    "+ product.getName());
            System.out.println("Price:    "+ product.getPrice());
            System.out.println("Number:    "+ product.getAvailNum());
            System.out.println("Description:    "+ product.getDescription());
            if(product.getSupplier() != null && product.getSupplier().getSupplierName() != null){
                System.out.println("Supplier Name:    "+ product.getSupplier().getSupplierName());
            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Press 1 to return!");
            if("1".equals(reade.readLine())){
                
                break;
            }
            
           
            
            
           
        }
        Main m = new Main(product);
    }    
}

    

