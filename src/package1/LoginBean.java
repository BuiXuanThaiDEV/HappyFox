package package1;
public class LoginBean {
    private String name,password;

    public void setNameandPassword(String name,String password){
        this.name = name;
        this.password = password;
    }
    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean validate(){
        if (name.equals("myname")&&password.equals("mypassword"))
            return true;
        else return false;
    }

}
