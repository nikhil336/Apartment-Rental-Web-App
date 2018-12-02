
package Modal;

public class Permission {
  
    private String address;
    
    private String email;
    
    private boolean status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Permission(String address, String email, boolean status) {
        this.address = address;
        this.email = email;
        this.status = status;
    }
    
    public Permission() {}
}
