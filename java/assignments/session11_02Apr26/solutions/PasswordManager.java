package solutions;

public class PasswordManager {
    private String password;

    public void setPassword(String password){
        if(password.length() < 8){
            System.out.println("The password must be atleast 8 characters long. You entered a "+password.length()+" characters long password. Try again.");
            return;
        }
        this.password = password;
        System.out.println("The password has been reset.");
    }

}
