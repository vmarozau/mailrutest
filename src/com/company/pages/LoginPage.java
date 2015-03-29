package com.company.pages;

import com.company.ScreenshotHandler;
import com.company.tests.CommonBaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.asprise.ocr.Ocr;

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
    public static void clearEmailField(AppiumDriver driver) {
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        //int size = textFieldsList.size();

        textFieldsList.get(0).clear();
    }

    public static void fillPasswordField (String password, WebDriver driver) {
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        textFieldsList.get(1).sendKeys(password);
        //return this;
    }

    public static void clearPasswordField(AppiumDriver driver) {
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        //int size = textFieldsList.size();

        textFieldsList.get(1).clear();
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


    //*** locators won't work for now because of google issue https://github.com/appium/appium/issues/968
    public static String getErrorMessageText(WebDriver driver) {
//        WebElement message = driver.findElement(By.id("message"));
//        return message.getText();

        List<WebElement> message = driver.findElements(By.className("android.widget.Toast"));
        //toasts and exclamation messages are not supported, possible solution is getToastMessageText below
        return message.get(0).getText();
    }

    public static String getToastMessageText(WebDriver driver) {

        ScreenshotHandler scr = new ScreenshotHandler();
        try {
            Thread.sleep(10000); //bad idea, need to wait until spinner is hidden
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String screenshot = scr.getScreenshotText();
        return screenshot;


        //WebElement message = driver.findElement(By.className("android.widget.Toast"));
        //
        //String filePath = "E:\\SCREENSHOTS\\";
        //String methodName=result.getName().toString().trim()
        //public void takeScreenShot() {  //probably to wrap it in some method
            //get the driver
            //driver= CommonBaseTest.getDriver();


        //WebElement message = driver.findElement(By.className("android.widget.Toast"));
        //return message.getText();


    }

//    public static void pressBackButton() {
//
//    }

    public static void clearAllAndroidFields(WebDriver driver)

    {
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        int numberOfFields = textFieldsList.size();
        //for (WebElement aTextFieldsList : textFieldsList) {
        for (int i=0; i<numberOfFields; i++) {

            System.out.println("getting field " + i);
            String text = textFieldsList.get(i).getText();
            int maxChars = text.length();
            //if (textFieldsList.get(i).)
            System.out.println("field" + i + " length = " + maxChars);
            for (int j = 0; j < maxChars; j++) {
                ((AppiumDriver) driver).sendKeyEvent(67);
            }
        }
    }

}


