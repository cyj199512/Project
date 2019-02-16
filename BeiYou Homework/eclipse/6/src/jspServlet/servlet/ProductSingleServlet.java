package jspServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspServlet.dao.ProductDAO;
import jspServlet.dao.impl.ProductDAOImpl;
import jspServlet.vo.Product;

public class ProductSingleServlet extends HttpServlet {


	public ProductSingleServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id= request.getParameter("id");
		ProductDAO dao = new ProductDAOImpl();
		Product product= null;
		try {
			product= dao.queryProduct(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("product", product);
		request.getRequestDispatcher("productSingle.jsp").forward(request,response);

	}


	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		HttpSession session=req.getSession();
		String id= req.getParameter("id");
		ProductDAOImpl dao = new ProductDAOImpl();
/*
		Product a= dao.queryProduct(id);
		session.setAttribute("String",Name);
		session.setAttribute("id",a.getId());
		session.setAttribute("PictureSrc", a.getPictureSrc());
		session.setAttribute("ProductInfo",a.getProductInfo());
		session.setAttribute("ProductName",a.getProductName());
		session.setAttribute("ProductPrice",a.getProductPrice());
		session.setAttribute("ProductSpecifications", a.getProductSpecifications());*/
		res.sendRedirect("./portfolio-single.jsp");
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
