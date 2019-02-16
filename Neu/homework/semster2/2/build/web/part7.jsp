<%-- 
    Document   : part7
    Created on : 2019-2-3, 20:16:35
    Author     : Richard
--%>

<!DOCTYPE html>
<html>
 
	<head>
            <meta charset="UTF-8">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
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

