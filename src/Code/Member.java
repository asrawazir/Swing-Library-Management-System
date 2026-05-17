package Code;

import java.io.Serializable;

public class Member extends Person implements Serializable {

    private String phone;
    private String email;

    public Member(){
        phone = "03xxxxxxxxx";
        email = "-----@gmail.com";
    }

    public Member(String i, String n, String p, String e){
        super(i,n);
        this.phone = p;
        this.email = e;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getEmail(){
        return this.email;
    }
}
