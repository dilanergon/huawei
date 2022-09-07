package page;

import constants.Login_Constants;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class LoginPage extends Login_Constants {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("go to login page step")
    public LoginPage login(String email, String password) {
        setObjectBy(EMAIL, email);
        setObjectBy(PASSWORD, password);
        clickObjectBy(LOGINBUTTON);
        sleep(3000);
        if(!isElementPresent(LOGOUTBUTTON))
            Assert.assertTrue(driver.getPageSource().contains("Invalid username or password!"));
        return new LoginPage(driver);
    }

}
