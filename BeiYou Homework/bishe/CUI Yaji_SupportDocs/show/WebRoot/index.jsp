<%@page import="java.io.BufferedReader"%>  
<%@page import="java.io.FileReader"%>  
<%@page import="java.io.File"%> 
<%@ page import="java.io.*,java.util.*" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<script type="text/javascript">
function showImg(cell){
              document.getElementById('getImg').src= window.URL.createObjectURL(cell.files[0]);
             }
</script>
  <head>
    <base href="<%=basePath%>">
    
    <title>Show the result in MATLAB</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <style>
	 #wapper{
	 position:relative;
	 height:auto;
	 min-height:100%;
	 }
  #header {
 
    font-size: 36px;
    text-align:center;
    width: 100%;
}


  #footer {
  background-color:black;
    color:white;
    
    align:center;
   	 
   position: absolute;
	
	 width: 100%; 
	bottom:0px;
    left:0px;
 	 
}

  #footer1 {
  background-color:black;
    color:white;
    
    align:center;
   	 
   position: absolute;
	
	 width: 100%; 
	bottom:60px;
    left:0px;
 	 
}

  </style>
  <style type="text/css">      
     body{      
        background-image: url(background.jpg);      
        background-size:cover;    
     }  
     
  <!--
  .red {
   color: #F00;
   font-size: 41px;
  }
  -->
   <!--
  .white{
   color: #DC143C;
   font-size: 30px;
   
  }
  -->
    -->
   <!--
  .node{
   color: #F00;
   font-size: 30px;
   
  }
  -->
    
 </style>
  </head>
  
  <body>
   <div id="wapper">
    <div style="position: relative; top: 50%; left: 0; text-align: center; width: 100%; ">
    <input class="input1 input2 input6" type="file" name="file" onchange="showImg(this)" >
    </div>
    
 <div id="header">
 <%  
        //String filePath = request.getSession().getServletContext().getRealPath("/")+"JSP_Ajax"+"\\";  
        //System.out.println("filePath=="+filePath);  
        String pathtxt ="/Users/Richard/Desktop/m/";   // 这边文件目录需改成相对路径  
        File file = new File(pathtxt,"node.txt");  
        FileReader fr = new FileReader(file);  //字符输入流  
        BufferedReader br = new BufferedReader(fr);  //使文件可按行读取并具有缓冲功能  
        StringBuffer strB = new StringBuffer();   //strB用来存储jsp.txt文件里的内容  
        String str = br.readLine();  
        while(str!=null){  
            strB.append(str).append("<br>");   //将读取的内容放入strB  
            str = br.readLine();  
        }  
        br.close();    //关闭输入流  
    %>  
   
  
    <div style="position: relative; width: 100%; display: table; * position: absolute; * top: 50%; * left: 0;">
    	<p style="position: relative; top: 50%; left: 0; text-align: center; width: 100%; * top: 0;">
    	This figure shows a topological diagram of a<br/>
    	<strong class="red">
    	 <%=strB %></strong>-node complex network
    	</p>	
	</div>
	
	
 </div> 
 <div style="width: 500px;height:200px; position: relative; ">
 <img width="500px" id="getImg" style="width: 600px; height: 400px;position: absolute; left:60%; top: 50%; margin-left: -100px;margin-top: -50px;" />
 </div>
 
 <div style="text-align: right;">
 <%
 
 int lineNum = 0;
 BufferedReader br1 = new BufferedReader(new FileReader("/Users/Richard/Desktop/m/order.txt"));
 StringBuffer buffer = new StringBuffer();
 float max=0;
 int node=0;
 String record = new String();
 while ((record = br1.readLine()) != null) {
 	lineNum++;
 	if(Float.parseFloat(record)>=max){
 	max=Float.parseFloat(record);
 	node=lineNum;
 	}
 	buffer.append(record).append("<br>");
 	%>
 	 <strong class="white">
 	<% 
 	out.println(lineNum+" : "+record+"<br>");
 	%></strong>
 	<% 
 	}
 br1.close();
  %>
 
  
 </div>
 
 

    	<div id="footer1" >
    	<center>
    	<strong class="node">
    	The Most Important Node is The NODE <%=node %>: <%= max %></strong>
    	</center>
    	</div>
    
     
     
     
     
    
 
     
     
     <div id="footer">
     <div align="center" >
     <p>Research On Network Risk Assessment Based On Node Important
     </p>
     <%
   // 设置每隔5秒刷新一次
//    response.setIntHeader("Refresh", 5);
   // 获取当前时间
   Calendar calendar = new GregorianCalendar();
   String am_pm;
   int hour = calendar.get(Calendar.HOUR);
   int minute = calendar.get(Calendar.MINUTE);
   int second = calendar.get(Calendar.SECOND);
   if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
   else
      am_pm = "PM";
   String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
   out.println("Current Time: " + CT + "\n");
%>
</div>
</div>
</div>
     
  </body>
</html>
