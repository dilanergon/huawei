package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import util.ReadProperties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    public static String baseUrl = "https://demoqa.com/login";

    @Test
    public void succesLogin() {
        new LoginPage(driver)
                .login(ReadProperties.getTrueEmail(), ReadProperties.getTruePassword());
    }
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    } // chromedriver

    @BeforeMethod
    public void setUpBeforeTestMethod() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(baseUrl);
        driver.get(baseUrl);
    }
    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(baseUrl);
        driver.get(baseUrl);
    }
    public WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown() throws Exception {
       driver.quit();
    }
}
