package GroupProject;

public class Registration {
/* #4 Create Registration class in which you would have variables as email, userName, and password
that only have an access scope within its own class
After creating an object of the class, user should be able to call methods and in each method separately
pass values to set user email,username,and password.
Requirements:
Valid email consider to be only Yahoo
Valid userName and password cannot be empty & should be of length of larger than 6
characters. Also valid password cannot contain userName.

 */
    private String email;
    private String userName;
    private String password;

    /*Registration(String email, String userName, String password){
        this.email=email;
        this.userName=userName;
        this.password=password;
    }*/
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){

        if(newEmail.endsWith("yahoo.com")){
            email=newEmail;
        }else{
            System.out.println("Must be a yahoo email address");
        }
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String newUserName){

        if(newUserName.isEmpty() || newUserName.length()<6){
            System.out.println("Username cannot be empty and must contain 6 characters");
        }else{
            userName=newUserName;
        }
    }

    public String getPassword(){
        return password;
    }

    //Runt time error below not finished
    public void setPassword(String newPassword) {
        if (newPassword.isEmpty() || newPassword.length()<6){
            System.out.println("Password cannot be empty, must contain 6 characters, and cannot contain userName");
        }else if(newPassword.contains(userName)){
            System.out.println("Cannot contain username");
        }else{
            password = newPassword;
        }
    }
}
