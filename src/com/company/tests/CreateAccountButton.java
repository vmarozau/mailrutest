package com.company.tests;

import com.company.pages.AndroidPages.AndroidStartPage;
import com.company.pages.CreateAccountPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class CreateAccountButton extends CommonBaseTest {

    @Test
    public void pressCreateAccountButtonShouldOpenCreatePage () {

        StartPage.pressCreateAccountButton(driver);
        Assert.assertEquals(CreateAccountPage.createElementsArePresent(driver), true);
    }
}
