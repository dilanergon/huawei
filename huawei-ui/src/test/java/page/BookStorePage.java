package page;

import constants.BookStore_Constants;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.WaitTool;

public class BookStorePage extends BookStore_Constants {

    public BookStorePage(WebDriver driver) {super(driver);}

    @Step("add book to collection step")
    public BookStorePage addBookToCollection(){
        clickObjectBy(GOTOSTORE);
        clickObjectBy(ADDTOBOOK);
        scrollElementBy(ADDTOCOLLECTION);
        clickObjectBy(ADDTOCOLLECTION);
        Assert.assertTrue(driver.getPageSource().contains("Git Pocket Guide"));
        acceptAlert();
        return this;
    }

    @Step("delete book step")
    public BookStorePage deleteBook(){
        driver.navigate().to("https://demoqa.com/profile");
        WaitTool.waitForElementClickable(driver,DELETEBOOK,6);
        clickObjectBy(DELETEBOOK);
        clickObjectBy(DELETEOKBOOK);
        Assert.assertFalse(driver.getPageSource().contains("Git Pocket Guide"));
        acceptAlert();
        return this;
    }
}
