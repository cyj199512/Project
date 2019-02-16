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
        <title>Add Movie</title>
    </head>
    <body>
        <h1>Add Movies</h1>
          <form action="movie.do" method="POST">
            <label> Movie Title:  </label><input type="text" name="title" /></br>
            <label> Lead Actor:  </label><input type="text" name="actor" /></br>
            <label> Lead Actress:  </label><input type="text" name="actress" /></br>
            <label> Gene:  </label><input type="text" name="gene" /></br>
            <label> Year:  </label><input type="text" name="year" /></br>
            <input type= "hidden" name="part" value = "add"/></br>
            
            <input type="submit" value="Add Movie"/>
        </form>
    </body>
</html>
