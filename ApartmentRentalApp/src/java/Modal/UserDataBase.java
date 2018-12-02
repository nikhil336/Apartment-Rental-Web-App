/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author NIKHIL-PC
 */
public class UserDataBase {
   
    private String firstname;
    
    private String lastname;
    
    private String password;
    
    private String mobileno;
    
    private String dob;
    
    //private int sno;
    
    public UserDataBase() {}

    public UserDataBase(String firstname, String lastname, String password, String mobileno, String dob, String username) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.mobileno = mobileno;
        this.dob = dob;
//        this.sno = sno; , int sno
        this.username = username;
    }

//    public int getSno() {
//        return sno;
//    }
//
//    public void setSno(int sno) {
//        this.sno = sno;
//    }
    
//    private String town;
    
    private String username;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

//    public String getTown() {
//        return town;
//    }
//
//    public void setTown(String town) {
//        this.town = town;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
}
