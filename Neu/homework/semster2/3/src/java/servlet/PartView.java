/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Richard
 */
public class PartView extends HttpServlet {
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String part = req.getParameter("part");
        if(part.equals("part4")){
            req.getRequestDispatcher("/WEB-INF/jsp/part4.jsp").forward(req, resp);
        }else if(part.equals("part5")){
            req.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(req, resp);
        }else if(part.equals("part6")){
           req.getRequestDispatcher("/WEB-INF/jsp/part6.jsp").forward(req, resp);
        }else if(part.equals("part7")){
           req.getRequestDispatcher("/WEB-INF/jsp/part7.jsp").forward(req, resp);
        }
        
        
    }
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    }
}
