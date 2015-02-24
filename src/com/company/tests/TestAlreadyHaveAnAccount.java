package com.company.tests;

import com.company.BaseTest;
import com.company.BaseTestIOS;
import com.company.pages.AndroidPages.AndroidLoginPage;
import com.company.pages.IOSPages.IOSLoginPage;
import com.company.pages.IOSPages.IOSStartPage;
import com.company.pages.LoginPage;
import com.company.pages.LoginPageWiki;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class TestAlreadyHaveAnAccount extends CommonBaseTest {

    @Test
    public void alreadyHaveAnAccount ()
    {


        StartPage.pressAlreadyHaveAnAccountButton(driver);


        //Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);
        Assert.assertEquals(LoginPageWiki.isLoginTextPresent(driver), true);




    }
}
