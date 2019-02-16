<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="jspServlet.vo.Product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

List list = (List)request.getAttribute("list");
   HttpSession sessions=request.getSession();
      String username = (String)sessions.getAttribute("username");
%>


<!DOCTYPE html>
<html>
<head>
<title>Product</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/hover.css" rel="stylesheet" media="all">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->

 <link href="video-js/video-js.css" rel="stylesheet" type="text/css">
 <script src="video-js/video.js"></script>
 <script>
   videojs.options.flash.swf = "video-js/video-js.swf";
 </script>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<script src="jsery/2.1.1/jquery.min.js"></script>

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


<div class="men-fashions">
	 <div class="container">		
		 <div class="col-md-9 fashions">
			 <div class="title">
				 <h3>TOPS - TITLE</h3>
				 
				 <video id="my_video_1" class="video-js vjs-default-skin" controls    preload="auto"width="640"height="480"poster="video-js/my_video_poster.png"    data-setup="{}">
        <source src="media/Group 20 video.mp4" type='video/mp4'> 
      </video>
			 </div>
			 

             <div class="fashion-section">
				 <div class="fashion-grid1">
              
                <c:forEach var="list" items="${list}">
           
                 <div class="col-md-4 fashion-grid">
						 <a href="<%=basePath%>productSingle?id=${list.id}"><img src="${list.path}"  alt=""/>
							 <div class="product">
								 <h3>${list.name}</h3>
								 <p><span></span> ${list.price} &euro;</p>								 
							 </div>							 
						 </a>
						 <div class="fashion-view"><span></span>
									<div class="clearfix"></div>
								 <h4><a href="<%=basePath%>productSingle?id=${list.id}">Quick View</a></h4>
						 </div>
				 </div>
				 
           
				</c:forEach>
                
                  
                    
					 </div>
					 <div class="clearfix"></div>
				 
			 </div>
		 </div>
		  
          
          
          
          
          
          <div class="col-md-3 side-bar">
			  <div class="categories">
					<h3>CATEGORIES</h3>
				  <ul>
						<li><a href="#">name1</a></li>
						<li><a href="#">name2</a></li>
						<li><a href="#">namw3</a></li>
						<li><a href="#">name4</a></li>
						<li><a href="#">name5</a></li>
						<li><a href="#">name6</a></li>
						<li><a href="#">name7</a></li>
						<li><a href="#">name8</a></li>
						
						
				  </ul>
			  </div>
			  <div class="sales">
				 <h3>SALE</h3>
				 <div class="pricing">
					 <h4>Price range</h4>
					 <input type="text" placeholder="price from" required/>
					 <input type="text" placeholder="price to" required/>
					 <div class="clearfix"></div>
				 </div>
				 
			  </div>
		 </div>
		 <div class="clearfix"></div>
	 </div>
</div>

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
		