package com.company.tests;

import com.company.BaseTest;
import com.company.BaseTestIOS;
import com.company.pages.AndroidPages.AndroidLoginPage;
import com.company.pages.IOSPages.IOSLoginPage;
import com.company.pages.IOSPages.IOSStartPage;
import com.company.pages.LoginPage;
import com.company.pages.LoginPageWiki;
import com.company.pages.StartPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class TestAlreadyHaveAnAccount extends CommonBaseTest {

    public StartPage startPage;

    public LoginPageWiki loginPageWiki;
    @Test
    public void alreadyHaveAnAccount ()
    {


        startPage.pressAlreadyHaveAnAccountButton(driver);


        //Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);
        Assert.assertEquals(loginPageWiki.isLoginTextPresent(driver), true);




    }
}
