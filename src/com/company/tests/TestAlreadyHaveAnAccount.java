package com.company.tests;


import com.company.pages.AndroidPages.AndroidLoginPage;
import com.company.pages.IOSPages.IOSStartPage;
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
        testLogger.testStep("1. Press 'Already Have an account' button");
        StartPage.pressAlreadyHaveAnAccountButton(driver);
        testLogger.testStep("2.Verify that Login text is present");
        //Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);
        Assert.assertEquals(AndroidLoginPage.isLoginTextPresent(driver), true);


    }
}
