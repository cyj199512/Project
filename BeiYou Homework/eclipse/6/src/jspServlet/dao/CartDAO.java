package jspServlet.dao;

import java.util.List;

import jspServlet.vo.Cart;

public interface CartDAO {
	public int addCart(int pid,String uname);
	public List<Cart> myCart(String uname);
	public int deleteCart(int id);
	public int myCartCount(String uname);
}
