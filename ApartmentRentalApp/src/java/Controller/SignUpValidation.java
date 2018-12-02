/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.UserDAO;
import Modal.UserDataBase;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

/**
 *
 * @author NIKHIL-PC
 */
@WebServlet(name = "SignUpValidation", urlPatterns = {"/SignUpValidation"})
public class SignUpValidation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        String uname = request.getParameter("UserName");
        
        String fname = request.getParameter("fn");
        
        String lname = request.getParameter("ln");
        
        String pwd = request.getParameter("pwd");
        
        String repwd = request.getParameter("repwd");
        
        String mobileno = request.getParameter("mno");
        //out.println(uname);
        //int mno = request.getParameter("mno");
        
        String dob = request.getParameter("Date");
        //System.out.println(fname+" "+lname);
        UserDataBase u = new UserDataBase();
        
        u.setDob(dob);
        
        u.setFirstname(fname);
        
        u.setLastname(lname);
//        try {
            
        u.setMobileno(mobileno);
        
//        }
//        catch(Exception e) {
//        
//        }
        
        u.setPassword(pwd);
        
        u.setUsername(uname); 
        
        UserDAO ud = new UserDAO();
        
//        int a = ud.getSno();
//        
//        a++;
//        
//        u.setSno(a);
        
        int size;
        
//        try {
//           
//           int m = Integer.parseInt(mobileno);
//           
           size = mobileno.length();
           
//        }
//        
//        catch(Exception e) {
//         
//            size = 0;
//        } 
        
       int psize = pwd.length();
//        
//        String[] date = dob.split("/");
        
        boolean datecheck = false;
        
//        if(date.length != 3) {
//           
//            datecheck = false;
//            
//        }
//        
//        else {
//        
//            //datecheck = true;
//            if(date[0].length() <= 2 && date[1].length() <= 2 && date[2].length() == 4) {
//            
//                datecheck = true;
//            }
//            else {
//            
//                datecheck = false;
//            }
//        }

//         SimpleDateFormat sdfrmt = new SimpleDateFormat("MM-dd-yyyy");
//        
//          try {
//          
//              Date javaDate = sdfrmt.parse(dob);
//              LocalDate currentdate = java.time.LocalDate.now();
//              Date curdate = sdfrmt.parse(""+currentdate);
//              
//              if(javaDate.compareTo(curdate) >= 0) {
//              
//                  datecheck = false;
//              }
//              
//              else {
//                  String[] datesize = dob.split("-");
//                  
//                  String ldate = ""+currentdate;
//                  
//                  String[] ldatesize = ldate.split("-");
//                  
//                  if((Integer.parseInt(ldatesize[2]) - Integer.parseInt(datesize[2]) ) < 18) {
//                  
//                      datecheck = false;
//                  }
//                  
//                  else {
//                      
//                    datecheck = true;
//                  }  
//              }
//          }
//          catch(Exception e) {
//          
//              datecheck = false;
//              
//          }
          
//        finally {
              
          
        if(!pwd.equals(repwd)) {
         
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Retype password doesnot match!');");
            out.println("location='SignUp.jsp';");
            out.println("</script>");
        }
        
        else if(!ud.checkUser(u)){
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('UserName already taken enter valid UserName!');");
            out.println("location='SignUp.jsp';");
            out.println("</script>");
        
        }
        
        else if(size != 10) {
        
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Enter valid Mobile number!');");
            out.println("location='SignUp.jsp';");
            out.println("</script>");
            
        }
        
        else if(psize < 10) {
        
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Password should be aleast 10 characters long!');");
            out.println("location='SignUp.jsp';");
            out.println("</script>");
            
        }
        
        else if(datecheck) {
        
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Enter valid date!');");
            out.println("location='SignUp.jsp';");
            out.println("</script>");            
        }
        
        
        
        else {
            
            if(ud.save(u)) {
                
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sign Up Successfull!');");
                out.println("location='Login.jsp';");
                out.println("</script>");
                
            }  
            
            else {
            
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sign Up failed enter valid data!');");
                out.println("location='SignUp.jsp';");
                out.println("</script>"); 
            }
        }
        
//       }
//        else if(uname.equals("abc") && pwd.equals("123")) {
//            
//            //out.println("Login Sucessfully");
//           try{
//               
//            RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
//            rd.forward(request,response);
//            
//           }
//           catch(Exception e) {
//               
//               out.println(e);
//           }
//        }
//        
//        else {
//            
////            out.println("Login Failed");
////            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
////            rd.forward(request,response);
//
//              out.println("<script type=\"text/javascript\">");
//              out.println("alert('User or password incorrect');");
//              out.println("location='Login.jsp';");
//              out.println("</script>");
//        
//        }
    }

    
}
