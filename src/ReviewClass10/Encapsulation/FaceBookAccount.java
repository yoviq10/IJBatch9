package ReviewClass10.Encapsulation;

public class FaceBookAccount {

    private String email;
    private String password;

    public FaceBookAccount(String email,String password){
        setEmail(email);
    }


    public void resetPassword(){
        System.out.println("An email has been sent to your email id"+
               email+ "click on that link to reset your password");
    }
    public void setEmail(String email){
        if(email.contains("@")&& email.endsWith(".com")){
            this.email=email;
        }else{
            System.out.println("your email is not correct");
        }
    }

}
