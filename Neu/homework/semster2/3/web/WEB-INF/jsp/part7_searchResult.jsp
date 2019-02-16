<%-- 
    Document   : part7
    Created on : 2019-2-9, 20:29:47
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
    </head>
    <body>
        <c:if test="${not empty sessionScope.movieList}">
            <h1>Your search for  ${sessionScope.keyWord}:</h1>
            <p><h2>Here are the search result: </h2><br>
            <c:forEach var="mo" items="${sessionScope.movieList}">  
                <p><h3>Movie Title:  <c:out value="${mo.title}"/></h3><br>
                <p><h3>Actor:  <c:out value="${mo.actor}"/>"</h3><br>
                <p><h3>Actress: <c:out value="${mo.actress}"/></h3><br>
                <p><h3>Genre:  <c:out value="${mo.gene}"/></h3><br>
                <p><h3>Year: <c:out value="${mo.year}"/></h3><br>
            </c:forEach>
            <form method = "POST" action = "movie.do">

                <input type= "hidden" name="part" value = "main"/>
                <input type="submit" value = "Click Here to go to the Main Page" /> 

            </form>
        </c:if>
    </body>
</html>
