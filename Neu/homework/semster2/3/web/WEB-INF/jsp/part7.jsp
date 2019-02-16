<%-- 
    Document   : part7
    Created on : 2019-2-9, 20:29:47
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Part 7</title>
    </head>
    <body>
         <form method = "POST" action = "movie.do">
                <h2 align="center">Welcome to our Movie Store</h2><br>
                <h3 align="center">Please make your Selection below:</h3>
            <p align="center"><select name = "select">
                <option value ="browse">Browse Movie</option>
                <option value ="add">Add new Movie to DataBase</option>    
            </select></p> 
             <input type= "hidden" name="part" value = "index"/>
              
            <p align="center"><input type="submit" value = "send" /> </br></p>
                
            </form>
    </body>
</html>
