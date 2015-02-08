package com.company;

import com.company.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class IncorrectPassword extends BaseTest {

    @Test
    public void failLoginTest ()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField("mairutest@mail.ru").fillPasswordField("testtest").pressLoginButton();
        Assert.assertEquals(loginPage.getErrorMessageText(),"Authintification fail. Check login and password and try again.");
                //Authintification fail. Check login and password and try again.


    }
}
