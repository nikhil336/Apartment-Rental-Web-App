<%
    if(request.getSession().getAttribute("um") == null)
    {
        %>
        <script>
            location = "Login.jsp";
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
            body {
            background-image: url("the-kelvin-apartments-exterior.jpg");
            background-color: #cccccc;
            }   
            
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
			.first {width: 50%; float: left;  }

.search_form {  float: right;  margin: 0; 	}
	
.search_form input{outline: 0;background: #d3d3d3;border: 0;padding: 14px;box-sizing: border-box;font-size: 17px;  }
	
.search_form button{padding: 15px; color: #fff;font-size: 14px;text-transform: uppercase;border: 0;background: #000;  }
        </style>
    </head>
    <body>
        <hr size="10" color="black">
         <div class="topnav">
             <div class="first">
             <!--<a href="UserPage.jsp">Home</a>-->
             <a href="userapartmentss">My Apartments</a>
             <!--<a href="feedback.jsp">FeedBack</a>-->
             <a href="upload.jsp">Upload</a>
             <a class="active" href="about.jsp">About</a>
             <a href="RequestServlet">Requests</a>
             </div>
             <div class="first">
             <a style="float:right;" href="SignOut.jsp" >Sign Out</a>
             <form class="search_form" action="SearchApartments" style="float:right;">
             <input type="text" name="search" placeholder="Enter Location">
             <button type="submit">Search</button>
             </form>
             </div>
         </div> 
        <br>
        <br>
        
        <font style="font-style:verdana;font-size:22px;color:#fff;">
        <p style="color:#d3d3d3"><b>Incredible Selection</b></p>
        <p>Whether you want to stay in a chic city apartment, a luxury beach resort, or a cozy B&B in the countryside, Booking.com gives you amazing diversity and variety of choice – all in one place.</p><br>
        <p style="color:#d3d3d3"><b>Low Rates</b></p>
        <p>Booking.com guarantees to offer you the best available rates. And with our promise to price match, you can rest assured that you’re always getting a great deal.</p><br>
        <p style="color:#d3d3d3"><b>Instant Confirmation</b></p>
        <p>At Booking.com, every reservation is instantly confirmed. When you find your perfect stay, a few clicks are all it takes.</p><br>
        <p style="color:#d3d3d3"><b>No Reservation Fees</b></p>
        <p>We don’t charge you any booking fees or add any administrative charges. And in many cases, your booking can be canceled free of charge.</p><br>
        </font>
        
    </body>
</html>
<%
    }
%>