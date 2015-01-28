package com.company;

import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class FailLoginTest extends BaseTest {

    @Test
    public void failLoginTest ()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField("").fillPasswordField("").pressLoginButton();


    }
}
