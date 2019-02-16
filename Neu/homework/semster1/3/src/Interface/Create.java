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
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Create {
    private Product product ;
    
    public Create(Product product) throws IOException{
        this.product = product;
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
        System.out.println("Please input your product name:：");
        String name = reader.nextLine();
        product.setName(name);
        System.out.println("Your product name is： " + product.getName());
        
       
        System.out.println("Please input this product price:：");
        
        
        double price = reader.nextDouble();
        reader.nextLine();
        product.setPrice(price);
        System.out.println("Your product name is： " + product.getPrice());
        
        System.out.println("Please input your product Availabity Number:：");
        int number = Integer.valueOf(reader.nextLine());
        product.setAvailNum(number);
        System.out.println("Your product name is： " + product.getAvailNum());
      
        System.out.println("Please input your product description:：");
        String description= reader.nextLine();
        product.setDescription(description);
        System.out.println("Your product name is： " + product.getDescription());
        
        
        
        
    }
    
}
