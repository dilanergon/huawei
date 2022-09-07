package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;

public class BasePageUtil<T> {

    protected WebDriver driver;
    public By UPLOADFILE = By.id("uploadPicture");


    public BasePageUtil(WebDriver driver) {
        this.driver = driver;
    }


    protected WebElement setObjectBy(By by, String value) {
        WebElement element = getElementBy(by);
        HighlightElement(element);
        element.clear();
        element.sendKeys(value);
        return element;
    }

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    protected void HighlightElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
                "color: red; border: 1px dashed red;");
    }

    protected WebElement clickObjectBy(By by) {
        WebElement element = driver.findElement(by);
        HighlightElement(element);
        element.click();
        return element;
    }


    public WebElement getElementBy(By by) {
        return driver.findElement(by);
    }


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);

        FileUtils.copyFile(SrcFile, DestFile);
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public WebElement scrollElementBy(By by){
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(1000);
        return element;
    }

    public WebElement scrollElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(1000);
        return element;

    }

    public void zoomOut(){
        String zoomJS;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        zoomJS = "document.body.style.zoom='0.8'";
        js.executeScript(zoomJS);
    }


    public void fileUpload(){
        String currentWorkingPath = System.getProperty("user.dir");
        String fullPath = currentWorkingPath  + File.separator + "src/test/resources/Huawei-logo.jpeg";
        System.out.println(fullPath);
        WebElement uploadElement = driver.findElement(UPLOADFILE);
        uploadElement.sendKeys((fullPath));
    }

}


