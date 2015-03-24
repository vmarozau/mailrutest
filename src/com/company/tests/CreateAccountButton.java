package com.company.tests;

import com.company.pages.AndroidPages.AndroidStartPage;
import com.company.pages.CreateAccountPage;
import com.company.pages.StartPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class CreateAccountButton extends CommonBaseTest {

    @Test
    public void pressCreateAccountButtonShouldOpenCreatePage () {

        StartPage.pressCreateAccountButton(driver);
        Assert.assertEquals(CreateAccountPage.createElementsArePresent(driver), true);

        //driver =  new Augmenter().augment(driver);
        //Get the screenshot
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        System.out.println("Screenshot completed");
//        try {
//
//            File testScreenShot = new File("g.png");
//            //Copy the file to screenshot folder
//            FileUtils.copyFile(scrFile, testScreenShot);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
