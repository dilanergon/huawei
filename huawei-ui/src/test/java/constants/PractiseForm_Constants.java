package constants;

import base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PractiseForm_Constants extends BasePageUtil {
    public PractiseForm_Constants(WebDriver driver) {
        super(driver);
    }{
}
    public By FIRSTNAME = By.id("firstName");
    public By LASTNAME = By.id("lastName");
    public By EMAIL = By.id("userEmail");
    public By GENDER = By.cssSelector("div#genterWrapper > .col-md-9.col-sm-12 > div:nth-of-type(2) > label");
    public By USERNUMBER = By.id("userNumber");
    public By DATE = By.id("dateOfBirthInput");
    public By SELECTEDDATE = By.cssSelector("div[role='listbox'] > div:nth-of-type(2) > div:nth-of-type(6)");
    public By HOBBIES = By.cssSelector("div#hobbiesWrapper > .col-md-9.col-sm-12 > div:nth-of-type(2) > label");
    public By ADDRESS = By.id("currentAddress");
    public By SUBMIT = By.cssSelector(".btn-primary");
    public By CONFMSG = By.id("example-modal-sizes-title-lg");

}