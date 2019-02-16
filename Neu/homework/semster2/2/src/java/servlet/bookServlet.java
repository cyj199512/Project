/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Richard
 */
public class bookServlet extends HttpServlet {
   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        String bookNum = request.getParameter("bookNum");
        String type = request.getParameter("part");
        if(type.equals("index")){
            session.setAttribute("bookNum",bookNum );
            request.getRequestDispatcher("./part8_add.jsp").forward(request, response); 
        }else if(type.equals("add")){
            
            
             //connection
            String  DBDRIVER = "com.mysql.jdbc.Driver" ;   
	    String  url="jdbc:mysql://localhost:3306/movie";
            String  username="root";
            String  password="123456";
            Statement stmt = null;
	    Connection conn = null ;
            try {
                Class.forName(DBDRIVER);
                conn = DriverManager.getConnection(url,username,password);
                stmt = conn.createStatement();
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException" + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("SQLException" + ex.getMessage());
            }
            
             try {
                 String sql = "insert into books values(?,?,?,?)";
                 PreparedStatement pStatement = conn.prepareStatement(sql);
                 for (int i = 0; i < Integer.valueOf(bookNum); i++) {
                    String isbn =request.getParameter( "isbn" + i);
                    String title = request.getParameter("title" + i);
                    String author = request.getParameter("author" + i);
                    Float price = Float.parseFloat(request.getParameter("price" + i)); 
                    pStatement.setString(1, isbn);
                    pStatement.setString(2, title);
                    pStatement.setString(3, author );
                    pStatement.setFloat(4, price);
                    pStatement.addBatch();
                    if (i  == Integer.valueOf(bookNum)-1) {
                        pStatement.executeBatch();
                    }
		}

                out.println("<html>");
                out.println("<head>");
                out.println("<title>Part 8</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<p>" + bookNum +"<h1> Books added successfully!</h1></p>");
                out.println("<p><a href = './part8.jsp'>Click Here to go to the Main Page</a></p>");
                out.println("</body>");
                out.println("</html>");
                
            }  catch (SQLException ex) {
                System.out.println(ex);
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("SQLException" + ex.getMessage());
                }
            
            
            }
            
            }
        }
    
}
    
    
    

