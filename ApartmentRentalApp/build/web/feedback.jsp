<%
    if(request.getSession().getAttribute("um") == null)
    {
        %>
        <script>
            location = "HomePage.jsp";
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
        </style>
    </head>
    <body>
        <hr size="10" color="black">
         <div class="topnav">
             <a href="UserPage.jsp">Home</a>
             <a href="about.jsp">About</a>
             <a href="userapartmentss">My Apartments</a>
             <a class="active" href="feedback.jsp">FeedBack</a>
             <a href="upload.jsp">Upload</a>
             <a style="float:right;" href="SignOut.jsp">Sign Out</a>
             <form action="SearchApartments" style="float:right;">
             <input type="text" name="search" placeholder="Enter Location">
             <button type="submit">Search</button>
             </form>
         </div> 
        <br>
        <br>
    </body>
</html>
<%
    }
%>