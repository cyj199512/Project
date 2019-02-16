/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.Supplier;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Richard
 */
public class Update {
    private Product product ;
    
    
    public Update(Product product) throws IOException{
        
        this.product = product;
        // TODO code application logic here
        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
            if(product.getSupplier() == null ){
                    System.out.println("Please input your Supplier name:：");
                    String suppliername = reader.readLine();
                    Supplier supplier = new Supplier();
                    supplier.setSupplierName(suppliername);
                    product.setSupplier(supplier);
            }
            System.out.println("Your product details are:");
            System.out.println("Name:    "+ product.getName());
            System.out.println("Price:    "+ product.getPrice());
            System.out.println("Number:    "+ product.getAvailNum());
            System.out.println("Description:    "+ product.getDescription());
              System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
            if(product.getSupplier() != null && product.getSupplier().getSupplierName() != null){
                System.out.println("Supplier Name:    "+ product.getSupplier().getSupplierName());
            }
            System.out.println("Which one do you want to change:    ");
            System.out.println("1: Product Name; ");
            System.out.println("2: Product Price; ");
            System.out.println("3: Product Available Number; ");
            System.out.println("4: Product Description: ");
            System.out.println("5: Return. ");
            System.out.println("Please selcet a number to tell us what you want to do: ");
            
            String choise = reader.readLine();
            switch(choise){
                case "1":
                    System.out.println("Please input your product name:：");
                    String name = reader.readLine();
                    product.setName(name);
                    System.out.println("Your product name is： " + product.getName());


                    continue;
                case "2":
                    System.out.println("Please input this product price:：");
                    double price = Double.valueOf(reader.readLine());
                    product.setPrice(price);
                    System.out.println("Your product name is： " + product.getPrice());
                    continue;

                case "3":
                    System.out.println("Please input your product Availabity Number:：");
                    int number = Integer.valueOf(reader.readLine());
                    product.setAvailNum(number);
                    System.out.println("Your product name is： " + product.getAvailNum());
                    continue;
                case "4":
                    System.out.println("Please input your product description:：");
                    String description= reader.readLine();
                    product.setDescription(description);
                    System.out.println("Your product name is： " + product.getDescription());
                    continue;
                case "5":
                    Main m = new Main(product);
                default:
                    continue;
            }










        }
    }
    
    
    
    
}
