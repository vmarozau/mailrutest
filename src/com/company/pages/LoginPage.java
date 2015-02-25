package com.company.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 04.10.2014.
 */
public class LoginPage {

    //private  AppiumDriver driver;
    // private static AppiumDriver driver;

   // @FindBy (className = "android.widget.EditText")
   // protected WebElement emailField;


//    public LoginPage(AppiumDriver driver)
//    {
//        this.driver = driver;
//        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
   // emailField = driver.findElement(By.id("login"));

    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    public List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
    //public WebElement emailField = driver.findElement()

    public static void pressCreateAccountButton (WebDriver driver)
    {

    }
    public static void fillEmailField (String email, WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        //int size = textFieldsList.size();

       textFieldsList.get(0).sendKeys(email);
        //emailField.sendKeys(email);
        //return this;
    }
    public static void fillPasswordField (String password, WebDriver driver) {
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        textFieldsList.get(1).sendKeys(password);
        //return this;
    }
    public static void pressLoginButton (WebDriver driver) {
        List<WebElement> buttonsList = driver.findElements(By.className("android.widget.Button"));
        buttonsList.get(0).click();
        //driver.findElement(By.className("android.widget.Button")).click();


    }

    public static boolean isButtonEnabled(WebDriver driver) {
        WebElement loginbutton = driver.findElement(By.className("android.widget.Button"));

        return loginbutton.isEnabled();
    }

    public static String getErrorMessageText(WebDriver driver) {
//        WebElement message = driver.findElement(By.id("message"));
//        return message.getText();

        List<WebElement> message = driver.findElements(By.className("android.widget.TextView"));
        return message.get(1).getText();
    }

    //public void


}
