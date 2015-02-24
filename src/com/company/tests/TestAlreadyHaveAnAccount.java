package com.company.tests;

import com.company.BaseTest;
import com.company.BaseTestIOS;
import com.company.pages.IOSPages.IOSLoginPage;
import com.company.pages.IOSPages.IOSStartPage;
import com.company.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class TestAlreadyHaveAnAccount extends BaseTestIOS {

    @Test
    public void alreadyHaveAnAccount ()
    {
        //LoginPage loginPage = new LoginPage(driver);

        IOSStartPage.pressAlreadyHaveAnAccountButton(driver);
        //LoginPage.fillEmailField("mairutest@mail.ru", driver);
        //
        //LoginPage.fillPasswordField("testtest", driver);
        //LoginPage.pressLoginButton(driver);

        Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);

                //Authintification fail. Check login and password and try again.


    }
}
