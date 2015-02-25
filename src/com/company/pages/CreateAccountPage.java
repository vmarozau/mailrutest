package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class CreateAccountPage {

    public static boolean createElementsArePresent(AppiumDriver driver) {
        WebElement createAccountText = driver.findElement(By.name("Create an account"));
        WebElement usernameField = driver.findElement(By.name("Username"));
        //WebElement passwordField = driver.findElement(By.className("android.widget.EditText"));
        //WebElement repeatPasswordField = driver.findElement(By.name("android.widget.EditText"));
        if (createAccountText.isDisplayed()
                && usernameField.isDisplayed()
                // && passwordField.isDisplayed()
                // && repeatPasswordField.isDisplayed()
                 )
        return true;

        else return false;
    }
}
