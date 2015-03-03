package com.company.tests;


import com.company.pages.AndroidPages.AndroidLoginPage;
import com.company.pages.IOSPages.IOSStartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 12.10.2014.
 */
public class TestAlreadyHaveAnAccount extends CommonBaseTest {

    @Test
    public void alreadyHaveAnAccount ()
    {


        IOSStartPage.pressAlreadyHaveAnAccountButton(driver);


        //Assert.assertEquals(IOSLoginPage.isLoginTextPresent(driver), true);
        Assert.assertEquals(AndroidLoginPage.isLoginTextPresent(driver), true);




    }
}
