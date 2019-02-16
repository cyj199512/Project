<%-- 
    Document   : part8
    Created on : 2019-2-3, 20:16:35
    Author     : Richard
--%>

<!DOCTYPE html>
<html>
 
	<head>
            <meta charset="UTF-8">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="bootstrap_table/css/bootstrap.min.css">
            <link rel="stylesheet" href="bootstrap_table/css/bootstrap-table.min.css">
            <link rel="stylesheet" href="bootstrap_table/css/bootstrap-editable.css">
            <script src="bootstrap_table/js/jquery.min.js"></script>
            <script src="bootstrap_table/js/bootstrap.min.js"></script>
            <script src="bootstrap_table/js/vue.min.js"></script>
            <script src="bootstrap_table/js/bootstrap-table.min.js"></script>
            <script src="bootstrap_table/js/bootstrap-editable.js"></script>
            <script src="bootstrap_table/js/bootstrap-table-editable.js"></script>
            <title>Part 8</title>
          
            

	</head>
 
	<body>
           
        
              <% 
                  int num = 0;
                  String numString = null;
                try{
                    
                    if(session.getAttribute("bookNum")!= null){
                         numString = (String)session.getAttribute("bookNum");
                        num = Integer.valueOf(numString);
                    }
                }catch(Exception e){
                      
                }
             
             %>
            
            <form method = "POST" action = "book.do">
                <table border="5" align = "center">
                    <tr>
                        <td>ISBN</td>
                        <td>Book Title</td>
                        <td>Author</td>
                        <td>Price</td>
                    </tr>
                    <% for(int i = 0; i< num; i++){ 
                        String isbn = "isbn" + i;
                        String title = "title" + i;
                        String author = "author" + i;
                        String price = "price" + i;
                    %>
                    <tr>
                        <td><input type = "text" name =<%=isbn%>></td>
                        <td><input type = "text" name =<%=title%>></td>
                        <td><input type = "text" name =<%=author%>></td>
                        <td><input type = "text" name =<%=price%>></td>
                    </tr> 
                    <%}%>
                </table>
                <input type ="hidden" name="part" value="add">
                <input type ="hidden" name="bookNum" value=<%=numString%>>
                <p align="center"><input type="submit" value = "Submit" /> </br></p>
                
            </form>
            
         
            
	</body>
	
 
</html>

