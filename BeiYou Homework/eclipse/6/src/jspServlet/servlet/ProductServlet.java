package jspServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspServlet.dao.ProductDAO;
import jspServlet.dao.UserDAO;
import jspServlet.dao.impl.ProductDAOImpl;
import jspServlet.dao.impl.UserDAOImpl;
import jspServlet.vo.Product;
import jspServlet.vo.User;

public class ProductServlet extends HttpServlet {


	public ProductServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductDAO dao=new ProductDAOImpl();
		List<Product> list=null;
		try {
			list=dao.queryProduct();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("product.jsp").forward(request,response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		
		
	}



	public void init() throws ServletException {
		// Put your code here
	}

}
