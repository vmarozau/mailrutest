package com.company.tests;

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
        LoginPage.clearEmailField(driver);
        LoginPage.clearPasswordField(driver);
    }

    @Test
    public void ashouldPassIfLoginButtonDisabled (){
        Reporter.log("clearing login");
        LoginPage.fillEmailField("", driver);
        Reporter.log("clearing password");
        LoginPage.fillPasswordField("", driver);
        Assert.assertFalse(LoginPage.isButtonEnabled(driver));
    }


    //*** locators won't work for now because of google issue https://github.com/appium/appium/issues/968
    @Test(dataProvider = "login-data-provider", dataProviderClass = LoginDataProvider.class)
    public void loginTest (String login, String password, String expectedMessage)
    {
        //LoginPage loginPage = new LoginPage(driver);
        Reporter.log("entering login");
        LoginPage.fillEmailField(login, driver);
        Reporter.log("entering password");
        LoginPage.fillPasswordField(password, driver);
        LoginPage.pressLoginButton(driver);

        //Assert.assertEquals(LoginPage.getErrorMessageText(driver),expectedMessage);
        Assert.assertTrue(LoginPage.getToastMessageText(driver).contains(expectedMessage));
    }
}
