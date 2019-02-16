package jspServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspServlet.dao.CartDAO;
import jspServlet.dao.impl.CartDAOImpl;
import jspServlet.vo.Cart;

public class CartServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CartServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String bs = request.getParameter("bs");
		
		System.out.print(bs);
		if (bs.equals("add"))
		{	
			
			int pid = Integer.parseInt(request.getParameter("id"));
			
			System.out.print(pid);
			
			String uname = request.getSession().getAttribute("username")+"";
			CartDAO dao = new CartDAOImpl();
			dao.addCart(pid, uname);
//			List<Cart> list = dao.myCart(uname);
//			request.setAttribute("list", list);
//			request.getRequestDispatcher("../cart.jsp").forward(request,response);
			out.print("<script>window.location.href='cart.jsp';</script>");
		}else if (bs.equals("delete"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			CartDAO dao = new CartDAOImpl();
			dao.deleteCart(id);
			out.print("<script>window.location.href='cart.jsp';</script>");
		}
		
		
		
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
