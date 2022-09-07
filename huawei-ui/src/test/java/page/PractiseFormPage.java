package page;

import constants.PractiseForm_Constants;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ReadProperties;
import util.WaitTool;

public class PractiseFormPage extends PractiseForm_Constants {

    public PractiseFormPage(WebDriver driver) {super(driver);}

    @Step("fill to form step")
    public PractiseFormPage fillToForm() {
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        clickObjectBy(FIRSTNAME);
        setObjectBy(FIRSTNAME, ReadProperties.getFirstName());
        clickObjectBy(LASTNAME);
        setObjectBy(LASTNAME, ReadProperties.getLastName());
        clickObjectBy(EMAIL);
        setObjectBy(EMAIL, ReadProperties.getTrueEmail());
        clickObjectBy(GENDER);
        clickObjectBy(USERNUMBER);
        setObjectBy(USERNUMBER, ReadProperties.getNumber());
        clickObjectBy(DATE);
        clickObjectBy(SELECTEDDATE);
        clickObjectBy(HOBBIES);
        fileUpload();
        clickObjectBy(ADDRESS);
        setObjectBy(ADDRESS,ReadProperties.getAddress());
        zoomOut();
        WaitTool.waitForElementClickable(driver,SUBMIT,5);
        clickObjectBy(SUBMIT);
        Assert.assertEquals(driver.findElement(CONFMSG).getText(), "Thanks for submitting the form", "Message should be 'Thanks for submitting the form'");
        return this;
    }
}

