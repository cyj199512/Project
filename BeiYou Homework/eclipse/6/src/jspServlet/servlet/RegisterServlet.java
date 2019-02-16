package jspServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspServlet.dao.UserDAO;
import jspServlet.dao.impl.UserDAOImpl;
import jspServlet.vo.User;

public class RegisterServlet extends HttpServlet {
	public RegisterServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setEmail(request.getParameter("email"));
		UserDAO dao=new UserDAOImpl();
		int flag = 0;
		try {
			flag = dao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (flag>0){
			
			response.sendRedirect("registerSuccess.jsp");
		}else{
			response.sendRedirect("error.jsp");
		}
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
