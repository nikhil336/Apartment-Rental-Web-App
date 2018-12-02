<%
    if(request.getSession().getAttribute("um") != null)
    {
        %>
        <script>
            location = "UserPage.jsp";
        </script>
        <%
    }
    else
    {
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apartment Rental Application</title>
        <center><h1><b><font size="10pt" face="Castellar">Apartment Rental Application</font></b></h1></center>	
        <style>
            body {      background-image: url("the-kelvin-apartments-exterior.jpg");     background-color: #cccccc;     background-size: cover;     background-repeat: no-repeat;  }   
            
            .topnav {
                  overflow: hidden;
                  background-color: #333;
                }

                .topnav a {
                  float: left;
                  color: #f2f2f2;
                  text-align: center;
                  padding: 14px 16px;
                  text-decoration: none;
                  font-size: 17px;
                }

                .topnav a:hover {
                  background-color: #ddd;
                  color: black;
                }

                .topnav a.active {
                  background-color: #4CAF50;
                  color: white;
                }
                .form_data {max-width: 500px;margin: 0 auto;}
                .form_data .main {      width: 100%;     padding: 20px;     float: left;     background: #f2f2f2;     opacity: 0.7;  }
                .form_data  .title {      position: absolute;     top: 0px;     right: 0;     left: 44%;     font-size: 22px;     font-weight: bold;  }
                .form_data fieldset {      position: relative;  }
                .form_data p input {      outline: 0;     background: #d3d3d3;     width: 100%;     border: 0;     margin: 0 0 15px;     padding: 15px;     box-sizing: border-box;     font-size: 14px;  }
                .form_data p { font-size: 19px;}
                .form_data  button {      padding: 20px;     width: 100%;     background: #000;     color: #fff;     font-size: 18px;     text-transform: uppercase;  }
                .outer {width: 50%; float: left;}
                .inner_content {padding: 40px;}
                .inner_content h2 {font-size: 45px;	color: #eee;text-align: center;}

                .inner_content p a {padding: 22px;color: #fff; 	font-size: 20px; 	text-transform: uppercase; 	border: 0; 	background: #000; 	max-width: 200px; 	width: 100%;text-align: center; 	text-decoration: none; 	margin: 0 auto; 	display: block; }
           </style>
    </head>
        <body>
    
        <hr size="10" color="black">
         <div class="topnav">
             <!--<a href="HomePage.jsp">HOME</a>-->
             <a class="active" href="Login.jsp">Home</a>
             <a href="SignUp.jsp">Sign Up</a>
             <a href="abouthome.jsp">About</a>
         </div> 
         <br>
         <br>
		<div class="left outer">
		<div class="inner_content">
			<h2>Welcome To Apartment Rental App</h2>
			<p><a href="SignUp.jsp">Register Now</a></p>
		</div>
		</div>
	<div class="right outer">	 
        <form class='form_data' action="LoginValidation" method="post" >
        <div class="main">
         <fieldset>
            <span class="title">Login</span>
            <p>UserName:</p>
            <p><input type="text" required name="UserName" placeholder="abc@xyz.com"></p>
            <p>Password:</p>
            <p><input type="password" required name="Password" placeholder="Password"></p>
            <p><button type="submit">Login</button></p>
		</fieldset>
		</div>   
        </form>
	</div> 	
		
    </body>
</html>
<%
    }
%>