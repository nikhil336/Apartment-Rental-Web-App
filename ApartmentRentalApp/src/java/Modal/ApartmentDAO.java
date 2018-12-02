
package Modal;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ApartmentDAO {
    
    public ArrayList<Apartment> searchApartments(String search,String uname) {
        
        ArrayList<Apartment> l = new ArrayList<Apartment>();
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        boolean flag;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            Statement stmt1=con.createStatement();
            
            String query="select * from apartments where location='"+search+"' and NOT email='"+uname+"';";
            
            //int c = 0;
            
            //.toLowerCase()
            
            String query1;
            
            ResultSet rs2;
            
            ResultSet rs = stmt.executeQuery(query);
            
            boolean set = false;
            
            while(rs.next())
            {
                //System.out.println("Result");
                // c++;  //System.out.println(c); 
                //System.out.println(rs.getString(2));
                
                query1 = "select status from permission where address='"+rs.getString(5)+"' and email='"+uname+"';";
                
                rs2 = stmt1.executeQuery(query1);
                
                if(rs2.next()) {
                    
                    if(rs2.getString("status").equals("true")) {
                    //System.out.println("hello..........preet"); 
                    set = true;
                    }
                
                    else {

                        set = false;
                    }
                }
                
                
                Apartment a = new Apartment();
                
                a.setStatus(set);
                
                a.setEmail(rs.getString(2));
                
                a.setFlat(rs.getString(4));
                
                a.setLocation(rs.getString(1));
                
                a.setMobileno(rs.getString(3));
                
                a.setAddress(rs.getString(5));
                
                Blob b = rs.getBlob(6);
            
                byte[] by = b.getBytes(1,(int)b.length());
                
                a.setPic(by);
                
                l.add(a);
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            //System.out.println(e);
        }
        
        System.out.println(l);
        
        return l;
    

    }
    
    public ArrayList<Apartment> myApartments(String uname) {
        
        ArrayList<Apartment> l = new ArrayList<Apartment>();
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        boolean flag;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            String query="select * from apartments where email='"+uname+"'";
            
            //int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                //System.out.println("Result");
                // c++;  //System.out.println(c); 
                //System.out.println(rs.getString(2));
                Apartment a = new Apartment();
                
                a.setEmail(rs.getString(2));
                
                a.setFlat(rs.getString(4));
                
                a.setLocation(rs.getString(1));
                
                a.setMobileno(rs.getString(3));
                
                //a.setPicloc(rs.getString(6));
                
                a.setAddress(rs.getString(5));
                
                Blob b = rs.getBlob(6);
            
                byte[] by = b.getBytes(1,(int)b.length());
                
                a.setPic(by);
                
                l.add(a);
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            //System.out.println(e);
        }
        
        //System.out.println(l);
        
        return l;
    

    }
    
    public boolean saveApartments(Apartment a) {
    
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            String query="insert into apartments values(?,?,?,?,?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(1,a.getLocation());
            
            pstmt.setString(2,a.getEmail());
            
            pstmt.setString(3,a.getMobileno());
            
            pstmt.setString(4,a.getFlat());
            
            pstmt.setString(5,a.getAddress());
            
            //pstmt.setBinaryStream(6,new ByteArrayInputStream(a.getPic()));
            
            //pstmt.setBytes(6,a.getPic());
            
            pstmt.setBlob(6,a.getIs());
            
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
    
    public boolean removeApartment(String address) {
     
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            String query="delete from apartments where address='"+address+"';";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            int i = pstmt.executeUpdate();
            
            if(i != 0) {
            
                flag = true;
                
            }
        }
        
        catch(Exception e) {
        
            flag = false;
        }
        
        return flag;
    }
}
