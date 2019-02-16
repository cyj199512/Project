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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Richard
 */
public class Part5 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String part = req.getParameter("part5");
        HttpSession session = req.getSession();
        try{
            
            if(part.equals("books")){
                if(session.getAttribute("p5") != null){
                    session.removeAttribute("p5");
                }
                session.setAttribute("p5", "books");
                req.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(req, resp);
            }else if(part.equals("musics")){
                if(session.getAttribute("p5") != null){
                    session.removeAttribute("p5");
                }
                session.setAttribute("p5", "musics");
                req.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(req, resp);
            }else if(part.equals("computers")){
                if(session.getAttribute("p5") != null){
                    session.removeAttribute("p5");
                }
                session.setAttribute("p5", "computers");
               req.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(req, resp);
            }else{
                req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req, resp);
            }
        }catch (Exception e){
            
        }
        
    }
}
