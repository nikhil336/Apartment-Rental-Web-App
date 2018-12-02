/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PermissionDAO {
 
    public boolean save(Permission p) {
    
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            String query="insert into permission values(?,?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(1,p.getAddress());
            
            pstmt.setString(2,p.getEmail());
            
            pstmt.setString(3,"false");
            
            int i = pstmt.executeUpdate();
            
            if(i != 0) {
                //System.out.println("i");
                flag = true;
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            
        }
        
        return flag;
    }
    
    public boolean changeStatus(String address,String email) {
        
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            String query="update permission set status='true' where address='"+address+"' and email='"+email+"';";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            int i = pstmt.executeUpdate();
            
            if(i != 0) {
                //System.out.println("i");
                flag = true;
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            
        }
        
        return flag;
    }
    
    public ArrayList<Permission> getRequests(String email) {
    
        ArrayList<Permission> a = new ArrayList<>();
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        boolean flag;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            Statement stmt1=con.createStatement();
            
            String query="select address from apartments where email='"+email+"';";
            
            ResultSet rs = stmt.executeQuery(query);
            
            ResultSet rs2;
            
            String query1;
            
            while(rs.next())
            {
                query1="select * from permission where address='"+rs.getString("address")+"' and status='false';";
                
                rs2 = stmt1.executeQuery(query1);
                
                while(rs2.next()) {
                
                    Permission p = new Permission(rs2.getString("address"),rs2.getString("email"),false);
                    
                    a.add(p);
                    
                }
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            //System.out.println(e);
        }
        
        return a;
        
    }
}
