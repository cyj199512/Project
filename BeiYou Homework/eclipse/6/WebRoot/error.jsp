<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    <title>login</title>
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
<script type="text/javascript">
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
</script>
<!---- tabs---->
  </head>
  <body>

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
<!---->
<div class="bd">
	 <div class="container">
	 	 <form  action="<%=basePath%>/login" method="post">
		 <h2>Sorry, your information was wrong. <br>Please Login again.</h2>
		 
		 <div class="col-md-6 log">			 
				 <p>Welcome, please enter the following to continue.</p>
				 <p>If you have previously Login with us, <span>click here</span></p>
				
					 <h5>User Name:</h5>	
					<td width="233"><input type="text" id="username" name="username"/>
					 <h5>Password:</h5>
					 <input type="password" id="password" name="password"/></td>					
						<input type="SUBMIT" name="submit" value="Login"/>
						<input type="reset" value="Reset"/>
					  <a href="#">Forgot Password ?</a>
				 				 
		 </div>
		  <div class="col-md-6 login-right">
			  	<h3>NEW REGISTRATION</h3>
				<p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
				<a class="acount-btn" href="register.jsp">Create an Account</a>
		 </div>
		 </form>
		 
		 <div class="clearfix"></div>
		 
		 <div class="navigation">
			 
			
		 </div>
		 </div>
	 </div>
	 <!---->
<div class="footer">
	 <div class="container">
		 <p>Copyright &copy; Music Box name All rights reserved.</p>
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






