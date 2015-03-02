package com.company.tests;

import com.company.dataproviders.LoginDataProvider;
import com.company.pages.LoginPage;
import com.company.pages.StartPage;
import org.testng.Assert;
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

        //probably to be replaced with something universal
        LoginPage.clearEmailField(driver);
        LoginPage.clearPasswordField(driver);
    }

    @Test(dataProvider = "login-data-provider", dataProviderClass = LoginDataProvider.class)
    public void loginTest (String login, String password, String expectedMessage)
    {
        //LoginPage loginPage = new LoginPage(driver);

        LoginPage.fillEmailField(login, driver);
        //
        LoginPage.fillPasswordField(password, driver);
        LoginPage.pressLoginButton(driver);

        Assert.assertEquals(LoginPage.getErrorMessageText(driver),expectedMessage);

                //Authintification fail. Check login and password and try again.
    }
}
