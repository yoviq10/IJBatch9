package ReviewClass12;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        //we have made our location available to everyone
        String path=System.getProperty("user.dir")+"\\Files\\Configuration.properties ";
        System.out.println(path);

        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("name"));





    }
}
