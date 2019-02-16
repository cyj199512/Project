<%-- 
    Document   : part6
    Created on : 2019-2-3, 20:16:35
    Author     : Richard
--%>


 
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
	<head>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
            <meta charset="UTF-8">
            <title>Part 6</title>
	</head>
 
	<body>
            <form method = "POST" action = "search1.do">
            <p align="center">Search by Name:
            <input type="text" name="excelName" ></br></p>    
            <p align="center"><input type="submit" value = "Search" /> </br></p>
                
            </form>
            
              
             <% 
               try{
               ArrayList<Map<String, String>> ll = null;
              if(session.getAttribute("excelList")!= null){
                  ll = (ArrayList<Map<String, String>>)session.getAttribute("excelList");
              }
               for(Map<String, String> l : ll) {
                   Set<String>set = l.keySet();
                   for(String key : set) {
                       String value = l.get(key);
                   
               
             
             %>
              
             <%=key%> -> <%= value%>
             </br>
           
           
             <% 
                     }
                }
                   }catch(Exception e){
                System.out.println("Oops-> " + e);
              }
                %>
                
            
		
            
	</body>
	
 
</html>

