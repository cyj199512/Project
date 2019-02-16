<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="jspServlet.vo.Cart"%>
<%@page import="jspServlet.dao.CartDAO"%>
<%@page import="jspServlet.dao.impl.CartDAOImpl"%>
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
<title>Cart</title>
<link href="css/bootstrapnew.css" rel='stylesheet' type='text/css' />
<link href="css/styledouble.css" rel="stylesheet" type="text/css" media="all" />



<link rel="shortcut icon" href="../favicon.ico"> 
		<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>	
		
		
		
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.minmin.js"></script>
<script src="js/jquery.min.js"></script>
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

<!---- tabs---->
<link type="text/css" rel="stylesheet" href="css/easy-responsive-tabs.css" />
	<script>
		function sc(obj)
		{
			window.location.href="CartServlet?bs=delete&id="+obj;
		}
	
	</script>
	<script>
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
    });</script>
</head>
<body>




	

<!---->
<div class="header">
	 <div class="container">
		 <div class="header-left">
			 <div class="top-menu">
				<div class="top-menu">
				 <ul>
				<li ><a href="welcome.jsp">HOME</a></li>
                 <li><a href="about.jsp">ABOUT</a></li>
		         <li class="active"><a href="<%=basePath%>ProductServlet">STORE</a></li>
                  <li><a href="contact.jsp">CONTACT</a></li>		 
				 </ul>
			 </div>
			 </div>
		 </div>
		 <div class="logo">
			 <a href="index.jsp"><img src="images/logo.png" alt=""/></a>
		 </div>
		 <div class="header-right">
				 
			 <div class="signin">
				  <div class="cart-sec">
				  <a href="cart.jsp"><img href="cart.jsp" src="images/cart.png" alt=""/>
				  <%
				  double sum = 0L;
				  CartDAO dao = new CartDAOImpl();
				  	if (session.getAttribute("username") != null)
				  	{
				  		String name = session.getAttribute("username")+"";
				  		%><%=dao.myCartCount(name)%><%
				  	}else
				  	{
				  		%>0)<%
				  	}
				  %>
				  (</a></div>
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
<div class="cart">
	 <div class="container">
		 <div class="cart-info">
		   <div class=" cart-items">
			 <h3>My Shopping Bag <%
				  	if (session.getAttribute("username") != null)
				  	{
				  		String name = session.getAttribute("username")+"";
				  		%><%=dao.myCartCount(name)%><%
				  	}else
				  	{
				  		%>0)<%
				  	}
				  %></h3>
				<script>$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
						});	  
					});
			   </script>
			<script>$(document).ready(function(c) {
					$('.close2').on('click', function(c){
						$('.cart-header1').fadeOut('slow', function(c){
							$('.cart-header1').remove();
						});
						});	  
					});
			   </script>
				
				  <div class="in-check" >
		  <ul class="unit">
			<li><span>Item</span></li>
			<li><span>Product Name</span></li>		
			<li><span>Unit Price</span></li>
			<li><span>Stock Status</span></li>
			<li> </li>
			<div class="clearfix"> </div>
		  </ul>
		  
		  <%
		  		if (session.getAttribute("username") != null)
		  		{
		  			String uname = session.getAttribute("username")+"";
		  			List<Cart> list = dao.myCart(uname);
		  			for (Cart q : list)
		  			{
		  				sum += Double.parseDouble(q.getPrice());
		  				%>
		  				
		  							  <ul class="cart-header">
		   <div class="close1"> </div>
			<li class="ring-in"><img src="<%=q.getPath() %>" class="img-responsive" alt="">
			</li>
			<li><span><%=q.getPname() %></span></li>
			<li><span>$ <%=q.getPrice() %></span></li>
			<li><span>In Stock</span></li>
			<li> 
			
			
			
			<div class="md-modal md-effect-1" id="modal-1">
			<div class="md-content">
				<h3>BUY IT!</h3>
				<div>
				<ul>
						<li><strong>You have chosed a music box</strong>  </li>
						<li><strong> Name:    </strong>${product.name}</li>
						<li><strong>Price:    </strong>${product.price}</li>
					<li>
					<button class="md-close">Close!</button></li>
					
					<button class="md-trigger" data-modal="modal-5">Buy!</button>
					</ul>
				</div>
			</div>
		</div>
		
		
		
		
		
	<div class="md-modal md-effect-3" id="modal-3">
			<div class="md-content">
				<h3> Delet </h3>
				<div>
					<ul>
						<li><strong>You have choesd</strong> to delet a product </li>
						<li><strong> Name:     </strong> ${product.name}</li>
						<li><strong>Price:     </strong> ${product.price}</li>
					  <li><button class="md-close">Close!</button></li>
				     <button class="md-trigger" data-modal="modal-4">Delet!</button>
					</ul>
				</div>
			</div>
		</div>	
		
		
		<div class="md-modal md-effect-4" id="modal-4">
			<div class="md-content">
				<h3> Delet </h3>
				<div>
					
					<ul>
						<li><strong>You have delet one product</strong> </li>
						
					</ul>
					<button class="md-close">Close me!</button>
					
				</div>
			</div>
		</div>
		
		<div class="md-modal md-effect-5" id="modal-5">
			<div class="md-content">
				<h3> Buy </h3>
				<div>
					
					<ul>
						<li><strong>You have brought one product!</strong> </li>
						
					</ul>
					<button class="md-close">Close me!</button>
					
				</div>
			</div>
		</div>
		
		
		
		
		
		<div class="column">
			<button class="md-trigger" data-modal="modal-1">BUY IT </button>
			 
			
			<button class="md-trigger" onclick="sc(<%=q.getId()%>)" data-modal="modal-3">DELET IT</button>
		</div>
		</li>
			<div class="clearfix"> </div>
	   </ul>
		  				<%
		  			}
		  		}
		  		
		  %>

	   <div style=" font-family: 20px;color: black;">price:<%=sum%></div>
	   
 
		</div>
		   </div>
					  
		 </div>
		 

  </div>
		 <p>&nbsp;</p>
		 </div>
		 
		 
		 
		<script src="js/classie.js"></script>
		<script src="js/modalEffects.js"></script>

		<!-- for the blur effect -->
		<!-- by @derSchepp https://github.com/Schepp/CSS-Filters-Polyfill -->
		<script>
			// this is important for IEs
			var polyfilter_scriptpath = '/js/';
		</script>
		<script src="js/cssParser.js"></script>
		<script src="js/css-filters-polyfill.js"></script>	
		
		 
		 
		 
		 
		 
	





	 
		 
		 
		 
		 
		 
		 
		 
		 
	 <div class="cart-list">
			<h3>Categories</h3>
			<div class="col-md-4 carting">			
				 <ul>
					 <li><a href="#">Always free from repetition</a></li>
					 <li><a href="#">Vestibulum rhoncus nibh quis dui fermentum iaculis.</a></li>
					 <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					 <li><a href="#">In consequat dolor in lorem egestas ultrices.</a></li>
					 <li><a href="#">Aliquam sollicitudin eros id luctus consequat.</a></li>
					 <li><a href="#">Always free from repetition</a></li>
				 </ul>	
			</div>
			<div class="col-md-4 carting">			
				 <ul>
					 <li><a href="#">Always free from repetition</a></li>
					 <li><a href="#">Vestibulum rhoncus nibh quis dui fermentum iaculis.</a></li>
					 <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					 <li><a href="#">In consequat dolor in lorem egestas ultrices.</a></li>
					 <li><a href="#">Aliquam sollicitudin eros id luctus consequat.</a></li>
					 <li><a href="#">Always free from repetition</a></li>
				 </ul>	
			</div>
			<div class="col-md-4 carting">			
				 <ul>
					 <li><a href="#">Always free from repetition</a></li>
					 <li><a href="#">Vestibulum rhoncus nibh quis dui fermentum iaculis.</a></li>
					 <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					 <li><a href="#">In consequat dolor in lorem egestas ultrices.</a></li>
					 <li><a href="#">Aliquam sollicitudin eros id luctus consequat.</a></li>
					 <li><a href="#">Always free from repetition.</a></li>
			     </ul>	
	   </div>
			<div class="clearfix"></div>
	 </div>
	 </div>
</div>

<div class="indo">
				<p class="in">Music Box <span>payment</span></p>
					<ul class="social-footer ">
						<li><span><i> </i>+82088208820</span></li>
						<li><span><i class="down"> </i> Changping district of Beijing north seven town Zheng Gezhuang village.</span></li>
						<li><a href="mailto:info@example.com"><i class="mes"> </i> musicbox@126.cm</a></li>
						<li><a href="#"><i class="mes-in"> </i>You can also give us a message on the site </a></li>
					</ul>
			        <a href="#"><img  align="middle" src="images/pa.png" alt=""></a></div>



<div class="indo">
				<p class="in">&nbsp;</p>
					</div>







<!---->
<div class="footer">
	 <div class="container">
		 <p>Copyright &copy; 2015.Company name All rights reserved.</p>
		 <div class="social">
			 <a href="#"><span class="icon1"></span></a>
			 <a href="#"><span class="icon2"></span></a>
			 <a href="#"><span class="icon3"></span></a>
			 <a href="#"><span class="icon4"></span></a>
		 </div>
		 <div class="clearfix"></div>
  </div>	 
</div>
<!---->		
</body>
</html>