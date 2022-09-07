package test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.LoginPage;
import util.ReadProperties;

     /* HappyPath test
     * This test check login functionality with valid parameters
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login"
     * 2. Enter valid username and password
     * 3. Click Login button
     * 4. Assert that user is logged in
     *
     * Expected results: Profile page is shown
     */

public class LoginTest extends BaseTest {

    @Epic("Regression Tests")
    @Feature("Login Test")

    @Test(priority = 0, description = "success login scenerio")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description : success login")
    @Story("success login")
    public void successLogin() {
        new LoginPage(driver)
                .login(ReadProperties.getTrueEmail(), ReadProperties.getTruePassword());
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter a invalid username and valid password
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message is shown on the screen
     */
    @Test
    public void failedLoginFalseEmail() {
        new LoginPage(driver)
                .login(ReadProperties.getFalseEmail(), ReadProperties.getTruePassword());
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter a valid username and invalid password
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message is shown on the screen
     */

    @Test
    public void failedLoginFalsePassword() {
        new LoginPage(driver)
                .login(ReadProperties.getTrueEmail(), ReadProperties.getFalsePassword());
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter a invalid username and null password
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message is shown on the screen
     */

    @Test
    public void failedLoginNullPassword() {
        new LoginPage(driver)
                .login(ReadProperties.getTrueEmail(), "");
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter a null username and invalid password
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message is shown on the screen
     */

    @Test
    public void failedLoginNullEmail() {
        new LoginPage(driver)
                .login("", ReadProperties.getTruePassword());
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter a invalid username and invalid password
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message is shown on the screen
     */


    @Test
    public void failedLogin() {
        new LoginPage(driver)
                .login(ReadProperties.getFalseEmail(), ReadProperties.getFalsePassword());
    }

}