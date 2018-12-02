/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.Apartment;
import Modal.ApartmentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "MyApartments", urlPatterns = {"/MyApartments"})
public class MyApartments extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        ApartmentDAO ad = new ApartmentDAO();
        
        //String search = request.getParameter("search");
        
        //String search = "haryana";
        
        HttpSession session = request.getSession();
        
        String uname = (String)session.getAttribute("um");
        
        //System.out.println(uname);
        
        ArrayList<Apartment> l = ad.myApartments(uname);
        
        session.setAttribute("myAlist",l);
        
        response.sendRedirect("UserApartments.jsp");
    }


}
