package com.company.tests;

import com.company.ScreenshotHandler;
import com.company.dataproviders.LoginDataProvider;
import com.company.pages.LoginPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class LoginTest extends CommonBaseTest {

    @BeforeTest
    public void setUp2 () {
        StartPage.pressAlreadyHaveAnAccountButton(driver);
    }

    @BeforeMethod
    public void close2(){

        //probably to be replaced by something universal
        //LoginPage.clearEmailField(driver);
       //LoginPage.clearPasswordField(driver);
        //replaced:
        LoginPage.clearAllAndroidFields(driver);
    }

    @Test
    public void ashouldPassIfLoginButtonDisabled (){

        testLogger.testStep("1. Clearing Login and password fields");
        LoginPage.clearAllAndroidFields(driver);
        testLogger.testStep("2. Verify that Login button is disabled while all the fields are empty");
        anAssert.assertFalse(LoginPage.isButtonEnabled(driver), "Login button is enabled with empty fields");
    }


    //*** locators won't work natively because of google issue https://github.com/appium/appium/issues/968
    @Test(dataProvider = "login-data-provider", dataProviderClass = LoginDataProvider.class)
    public void loginTest (String login, String password, String expectedMessage)
    {
        //LoginPage loginPage = new LoginPage(driver);
        //Reporter.log("entering login");
        testLogger.testStep("1. Entering Login");
        LoginPage.fillEmailField(login, driver);

        testLogger.testStep("2. Entering password");
        LoginPage.fillPasswordField(password, driver);

        testLogger.testStep("3. Pressing Login Button");
        LoginPage.pressLoginButton(driver);

        testLogger.testStep("4. Verify that appeared toast message text matches expected message");
        anAssert.assertTrue(LoginPage.getToastMessageText(driver).contains(expectedMessage),"Expected toast message is not found");


    }
}
