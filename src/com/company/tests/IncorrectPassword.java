package com.company.tests;

import com.company.BaseTest;
import com.company.deprecated.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class IncorrectPassword extends BaseTest {

    @Test(dataProvider = "data-provider")
    public void failLoginTest ()
    {
        //LoginPage loginPage = new LoginPage(driver);


        LoginPage.fillEmailField("mairutest@mail.ru", driver);
        //
        LoginPage.fillPasswordField("password", driver);
        LoginPage.pressLoginButton(driver);

        Assert.assertEquals(LoginPage.getErrorMessageText(driver),"Authintification fail. Check login and password and try again.");

                //Authintification fail. Check login and password and try again.


    }
}
