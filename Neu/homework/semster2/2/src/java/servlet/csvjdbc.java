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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Richard
 */
public class csvjdbc extends HttpServlet{
    
    public static List ResultSetToList(ResultSet rs) {

        try {

            ResultSetMetaData md = rs.getMetaData();    // 获得结果集结构信息（字段数、字段名等）

            int columnCount = md.getColumnCount();

            List list = new ArrayList();

            while (rs.next()) {

                Map rowData = new HashMap();

                for (int i = 1; i <= columnCount; i++) {

                    rowData.put(md.getColumnName(i), rs.getObject(i));

                }

                list.add(rowData);

            }

            return list;

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String csvName = request.getParameter("csvName");
        try{
        // load the driver into memory
        Class.forName("org.relique.jdbc.csv.CsvDriver");
        // create a connection. The first command line parameter is assumed to
        // be the directory in which the .csv files are held
        Connection conn = DriverManager.getConnection("jdbc:relique:csv:/Users/Richard/Desktop/NEU/6250/" );
        // create a Statement object to execute the query with
        Statement stmt = conn.createStatement();
        // Select the ID and NAME columns from sample.csv
        ResultSet results = stmt.executeQuery("SELECT * FROM " +csvName );
        List ll = ResultSetToList(results);
        session.setAttribute("data", ll);
         results.close();
        stmt.close();
        conn.close();
        request.getRequestDispatcher("part5.jsp").forward(request, response); 
        
      
        
       
       
        
        // clean up
       
        }
        catch(Exception e)
        {
        System.out.println("Oops-> " + e);
        }

    
    }
    
}
