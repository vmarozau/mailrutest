package com.company.pages.IOSPages;

import com.company.pages.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by mac-248 on 2/24/15.
 */
public class IOSStartPage extends StartPage {


    //    public static void fillEmailField (String email, WebDriver driver)
//    {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
//        //int size = textFieldsList.size();
//
//        textFieldsList.get(0).sendKeys(email);
//        //emailField.sendKeys(email);
//        //return this;
//    }
//    public static void fillPasswordField (String password, WebDriver driver) {
//        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
//        textFieldsList.get(1).sendKeys(password);
//        //return this;
//    }
    @Override
    public void pressAlreadyHaveAnAccountButton(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement alreadyHaveAnAccountButton = driver.findElement(By.name("Already have an account? Log in"));
        //List<WebElement> buttonsList = driver.findElements(By.className("android.widget.Button"));
        alreadyHaveAnAccountButton.click();
        //driver.findElement(By.className("android.widget.Button")).click();


    }

//    public static boolean isButtonEnabled(WebDriver driver) {
//        WebElement loginbutton = driver.findElement(By.className("android.widget.Button"));
//
//        return loginbutton.isEnabled();
//    }

//    public static String getErrorMessageText(WebDriver driver) {
////        WebElement message = driver.findElement(By.id("message"));
////        return message.getText();
//
//        List<WebElement> message = driver.findElements(By.className("android.widget.TextView"));
//        return message.get(1).getText();
//    }
}