package com.company.tests;

import com.company.BaseTest;
import com.company.BaseTestIOS;
import com.company.pages.AndroidPages.AndroidLoginPage;
import com.company.pages.IOSPages.IOSLoginPage;
import com.company.pages.IOSPages.IOSStartPage;
import com.company.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class TestAlreadyHaveAnAccount extends BaseTest {

    @Test
    public void alreadyHaveAnAccount ()
    {


        IOSStartPage.pressAlreadyHaveAnAccountButton(driver);


        //Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);
        Assert.assertEquals(AndroidLoginPage.isLoginTextPresent(driver), true);




    }
}
