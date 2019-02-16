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
<title>About</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://ajax.useso.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Custom Theme files -->

<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<link href='http://fonts.useso.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->

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
<div class="about">
	 <div class="container">
		 <div class="about-info">
		 <h2>About Us</h2>
		 <div class="about-pic">
		   <embed src="media/flash1.gif" width="306" height="350"></embed>
		 </div>
		 <div class="about-text">
          <h3>BRANDS</h3>
	      <p>The production of highly skilled, its clear, bright sound quality brings a wonderful enjoyment. Nowadays music box has become people to visit family and friends gifts.</p>
			 <p>
                Our brand founded in 2016, the headquarters is located in changping district in Beijing. Members are mostly young generation after 90.</p>
                <p>The foundation of our brand is the warm and memory. Believe that with everyone's childhood music box, music box gives us warm when we are young, and as the years go into our precious memories, one day we are old, young music box notes are not, once the memory will always keep us company 
</p>
<p>
Our music box is committed to give you the most warm companion, the enjoyment of the most unique, the most glorious memories. Not only the traditional style of music box on modelling and more popular at the present time of unique and novel styles, sure can meet the needs of each customer. 
 </p>
 	
	    </div>	
			<div class="clearfix"></div>	
			
		 <div class="about-section">
			 <div class="brands">
				 <h3>Delivery time and delivery way</h3>
                 <p> 


1.Domestic Orders </p>



<p>Our default with "YunDa express", customers can specify the express, please indicate in the order note or contact customer service. 



Now can send express: motion, every day, YunDa, zhongtong, yuantong, shentong 



Can send EMS, cost is more expensive. Whether or not this shop has a bag mail, EMS fee shall be borne by the buyer. Please understand. 



From Monday to Friday baby taken before 4 PM (to receive payment time shall prevail), under normal circumstances can be on the same day delivery. A special circumstances 48-72 hours. Double cease day only order no delivery! 
</p>	
<p>2. The Foreign Orders</p> 



<p>To China's time at around 18 to 22 days, the specific delivery time will be subject to customs release speed. The United States and China holidays don't shipment, postpone the arrival time. 
</p>
			 </div>
			 
             
             <div class="Fashion">
				 <h3>Return instructions </h3>
				 

                        <p>CAN EXCHANGE : </p>
<ol>
<li> if there is any quality problem, if there is problem of products please provide photos on this basis, determine the quality problems to be given a replacement. This store is responsible for the postage. Does not provide photos, don't contact the customer to send back directly, goods such as artificial damage cases, will not be accepted. </li>

<li> this site if not according to customer order delivery, customers can request a replacement, transfer the postage by our shop. Do not provide the order number shall not be liable for any problems. </li>

<li> a replacement shall be made within 24 hours after buyer received the goods, and will exchange goods mailed to the home station within 72 hours (delivery time). </li>
</ol>

 </p>            <p>OUR INFORMATION</p>
				 <ol>
					 <li>Address: Changping district of Beijing north seven town Zheng Gezhuang village. 
</li>
					 <li>Telepnohe :82088208820</li>
					 <li>E-mail:    musicbox@126.cm</li>
					 <li>You can also give us a message on the site 
</li>
				 </ol>			 
			 </div>
			 <div class="about-grids">
				 <div class="col-md-6 about-lists">
					 <h4>After-sales service </h4>
					 <ul>
						 <li>Please look for the music box logo oit is the same as the logo on the topo of this site.</li>
						 <li>You can also give us message on this site to ensure.</li>
						 <li>All the goods return unconditional.</li>
						 <li>Warranty period is one year.</li>
						 <li>If you have other needs, can leave a message on our website.</li>
						 <li>All messages will receive a response within 2 working days .</li>
                         <li>Thank you for the choose of the music box.</li>
					 </ul>
				 </div>
				 <div class="col-md-6 news">
					 <h4>Latest News</h4>						
							<div class="LatestNews">
								<h6>NEW PRODUCT銆�/h6>
								<span> 08/01/16 </span>
								<marquee><p>THE NWE PRODUCT WILL BE AIVILIABLE ON 08/01/16</p> </marquee>
							</div>			
							<div class="LatestNews">
								<h6>SALE銆�EASON</h6>
								<span>08/15/16 </span>
								<marquee><p>Promotional campaign will start on August 15th. 
 </p> </marquee>
							</div>
						
				 </div>
				 <div class="clearfix"></div>
			       </div>
		      </div>
	     </div>
	 </div>
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