package jspServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspServlet.dao.UserDAO;
import jspServlet.dao.impl.UserDAOImpl;
import jspServlet.vo.User;

public class ChangePasswordServlet extends HttpServlet {

	public ChangePasswordServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}

	


	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		User user=new User();
		String username  = (String) request.getSession().getAttribute("username");
		if(null != username && username.equals("")==false){
			user.setUsername(username);
		}else{
			response.sendRedirect("login.jsp");
		}
		
		user.setPassword(request.getParameter("password"));
		UserDAO dao=new UserDAOImpl();
		int flag = 0;
		try {
			flag = dao.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (flag>0){
			
			response.sendRedirect("welcome.jsp");
		}else{
			response.sendRedirect("error.jsp");
		}
		

	}


	public void init() throws ServletException {
		
	}

}
