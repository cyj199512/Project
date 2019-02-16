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
<title>Contact</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://ajax.useso.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Custom Theme files -->

<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<!---- tabs---->
<link type="text/css" rel="stylesheet" href="css/easy-responsive-tabs.css" />


<link href='http://fonts.useso.com/css?family=Raleway:400,800,500,600' rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/set2.css" />
        <link rel="stylesheet" type="text/css" href="css/set1.css" />
		<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.2.0/css/font-awesome.min.css" />









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
<!--CONTACT-->
<div class="contact">
	 <div class="container">		 
		 
                
                
              
               <div class="contact-head">		
				<h2>CONTACT US</h2>  
           

                <p>
Our brand founded in 2016, the headquarters is located in changping district in Beijing. Members are mostly young generation after 90.<br>
The foundation of our brand is the warm and memory. Believe that with everyone's childhood music box, music box gives us warm when we are young, and as the years go into our precious memories, one day we are old, young music box notes are not, once the memory will always keep us companied.<br>
Our music box is committed to give you the most warm companion, the enjoyment of the most unique, the most glorious memories. Not only the traditional style of music box on modelling and more popular at the present time of unique and novel styles, sure can meet the needs of each customer. <br>
				</p>
		 </div>
         
         
         
         
         
         
         
         
         
          
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
		 <div class="col-md-8 contact-left">
			 <form class="contact-details">
					 <input type="text" class="text" value="Your Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Name';}">
					 <input type="text" class="text" value="Your mail" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your mail';}">
					 <input type="text" class="text" value="Subject" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Subject';}">
					 <textarea onfocus="if(this.value == 'Message') this.value='';" onblur="if(this.value == '') this.value='Message';" >Message</textarea>	
					 <div class="clearfix"></div>
					 <input type="submit" value="SEND MESSAGE">
			 </form>
		 </div>
         
        
        
        
     <div class="content">
				<h2>About us</h2>
				<div class="grid">
					<figure class="effect-julia">
						<img src="images/us1.jpg" alt="img21"/>
						<figcaption>
							<h2>YaJi<span> Cui </span></h2>
							<div>
								<p>Your background engineer.</p>
								<p>He is very enjoy coding.</p>
								<p>Thanks for choose music Box.</p>
							</div>
							
						</figcaption>			
					</figure>
					<figure class="effect-julia">
						<img src="images/us3.jpg" alt="img22"/>
						<figcaption>
							<h2>YiXuan <span>Li</span></h2>
							<div>
								<p>Your background engineer.</p>
								<p>She loves to manage things.</p>
								<p>Thanks to choose Music Box</p>
							</div>
							
						</figcaption>			
					</figure>
                    <figure class="effect-julia">
						<img src="images/us2.jpg" alt="img22"/>
						<figcaption>
							<h2>Dan <span>Luo</span></h2>
							<div>
								<p> Your front desk designer.</p>
								<p>She loves to desiign new things.</p>
								<p>Thanks to choose Music Box.</p>
							</div>
							
						</figcaption>			
					</figure>
	   
             <figure  class="effect-julia"> 
			
           <embed src="media/flash.gif" width="814"  height="340"></embed>
    	
    </figure>	
          </div>      
      	</div>      	
			
        <script>
			// For Demo purposes only (show hover effect on mobile devices)
			[].slice.call( document.querySelectorAll('a[href="http://www.htmleaf.com/"') ).forEach( function(el) {
				el.addEventListener( 'click', function(ev) { ev.preventDefault(); } );
			} );
		</script>   
        
        
        
        
        
        
        
        
			
         
         
         
         
		
         <div class="col-md-4 company_address">
          
           </div>      

			<!---->
			
			<!---->
	 </div>	 
</div>
<!--CONTACT Ends-->
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
<!---->		
</body>
</html>