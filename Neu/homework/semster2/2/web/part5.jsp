<%-- 
    Document   : part5
    Created on : 2019-2-3, 20:16:35
    Author     : Richard
--%>


<%@ page import="java.sql.*"%>  
<%@ page import="java.util.*"%>  
<%@ page import="org.relique.jdbc.csv.CsvDriver"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
 
	<head>
            <link rel="stylesheet" href="bootstrap_table/css/bootstrap.min.css">
            <link rel="stylesheet" href="bootstrap_table/css/bootstrap-table.min.css">
            <link rel="stylesheet" href="bootstrap_table/css/bootstrap-editable.css">
            <script src="bootstrap_table/js/jquery.min.js"></script>
            <script src="bootstrap_table/js/bootstrap.min.js"></script>
            <script src="bootstrap_table/js/vue.min.js"></script>
            <script src="bootstrap_table/js/bootstrap-table.min.js"></script>
            <script src="bootstrap_table/js/bootstrap-editable.js"></script>
            <script src="bootstrap_table/js/bootstrap-table-editable.js"></script>
            <meta charset="UTF-8">
            <title></title>
	</head>
        
 
	<body>
            <form method = "POST" action = "search.do">
            <p align="center">Search by Name:
            <input type="text" name="csvName" ></br></p>    
            <p align="center"><input type="submit" value = "Search" /> </br></p>
                
            </form>
            
             <% 
               try{
               List ll = null;
              if(session.getAttribute("data")!= null){
                  ll = (List)session.getAttribute("data");
              }
             
             %>
		
           
            <div >
                <% for(Object l: ll){ %>
                <table >
                    <td><%=l%></td>
                </table>
                <% 
                   }}catch(Exception e){
                System.out.println("Oops-> " + e);
              }
                %>
            </div>
		
            
	</body>
	
 
</html>

