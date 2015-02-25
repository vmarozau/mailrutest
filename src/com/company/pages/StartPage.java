package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class StartPage {

    public static void pressAlreadyHaveAnAccountButton(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement alreadyHaveAnAccountButton = driver.findElement(By.name("Already have an account? Log in"));
        //List<WebElement> buttonsList = driver.findElements(By.className("android.widget.Button"));
        alreadyHaveAnAccountButton.click();
        //driver.findElement(By.className("android.widget.Button")).click();


    }

    public static void pressCreateAccountButton(WebDriver driver) {
        WebElement createAccountButton = driver.findElement(By.name("Create account"));
        createAccountButton.click();
    }


    public static void pressSkip(WebDriver driver) {
        WebElement createAccountButton = driver.findElement(By.name("Skip"));
        createAccountButton.click();

    }
}
