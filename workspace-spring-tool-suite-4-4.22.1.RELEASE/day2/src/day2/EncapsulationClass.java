package day2;
import java.util.Date;

public class EncapsulationClass {
	 private  String username;
	 private String password;
	 private String email;
	 private String address;
	 private long mobileNumber;
     private Date createAt;
     private Date updateAt;
     private boolean isActive; 
     
     public String getUsername() {
    	 return username;
     }
     public void setUsername(String username) {
    	 this.username=username;
     }
     public String getPassword() {
    	 return password;
    	 }
     public void setPassword(String Password) {
    	 this.password=Password;
         }
     public String getemail() {
    	 return email;
     }
     public void setemail(String email) {
    	 this.email=email;
     }
     public String getaddress() {
    	 return address;
     }
     public void setaddress(String address) {
    	 this.address=address;
     }
     public long getMobileNumber() {
    	 return mobileNumber;
     }
     public void setMobileNumber(long mobileNumber) {
    	 this.mobileNumber=mobileNumber;
    			 }
     public Date getCreateAt() {
    	 return createAt;
     }
     public void setCreateAt(Date createAt) {
    	 this.createAt=createAt;
     }
     public Date getupdateAt() {
    	 return updateAt;
     }
     public void setUpdateAt(Date updateAt) {
    	 this.updateAt=updateAt;
     }
     public boolean getIsActive() {
    	 return isActive;
     }
     public void setisActive(boolean isActive) {
    	 this.isActive=isActive;
     }
     
}
