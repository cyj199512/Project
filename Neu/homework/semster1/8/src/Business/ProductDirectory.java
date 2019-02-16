/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author info
 */
public class ProductDirectory {
    
    private ArrayList<Product> productList;
    
    public ProductDirectory(){
        ArrayList<Product> productList;
        this.productList = new ArrayList();
    }

    public ArrayList<Product> getProductDirectory() {
        return productList;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productList = productDirectory;
    }
    
    public Product addProduct(){
        Product newProduct = new Product();
        productList.add(newProduct);
        return newProduct;
    }
    
    public void deleteProduct(Product product){
        productList.remove(product);
    }
    
    @SuppressWarnings("unchecked")
    public Product[] searchAccount(String name){
        List<Product> list;
        list = new ArrayList<>();
        
       
        int  count = -1;
        for(Product prod : this.productList){
            if(prod.getName().equalsIgnoreCase(name)){
                list.add(prod);
                count ++;
            }
        }
        if(count == -1){
            return null;
        }else{
             Product[] p  = new Product[list.size()];
             for(int j = 0; j< list.size(); j++){
                p[j] = list.get(j);
                 
             }
            return p;
        }
    }
}
