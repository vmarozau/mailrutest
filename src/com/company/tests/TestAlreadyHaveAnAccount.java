package com.company.tests;

import com.company.pages.LoginPageWiki;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class TestAlreadyHaveAnAccount extends CommonBaseTest {

    //public StartPage startPage;

   // public LoginPageWiki loginPageWiki;
    @Test
    public void alreadyHaveAnAccount ()
    {


        StartPage.pressAlreadyHaveAnAccountButton(driver);


        //Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);
        Assert.assertEquals(LoginPageWiki.isLoginTextPresent(driver), true);




    }
}
