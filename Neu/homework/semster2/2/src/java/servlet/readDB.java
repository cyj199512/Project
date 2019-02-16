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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Richard
 */
public class readDB extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String dbType = request.getParameter("select");
        String type = request.getParameter("part");
        if(type.equals("index")){
            if(dbType.equals("browse" ) ){
                response.sendRedirect("./part7_searchMovie.html");

            }else if(dbType.equals("add") ){
                response.sendRedirect("./part7_addMovie.html");
            }
        }else if(type.equals("add")){
            
            String title = request.getParameter("title");
            String actor = request.getParameter("actor");
            String actress = request.getParameter("title");
            String gene = request.getParameter("gene");
            String year = request.getParameter("year");
            
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
            
            
            String sqlQuery = "INSERT INTO movietable (title, actor, actress, gene, year)"
                    + "VALUES ('" + title + "','" + actor +"','" + actress + "','" +gene + "','" + year + "')";
            try {
                int rs = stmt.executeUpdate(sqlQuery);
                if (rs != 0) {
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Part 7</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<p><h1>1 Movie added successfully!</h1>");
                    out.println("<p><a href = './part7.jsp'>Click Here to go to the Main Page</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                    
                }
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
        
        }else if(type.equals("search")){
            String searchType = request.getParameter("searchType");
            String keyword = request.getParameter("keyWord");
            
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
            
            
            String sqlQuery =  "SELECT * FROM movietable where " + searchType + " like '%" + keyword + "%'" ;
            try {
                ResultSet rs = stmt.executeQuery(sqlQuery);
               if(rs.next()){
                   String dbTitle = rs.getString("title");
                   String dbActor = rs.getString("actor");
                   String dbActress = rs.getString("actress");
                   String dbGene = rs.getString("gene");
                   String dbYear = rs.getString("year");
               
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Part 7</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<p><h1>Your search for '" + keyword + "'</h1><br>");
                    out.println("<p><h2>Here are the search result: </h2><br>");
                    
                    out.println("<p><h3>Movie Title: " + dbTitle+ "</h3><br>");
                    out.println("<p><h3>Actor: " + dbActor+ "</h3><br>");
                    out.println("<p><h3>Actress: " + dbActress+ "</h3><br>");
                    out.println("<p><h3>Genre: " + dbGene+ "</h3><br>");
                    out.println("<p><h3>Year: " + dbYear+ "</h3><br>");
                    
                    out.println("<p><a href = './part7.jsp'>Click Here to go to the Main Page</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                    
                }
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
