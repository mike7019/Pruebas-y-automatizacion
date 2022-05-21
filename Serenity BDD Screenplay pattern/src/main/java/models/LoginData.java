package models;

public class LoginData {

    String user;
    String password;
    String laptop;

    public LoginData(String user, String password, String laptop) {
        this.user = user;
        this.password = password;
        this.laptop = laptop;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }


}
