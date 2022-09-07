package util;

import base.BaseTest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    static Properties userProperties;
    static {
        userProperties = new Properties();
        try {
            InputStream propertiesStream = BaseTest.class.getClassLoader().getResourceAsStream("user.properties");
            userProperties.load(propertiesStream);
            propertiesStream.close();
            propertiesStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTrueEmail() {
        String email = userProperties.getProperty("_EMAIL");
        return email;
    }

    public static String getTruePassword() {
        String password = userProperties.getProperty("_PASSWORD");
        return password;
    }

    public static String getFalseEmail() {
        String email = userProperties.getProperty("_FALSE_EMAIL");
        return email;
    }

    public static String getFalsePassword() {
        String password = userProperties.getProperty("_FALSE_PASSWORD");
        return password;
    }

    public static String getFirstName() {
        String firstName = userProperties.getProperty("_FIRSTNAME");
        return firstName;
    }

    public static String getLastName() {
        String lastName = userProperties.getProperty("_LASTNAME");
        return lastName;
    }

    public static String getNumber() {
        String number = userProperties.getProperty("_NUMBER");
        return number;
    }

    public static String getSubject() {
        String subject = userProperties.getProperty("_SUBJECT");
        return subject;
    }

    public static String getAddress() {
        String address = userProperties.getProperty("_ADDRESS");
        return address;
    }


}
