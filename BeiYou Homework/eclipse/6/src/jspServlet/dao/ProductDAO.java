package jspServlet.dao;

import java.util.ArrayList;


import jspServlet.vo.Product;


public interface ProductDAO {
	public ArrayList<Product> queryProduct() throws Exception;
	public Product queryProduct(String id) throws Exception;
}
