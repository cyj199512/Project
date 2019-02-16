/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import dao.CsvFileDAO;
import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.CsvFile;

/**
 *
 * @author Richard
 */
public class csvjdbc extends HttpServlet{
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CsvFileDAO csv = new CsvFileDAO();
       
        HttpSession session = request.getSession();
        try{
            String csvName = request.getParameter("csvName");
            List<CsvFile> ll =csv.getCsvFile(csvName);
            session.setAttribute("data", ll);
            request.getRequestDispatcher("/WEB-INF/jsp/part6.jsp").forward(request, response); 
        
        }catch (Exception e){
            
        }
    
    }
    
}
