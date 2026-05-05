package Code;

public class Member extends Person{

    private String phone;
    private String email;

    public Member(){
        phone = "03xxxxxxxxx";
        email = "-----@gmail.com";
    }


    public Member(String p, String e){
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
