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
            <title>Part 8</title>
	</head>
 
	<body>
            <h2 align="center">How many books do you want to add?</h2><br>
        
            
            <form method = "POST" action = "book.do">
                <input type="text" name ="bookNum" >
                <input type ="hidden" name="part" value="index">
                <input type="submit" value = "Submit" /> </br></p>
                
            </form>
            
         
            
	</body>
	
 
</html>

