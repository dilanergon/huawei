package test;

import base.BaseTest;
import org.testng.annotations.Test;
import page.PractiseFormPage;

public class PractiseFormTest extends BaseTest {

/*
Happy path test
* This test fill up form and checks if the confirmation message is shown at the end of the test.
* Steps to reproduce:
* 1. Navigate to url "https://demoqa.com/automation-practice-form"
* 2. Enter the registration form
* 3. Click submit button
* 4. Assert that confirmation message is shown at the screen
*
* Expected results: Confirmation message is shown at the screen
* */

    @Test(priority = 2)
    public void addPractiseForm() throws Exception {
        succesLogin();
        new PractiseFormPage(driver)
                .fillToForm();
    }
}
