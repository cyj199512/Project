<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   HttpSession sessions=request.getSession();
      String username = (String)sessions.getAttribute("username");
%>

<!DOCTYPE html>
<html>
  <head>
   
    <title>register</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://ajax.useso.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/hover.css" rel="stylesheet" media="all">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopper Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<!---- tabs---->
<link type="text/css" rel="stylesheet" href="css/easy-responsive-tabs.css" />
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
<script type="text/javascript" language="javascript">
    $(document).ready(function () {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'default', //Types: default, vertical, accordion           
            width: 'auto', //auto or any width like 600px
            fit: true,   // 100% fit in a container
            closed: 'accordion', // Start closed if in accordion view
            activate: function(event) { // Callback function if tab is switched
                var $tab = $(this);
                var $info = $('#tabInfo');
                var $name = $('span', $info);
                $name.text($tab.text());
                $info.show();
            }
        });

        $('#verticalTab').easyResponsiveTabs({
            type: 'vertical',
            width: 'auto',
            fit: true
        });
    }); 
  
   function tijiao(){
		
		var password = document.getElementById("password").value;
		var password2 = document.getElementById("password2").value;
		if(!password || !password2){
			alert("password and check password is not null");
		}else if(password != password2){
			alert("password and check password is equal");
		}else{
			  var form = document.getElementById("form");  
			
			  form.submit(); 
		}
}
</script>  

 
</head>

<body>
<!---->
<div class="header men">
	 <div class="container">
     
     
     
		 <div class="header-left">
         
         
         		
 
     
         
			 <div class="top-menu">
				 <ul>
				<li class="active"><a href="welcome.jsp">HOME</a></li>
                 <li><a href="about.jsp">ABOUT</a></li>
		  <li><a href="<%=basePath%>ProductServlet">STORE</a></li>
                  <li><a href="contact.jsp">CONTACT</a></li>		 
				 </ul>
			 </div>
		 </div>
		 
		  
           <div class="header-left">
              <div style="margin-top: 4px;width:100px;height:80px;">
		 
			
             <img src="images/logo.jpg" alt="logo" style="width:100%;height:100%;" /></a>
            
		 </div>
          </div>
          
	  <div class="header-right">
			 <div class="signin">
			  
				  <div class="cart-sec">
				 
				  <a href="cart.jsp"><img href="cart.jsp" src="images/cart.png" alt=""/>(0)</a>
				  </div>
				  <c:if test="${empty username}">
				  	 <ul>
						 <li><a href="register.jsp">REGISTRATION</a> <span>/<span> &nbsp;</li>
						 <li><a href="login.jsp"> LOGIN</a></li>
					 </ul>	
				  </c:if>
				   <c:if test="${not empty username}">
				  	 <ul>
						 <li>welcome <span>/<span> &nbsp;</li>
						 <li><%=username %> <span>/<span> &nbsp;</li>
						  <li><a href="<%=basePath%>quitServlet">QUIT</a></li>
					 </ul>	
				  </c:if>
				 
				 	 
			 </div>
		 </div>
		 <div class="clearfix"></div>
	 </div>
</div>
<div class="bd">
	 <div class="container">
	  <form id="form" action="<%=basePath%>/register" method="post" >
		 <h2>Registration</h2>
		 <div class="col-md-6 reg-form">
			 <div class="reg">
				 <p>Welcome, please enter the folling to continue.</p>
				 <p>If you have previously registered with us, <a href="#">click here</a></p>
				 <form>
					 <ul>
    				<td width="165" ><label for="username"><span class="STYLE2">User name:</span></label></td>
    				<td width="246"><input type="text" id="username" name="username"/></td>
					 </ul>
					 <ul>

    				<td><label for="email"><span class="STYLE2">email:</span></label></td>
    				<td><input type="email" id="email" name="email"/></td>
					 </ul>
					 <ul>
    				<td><label for"password"><span class="STYLE2">password:</span></label></td>
    				<td><input type="password" id="password" name="password"/></td>
					 </ul>
					 <ul>
    				<td><label for"checkpswd"><span class="STYLE2">check password</span></label></td>
    				<td><input type="password" id="password2" name="password2"/></td>
					 </ul>					
					    <td height="100" ><input  type="button" value ="submit" onClick="tijiao();"/>
					 <p class="click">By clicking this button, you agree to my modern style </p> 
					 
					 
				 </form>
			 </div>
			 
		 </div>
			  <div class="clearfix"></div>
			  </div>
</div>
<!---->
<div class="footer">
	 <div class="container">
		 <p>Copyright &copy;Music Box name All rights reserved.</p>
		 <div class="social">
			 <a href="#"><span class="icon1"></span></a>
			 <a href="#"><span class="icon2"></span></a>
			 <a href="#"><span class="icon3"></span></a>
			 <a href="#"><span class="icon4"></span></a>
		 </div>
		 <div class="clearfix"></div>
	 </div>	 
</div>





</body>
</html>
