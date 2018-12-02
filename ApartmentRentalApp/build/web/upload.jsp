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
                .form_data  .title {      position: absolute;     top: 0px;     right: 0;     left: 33%;     font-size: 22px;     font-weight: bold;  }
                .form_data fieldset {      position: relative;  }
                .form_data p input {      outline: 0;     background: #d3d3d3;     width: 100%;     border: 0;     margin: 0 0 15px;     padding: 15px;     box-sizing: border-box;     font-size: 14px;  }
                .form_data p { font-size: 19px;}
                .form_data  button {      padding: 20px;     width: 100%;     background: #000;     color: #fff;     font-size: 18px;     text-transform: uppercase;  }
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
             <a class="active" href="upload.jsp">Upload</a>
             <a href="about.jsp">About</a>
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
        
        <form class='form_data' action="Userapartment" method="post" style="background-color: #f2f2f2;" enctype="multipart/form-data">
		<div class="main">
         <fieldset>
            <span class="title">Add Apartment:</span>
                <p>Email:</p>
                <p><input type="text" required name="email" placeholder="abc@xyz.com" required></p>
                
                <p>Mobile No:</p>
                <p><input type="number" required name="mno" placeholder="XXXXXXXXXX"></p>
                
                <p>State:</p>
                <p><input type="text" required name="location" placeholder="state"></p>
                
                <p>Flat:</p>
                <p><input type="text" required name="flat" placeholder="bhks"></p>
                
                <p>Address:</p>
                <p><input type="text" required name="address" placeholder="address"></p>
                
                <p>Add Image:</p>
                <p><input type="file" required name="Image"></p>
                
                <p><button type="submit">Submit</button></p>
                <p><button type="reset">Reset</button></p>
                
            </fieldset>
                </div>
	</form>
    </body>
</html>
<%
    }
%>