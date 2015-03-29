package com.company.tests;

import com.company.pages.AndroidPages.AndroidStartPage;
import com.company.pages.CreateAccountPage;
import com.company.pages.StartPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class CreateAccountButton extends CommonBaseTest {

    @BeforeTest
    public void pressCreateAccountButton(){
        StartPage.pressCreateAccountButton(driver);
    }
    @Test
    public void pressCreateAccountButtonShouldOpenCreatePage () {

        Assert.assertEquals(CreateAccountPage.createElementsArePresent(driver), true, "Not all needed elements are found");

    }
}
