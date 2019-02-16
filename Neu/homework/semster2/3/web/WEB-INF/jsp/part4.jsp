<%-- 
    Document   : part4
    Created on : 2019-2-9, 20:29:47
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomeWork 3</title>
    </head>
    <body>
        <c:out value="${'Part 4'}"/><p></p>
        <c:out value="${'Core'}"/>
        <c:set var="Income" scope="session" value="${1234*5}"/>  
        <p>Before Remove Value is: <c:out value="${Income}"/> </p>
        <c:remove var="Income"/>  
        <p>After Remove Value is: <c:out value="${Income}"/></p>
        
        <c:catch var ="catchtheException">  
            <% int x = 2/0;%>  
        </c:catch>  
        <c:if test = "${catchtheException != null}">  
            <p>The type of exception is : ${catchtheException} <br />  
            There is an exception: ${catchtheException.message}</p>  
        </c:if>
            
        <c:choose>  
            <c:when test="${income <= 1000}">  
                Income is not good.  
             </c:when>  
            <c:when test="${income > 10000}">  
                Income is very good.  
            </c:when>  
            <c:otherwise>  
               Income is undetermined...  
            </c:otherwise>  
        </c:choose> 
               
        <c:forTokens items="cui- ya-ji" delims="-" var="name">  
            <c:out value="${name}"/>
        </c:forTokens>  
                
        <c:url value="/index1.jsp" var="completeURL">  
            <c:param name="trackingId" value="786"/>  
            <c:param name="user" value="Nakul"/>  
        </c:url>  
        ${completeURL} 
        
        <c:out value="${'Function'}"/><p></p>
        
        <c:set var="s" value="Welcome to javatpoint"/>  
        <c:if test="${fn:contains(s, 'javatpoint')}">  
           <p>Found javatpoint string<p>  
        </c:if>  

        <c:if test="${fn:contains(s, 'JAVATPOINT')}">  
           <p>Found JAVATPOINT string<p>  
        </c:if> 
        <c:if test="${fn:containsIgnoreCase(s, 'JAVATPOINT')}">  
            <p>Found JAVATPOINT string (ignore)<p>  
        </c:if>  
        <c:if test="${fn:endsWith(s, 'javatpoint')}">  
            <p>String ends with javatpoint<p>  
        </c:if>
        <p>Index-1 : ${fn:indexOf(s, "to")}</p>
        ${fn:toUpperCase(s)} 
        
         <c:out value="${'Formatting'}"/><p></p>
         
        <h3>Formatting of Number:</h3>  
        <c:set var="Amount" value="9850.14115" />  
        <p> Formatted Number-1:  
        <fmt:formatNumber value="${Amount}" type="currency" /></p>  
        <p>Formatted Number-2:  
        <fmt:formatNumber type="number" groupingUsed="true" value="${Amount}" /></p>  
        <p>Formatted Number-3:  
        <fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p>  
        <p>Formatted Number-4:  
        <fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /></p>  
        <p>Formatted Number-5:  
        <fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}" /></p>  
        <p>Formatted Number-6:  
        <fmt:formatNumber type="number" pattern="###.###$" value="${Amount}" /></p>  
        
        <c:set var="date" value="12-02-2019" />  
        <fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
        <p><c:out value="${parsedDate}" /></p>  
        
        <c:set var="date" value="<%=new java.util.Date()%>" />  
        <p><b>Date and Time in Indian Standard Time(IST) Zone:</b> <fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p>  
        <fmt:setTimeZone value="GMT-10" />  
        <p><b>Date and Time in GMT-10 time Zone: </b><fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p> 
        
         <c:out value="${'XML'}"/><p></p>
         
         <c:set var="vegetable">  
            <vegetables>  
                <vegetable>  
                  <name>onion</name>  
                  <price>40/kg</price>  
                </vegetable>  
             <vegetable>  
                  <name>Potato</name>  
                  <price>30/kg</price>  
                </vegetable>  
             <vegetable>  
                  <name>Tomato</name>  
                  <price>90/kg</price>  
                </vegetable>  
            </vegetables>  
        </c:set>  
         
        <x:parse xml="${vegetable}" var="output"/>  
        <b>Name of the vegetable is</b>:  
        <x:out select="$output/vegetables/vegetable[1]/name" /><br> 
        <b>Price of the onion is</b>:  
        <x:out select="$output/vegetables/vegetable[1]/price" /> <br>
        <b>Name of the vegetable is</b>:  
        <x:out select="$output/vegetables/vegetable[2]/name" /><br>
        <x:set var="fragment" select="$output/vegetables/vegetable[2]/price"/>  
        <b>Price of the Potato is</b>:  
        <x:out select= "$fragment"/> 
        
        <x:if select="$output/vegetables/vegetable/price < 100">  
             Vegetables prices are very low.  
        </x:if> 
             
       
        
        
    </body>
</html>
