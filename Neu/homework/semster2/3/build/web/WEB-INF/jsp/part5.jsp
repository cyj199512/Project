<%-- 
    Document   : part4
    Created on : 2019-2-9, 20:29:47
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Part 5</title>
        
        <style type="text/css">
            .left{
                float:left;
                width:150px;
                height:500px;
            }
            .right{
                margin-left:150px;
                height:500px;
            }
        </style>
    </head>
    
    <body>
        <h1>HOMEWORK3 Part5</h1>
        <hr />

        <div class= "left">
            <form name="part5" action="part5.do" method = "POST">
                <input type ="hidden" name="part5" value="books">
                <input type = "submit" value="Books"> 
            </form>
            <form name="part5" action="part5.do" method = "POST">
                <input type ="hidden" name="part5" value="musics">
                <input type = "submit" value="Musics"> 
            </form>
            <form name="part5" action="part5.do" method = "POST">
                <input type ="hidden" name="part5" value="computers">
                <input type = "submit" value="Computers"> 
            </form>
        
    
        </div>
        <div class = "right" id = "viewDiv">
            <c:if test="${not empty sessionScope.p5}">
                <c:set var="type5" scope="session" value="${sessionScope.p5}"/>
                <c:out value="${type5}"/>
                <c:if test="${type5 eq 'books' }">   
                    <form action = "cart.do" method = "GET">
                        <p align = "rihgt"><input type="hidden" name = "part5" value = "cart"></p>
                        <p align = "rihgt"><input type="submit"  value = "View_Cart" ></p>
                    </form>
                    <form action = "cart.do" method = "POST">
                        <p><input type="checkbox" name="books" value="JAVA Servlet Programming" /> JAVA Servlet Programming[$29.95]</p>
                        <p><input type="checkbox" name="books" value="Oracle Database Programming" /> Oracle Database Programming[$48.95]</p>
                        <p><input type="checkbox" name="books" value="System Analytic and Design with UML" /> System Analytic and Design with UML[$14.95]</p>
                        <p><input type="checkbox" name="books" value="Object Oriented Software Engineering" />Object Oriented Software Engineering[$35.99]</p>
                        <p><input type="checkbox" name="books" value="Java Web Service" /> Java Web Service[$27.99]</p>
                        <p><input type="hidden" name="tt" value="Jbook" /> </p>
                        <input type="submit" value="Add to Cart" />
                    </form>          
                </c:if>

                <c:if test="${type5 eq 'musics' }">   
                    <form action = "cart.do" method = "GET">
                        <p align = "rihgt"><input type="hidden" name = "tt" value = "cart"></p>
                        <p align = "rihgt"><input type="submit"  value = "View_Cart" ></p>
                    </form>
                    <form action = "cart.do" method = "POST">
                        <p><input type="checkbox" name="musics" value="I'm Going to Tell You a Secret by madoma" /> I'm Going to Tell You a Secret by madoma[$26.99]</p>
                        <p><input type="checkbox" name="musics" value="Baby One More Time by Bnitney Spears" /> Baby One More Time by Bnitney Spears[$10.95]</p>
                        <p><input type="checkbox" name="musics" value="Jutified by Juntin Timberfake" /> Jutified by Juntin Timberfake[$9.97]</p>
                        <p><input type="checkbox" name="musics" value="Loose by Nelly Furtado" />Loose by Nelly Furtado[$12.98}</p>
                        <p><input type="checkbox" name="musics" value="Gold Digger by kanye Weit" /> Gold Digger by kanye Weit[$27.99]</p>
                        <p><input type="hidden" name="tt" value="Jmusic" /> </p>
                        <input type="submit" value="Add to Cart" />
                    </form>     
                </c:if>

                <c:if test="${type5 eq 'computers' }">   
                    <form action = "cart.do" method = "GET">
                        <p align = "rihgt"><input type="hidden" name = "tt" value = "cart"></p>
                        <p align = "rihgt"><input type="submit"  value = "View_Cart" ></p>
                    </form>
                    <form action = "cart.do" method = "POST">
                        <p><input type="checkbox" name="computers" value="Apple Macbook Pro with 13.3'' Display" /> Apple Macbook Pro with 13.3'' Display[$1299.99]</p>
                        <p><input type="checkbox" name="computers" value="Asus Laptop with Centrino 2 Black" /> Asus Laptop with Centrino 2 Black[$949.95]</p>
                        <p><input type="checkbox" name="computers" value="HP Pavhon Laptop with Centrino 2 DV7" /> HP Pavhon Laptop with Centrino 2 DV7[$1199.95]</p>
                        <p><input type="checkbox" name="computers" value="Toshba Satellite Laptop with Centrino 2- Copper" />Toshba Satellite Laptop with Centrino 2- Copper[$899.99]</p>
                        <p><input type="checkbox" name="computers" value="Sony VAIO Laptop with Core 2 Duo Comportan Pink" /> Sony VAIO Laptop with Core 2 Duo Comportan Pink[$779.99]</p>
                        <p><input type="hidden" name="tt" value="Jcomputer" /> </p>
                    <input type="submit" value="Add to Cart" />
                    </form>  
                </c:if>
                <c:if test="${type5 eq 'cart' }"> 
                    <p><h2>The following item has been added to your shopping cart Successfully:</h2>
                    <p><h3>Books:</h3></p></br>
                    <c:if test="${not empty sessionScope.books}">
                        <c:forEach var="b" items="${sessionScope.books}">
                            <c:out value="${b}"/><p>
                        </c:forEach>
                    </c:if>
                    <p><h3>Musics:</h3></p></br>
                    <c:if test="${not empty sessionScope.musics}">
                        <c:forEach var="mus" items="${sessionScope.musics}"> 
                        <c:out value="${mus}"/><p>
                        </c:forEach>
                    </c:if>
                    <p><h3>Computers:</h3></p></br>
                    <c:if test="${not empty sessionScope.computers}">
                        <c:forEach var="c" items="${sessionScope.computers}">
                        <c:out value="${c}"/><p>
                        </c:forEach>
                    </c:if>
        
                </c:if>
            </c:if>

        </div>
    </body>
</html>
