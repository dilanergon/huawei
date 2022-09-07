package constants;

import base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Constants extends BasePageUtil {
    public Login_Constants(WebDriver driver) {
        super(driver);
    }
    public By EMAIL = By.id("userName");
    public By PASSWORD = By.id("password");
    public By LOGINBUTTON = By.id("login");
    public By LOGOUTBUTTON = By.id("submit");
}
