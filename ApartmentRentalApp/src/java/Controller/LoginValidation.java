/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NIKHIL-PC
 */
@WebServlet(name = "LoginValidation", urlPatterns = {"/LoginValidation"})
public class LoginValidation extends HttpServlet {

  
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        String uname = request.getParameter("UserName");
        
        String pwd = request.getParameter("Password");
                
        UserDAO ud = new UserDAO();
        
        System.out.println(uname+" "+pwd);
        
        if(ud.validateUser(uname,pwd)) {    
            //out.println("Login Sucessfully");
           try{
            //System.out.println("h");
            //out.print("Welcome, "+name);  
            HttpSession session=request.getSession();  
            session.setAttribute("um",uname);  
            response.sendRedirect("userapartmentss"); //UserPage.jsp
//            RequestDispatcher rd = request.getRequestDispatcher("UserPage.jsp");
//            rd.forward(request,response);
            //out.println("Login Success");
           }
           catch(Exception e) {
               
               out.println(e);
           }
        }
        
        else {
            
//            out.println("Login Failed");
//            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//            rd.forward(request,response);

              out.println("<script type=\"text/javascript\">");
              out.println("alert('User or password incorrect');");
              out.println("location='Login.jsp';");
              out.println("</script>");
        
        }
    }

 

}
