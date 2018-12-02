/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.Apartment;
import Modal.ApartmentDAO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize=16177215)  //16177215
@WebServlet(name = "Userapartment", urlPatterns = {"/Userapartment"})
public class Userapartment extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        Apartment a = new Apartment();
        
        String email = request.getParameter("email");
        
        String mno = request.getParameter("mno");
        
        String location = request.getParameter("location");
        
        String address = request.getParameter("address");
        
        String flat = request.getParameter("flat");
        
        //byte[] b = request.getParameter("Image").getBytes();
        
        Part filePart = request.getPart("Image");
        
        InputStream is =filePart.getInputStream();
        
        //System.out.println(b);
        
        ApartmentDAO ad = new ApartmentDAO();
        
        a.setEmail(email);
        
        a.setAddress(address);
        
        a.setMobileno(mno);
        
        a.setFlat(flat);
        
        a.setLocation(location);
        
        //a.setPic(b);
        
        a.setIs(is);
        
        if(ad.saveApartments(a)) {
          
            HttpSession session = request.getSession();
            
            response.sendRedirect("userapartmentss");
          
        }
        
        else {
        
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed to enter Data!');");
            out.println("location='upload.jsp';");
            out.println("</script>");
        }
        
    }

  

}
