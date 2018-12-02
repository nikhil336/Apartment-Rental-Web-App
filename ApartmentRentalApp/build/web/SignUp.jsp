<%-- 
    Document   : SignUp
    Created on : 6 Nov, 2018, 6:56:41 PM
    Author     : NIKHIL-PC
--%>

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
                .form_data  .title {      position: absolute;     top: 0px;     right: 0;     left: 41%;     font-size: 22px;     font-weight: bold;  }
                .form_data fieldset {      position: relative;  }
                .form_data p input {      outline: 0;     background: #d3d3d3;     width: 100%;     border: 0;     margin: 0 0 15px;     padding: 15px;     box-sizing: border-box;     font-size: 14px;  }
                .form_data p { font-size: 19px;}
                .form_data  button {      padding: 20px;     width: 100%;     background: #000;     color: #fff;     font-size: 18px;     text-transform: uppercase;  }
                .form_data .checkbox {      float: left;     text-align: left;     display: block;     width: 10% !important;     margin-top: 6px !important;  }
                
                
        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>
		jQuery(document).ready(function () {
  //called when key is pressed in textbox
  jQuery("#number").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
               return false;
    }
   });
});
		</script>
    </head>
    <body>
        <hr size="10" color="black">
         <div class="topnav">
             <!--<a href="HomePage.jsp">Home</a>-->
             <a href="Login.jsp">Home</a>
             <a class="active" href="SignUp.jsp">Sign Up</a>
             <a href="abouthome.jsp">About</a>
         </div> 
        <br>
        <br>
        
        <form class='form_data' action="SignUpValidation" method="post" >
		<div class="main">
            <fieldset>
				<span class="title">Sign Up</span>
                <p>Firstname:</p>
                <p><input type="text" required name="fn" placeholder="Firstname"></p>
                
                <p>Lastname:</p>
                <p><input type="text" required name="ln" placeholder="Lastname"></p>
                
                <p>Date of Birth:</p>
                <p><input type="date" required name="Date" placeholder="mm-dd-yyyy"></p>
                
                <p>UserName:</p>
                <p><input type="text" required name="UserName" placeholder="abc@xyz.com"></p>
                
                <p>Password:</p>
                <p><input type="password" required name="pwd"></p>
                
                <p>ReType Password:</p>
                <p><input type="password" required name="repwd"></p>
                
                <p>Mobile no:</p>
                <p><input type="text" id="number" required name="mno" placeholder="XXXXXXXXXX"></p>
                <p><input class="checkbox" type="checkbox" required>I have accepted the <a href="sign.html">Terms and Conditions</a></p>
                
                <p><button type="submit">Sign Up</button></p>
                <p><button type="reset">Reset</button></p>
                <br>
            </fieldset>
		</div>
	</form>            
    </body>
</html>
