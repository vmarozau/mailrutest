package com.company;

import com.company.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 08.02.2015.
 */
public class EmptyEmail2 extends BaseTest {

    @Test
    public void emptyEmail2 () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField("").fillPasswordField("");
        Assert.assertEquals(loginPage.isButtonEnabled(), false);
    }
}
