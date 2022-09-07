package constants;

import base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStore_Constants extends BasePageUtil {
    public BookStore_Constants(WebDriver driver) {
        super(driver);
    }
    public By GOTOSTORE = By.id("gotoStore");
    public By ADDTOBOOK = By.id("see-book-Git Pocket Guide");
    public By DELETEBOOK = By.id("delete-record-undefined");
    public By DELETEOKBOOK = By.id("closeSmallModal-ok");
    public By DELETEALLBOOKS = By.id("//button[contains(text(),'Delete All Books')]");
    public By DELETEALLOKBOOKS = By.id("closeSmallModal-ok");
    public By ADDTOCOLLECTION = By.cssSelector(".text-right.fullButton .btn-primary");


}
