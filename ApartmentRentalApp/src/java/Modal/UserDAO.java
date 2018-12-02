/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author NIKHIL-PC
 */
public class UserDAO {
    
//    public int getUserNo(String uname) {
//    
//        int sno = 0;
//        
//        return sno;
//    }
//    
//    public int getSno() {
//        
//        int max = 0;
//    
//       String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
//    
//       try {
//
//           Class.forName("com.mysql.cj.jdbc.Driver");
//            
//           Connection con = DriverManager.getConnection(url);
//           
//           String qr = "select max(sno) from details;";
//            
//           Statement pstmt = con.createStatement();
//           
//           ResultSet rs = pstmt.executeQuery(qr);
//           
//           rs.next();
//           
//           max = rs.getInt("max(sno)");
//        
//            
//       }
//       catch(Exception e) {
//           
//           max = 0;
//
//           //System.out.println(e);
//     
//       } 
//       
//       System.out.println(max);
//
//       return max;       
//    }
    
    public boolean save(UserDataBase s) {
        
       boolean flag = true;
    
//       String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
//    
//       try {
//
//           Class.forName("com.mysql.cj.jdbc.Driver");
//            
//           Connection con = DriverManager.getConnection(url);
//           
//           String qr = "insert into details values(?,?,?,?,?,?,?)";
//            
//           PreparedStatement pstmt = con.prepareStatement(qr);
//           
//           pstmt.setString(1,s.getFirstname());
//           
//           pstmt.setString(2,s.getLastname());
//           
//           pstmt.setString(3,s.getPassword());
//           
//           pstmt.setString(4,s.getMobileno());
//           
//           pstmt.setString(5,s.getDob());
//           
//           pstmt.setString(6,s.getUsername());
//           
//           pstmt.setInt(7,s.getSno());
//           
//           int i = pstmt.executeUpdate();
//        
//            
//       }
//       catch(Exception e) {
//           
//           flag = false;
//
//           System.out.println(e);
//     
//       }
       
        try {
            
            Configuration cf = new Configuration();

            cf.configure("cfgpackage/hibernate.cfg.xml"); // cf.configure() for cfg file in source package.

            SessionFactory sf = cf.buildSessionFactory();

            Session ss = sf.openSession();

            Transaction tx = ss.beginTransaction();

            ss.save(s);
            
            //another session method to get values from database 
            // UserDataBase u = (UserDataBase) ss.get(UserDataBase.class,s.getUname());

//            if(u == null) {
//            
//                return false;
//            }
//            
//            else if(u.equals(s)) { // override equals method in pojo class UserDataBase
//            
//                return true;
//            }
            tx.commit();

            ss.close();

            sf.close();
        
        }
        
        catch(Exception e) {
        
            flag = false;
            
        }
        
        return flag;
       
       
    } 
    
    public boolean checkUser(UserDataBase u) {
    
        boolean flag = true;

        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            String query="select * from details where username='"+u.getUsername()+"'";
            
            int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                 c++;  //System.out.println(c); 
            }
            
            if(c == 0) {
               
                flag = true;
            }
            
            else {
                
                flag = false;
            }

        }   
        
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            
        }
        
        return flag;
    }

    public boolean validateUser(String uname,String pwd) {
    
        boolean flag = false;    
//        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
//        
       // System.out.println(uname+" "+pwd);

//        
//        try {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection con = DriverManager.getConnection(url);
//
//            Statement stmt=con.createStatement();
//            
//            String query="select * from details where username='"+uname+"' and password='"+pwd+"'";
//            
//            //System.out.println(query);
//            
//            int c = 0;
//            
//            ResultSet rs = stmt.executeQuery(query);
//            
//            while(rs.next())
//            {
//                 c++;  //System.out.println(c); 
//            }
//            
//            if(c > 0) {
//               //out.println("true");
//                flag = true;
//            }
//            
//            else {
//               // System.out.println("false");
//                flag = false;
//            }
//           
//            con.close();
//        }   
//        
//        catch(Exception e) {
//            //System.out.println(e);
//            flag = false;
//            //System.out.println(e);
//        }
        
          try {
           
            UserDataBase n = null;
              
            Configuration cf = new Configuration();

            cf.configure("cfgpackage/hibernate.cfg.xml"); // cf.configure() for cfg file in source package.

            SessionFactory sf = cf.buildSessionFactory();

            Session ss = sf.openSession();
            
            n = (UserDataBase)ss.get(UserDataBase.class,uname);
            
            ss.close();
            
            sf.close();
            
            if(n == null) {
              
                flag = false;
            }
            
            else if(n.getUsername().equals(uname) && n.getPassword().equals(pwd)) {
            
                flag = true;
            }
            
          }
          
          catch(Exception e) {
          
              flag = false;
          }
          
        return flag;
    }
        
    
}
