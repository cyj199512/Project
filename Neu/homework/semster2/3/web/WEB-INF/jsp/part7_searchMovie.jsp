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
         <h1>Search Movies</h1>
        <form action="movie.do" method="POST">
            <p align="center"> <label> KeyWord:  </label><input type="text" name="keyWord" /></p></br>
            <p align="center"><input type="radio" name="searchType" value="title" >Search by Title</p><br>
            <p align="center"><input type="radio" name="searchType" value="actor" >Search by Actor</p><br>
            <p align="center"><input type="radio" name="searchType" value="actress" >Search by Actress</p><br>
             <p align="center"><input type= "hidden" name="part" value = "search"/></br>
            
             <p align="center"><input type="submit" value="Search Movie"/></p>
        </form>
    </body>
</html>
