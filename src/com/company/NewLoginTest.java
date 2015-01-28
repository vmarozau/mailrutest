package com.company;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 04.10.2014.
 */
public class NewLoginTest extends BaseTest {
    //protected WebDriver driver;


    @Test
    public void loginTest(){
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);

        //try {
            loginPage.fillEmailField("blablablatest2@email.com");
       // }
        //catch (Exception e) {
        //    e.printStackTrace();
        //}
        //new comment for master branch

    }


}
