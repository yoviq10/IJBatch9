package GroupProject;

public class RegistrationTester {
    public static void main(String[] args) {

        //#4

        Registration registration=new Registration();
        registration.setEmail("Yoyo@yahoo.com"); //setting the value
        System.out.println(registration.getEmail());// returning the value

        registration.setUserName("ykf");
        System.out.println(registration.getUserName());

        //Runt time error below not finished
        registration.setPassword("password");
        System.out.println(registration.getPassword());


    }
}