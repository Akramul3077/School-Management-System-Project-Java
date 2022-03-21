
package school.management;

public class loginSQL {
    private String user;  
    private String password;
   
    
    public loginSQL(String suser,String spassword){
       
        this.user =suser;
        this.password =spassword;
   
    }
    
   
    public String getUser(){
        return user;
    }
   
    public String getPassword(){
        return password;
    }

    
}