<%-- 
    Document   : part6
    Created on : 2019-2-9, 20:29:47
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Part 6</title>
    </head>
    <body>
        <form method = "POST" action = "search.do">
            <p align="center">Search by Name:
            <input type="text" name="csvName" ></br></p>    
            <p align="center"><input type="submit" value = "Search" /> </br></p>   
        </form>
        <c:if test="${not empty sessionScope.data}">
            <table>
                <tr>
                    <th>salesOrderID</th>
                    <th>revisionNumber</th>
                    <th>orderDate</th>
                    <th>dueDate</th>
                    <th>shipDate</th>
                    <th>status</th>
                    <th>onlineOrderFlag</th>
                    <th>salesOrderNumber</th>
                    <th>purchaseOrderNumber</th>
                    <th>accountNumber</th>
                    <th>customerID</th>
                    <th>salesPersonID</th>
                    <th>territoryID</th>
                    <th>billToAddressID</th>
                    <th>shipToAddressID</th>
                    <th>shipMethodID</th>
                    <th>creditCardID</th>
                    <th>creditCardApprovalCode</th>
                    <th>currencyRateID</th>
                    <th>subTotal</th>
                    <th>taxAmt</th>
                    <th>freight</th>
                    <th>totalDue</th>
                    <th>comment</th>
                    <th>modifiedDate</th> 
                </tr>
                 <c:forEach var="d" items="${sessionScope.data}">  
                <tr>
                    <td> <p> <c:out value="${d.salesOrderID}"/></p></td>
                    <td> <p> <c:out value="${d.revisionNumber}"/></p></td>
                    <td> <p> <c:out value="${d.orderDate}"/></p></td>
                    <td> <p> <c:out value="${d.dueDate}"/></p></td>
                    <td> <p> <c:out value="${d.shipDate}"/></p></td>
                    <td> <p> <c:out value="${d.status}"/></p></td>
                    <td> <p> <c:out value="${d.onlineOrderFlag}"/></p></td>
                    <td> <p> <c:out value="${d.salesOrderNumber}"/></p></td>
                    <td> <p> <c:out value="${d.purchaseOrderNumber}"/></p></td>
                    <td> <p> <c:out value="${d.accountNumber}"/></p></td>
                    <td> <p> <c:out value="${d.customerID}"/></p></td>
                    <td> <p> <c:out value="${d.salesPersonID}"/></p></td>
                    <td> <p> <c:out value="${d.territoryID}"/></p></td>
                    <td> <p> <c:out value="${d.billToAddressID}"/></p></td>
                    <td> <p> <c:out value="${d.shipToAddressID}"/></p></td>
                    <td> <p> <c:out value="${d.shipMethodID}"/></p></td>
                    <td> <p> <c:out value="${d.creditCardID}"/></p></td>
                    <td> <p> <c:out value="${d.creditCardApprovalCode}"/></p></td>
                    <td> <p> <c:out value="${d.currencyRateID}"/></p></td>
                    <td> <p> <c:out value="${d.subTotal}"/></p></td>
                    <td> <p> <c:out value="${d.taxAmt}"/></p></td>
                    <td> <p> <c:out value="${d.freight}"/></p></td>
                    <td> <p> <c:out value="${d.totalDue}"/></p></td>
                    <td> <p> <c:out value="${d.comment}"/></p></td>
                    <td> <p> <c:out value="${d.modifiedDate}"/></p></td>
                    
                </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
