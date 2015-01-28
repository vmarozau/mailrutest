package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 04.10.2014.
 */
public class LoginPage {

    private WebDriver driver;

   // @FindBy (className = "android.widget.EditText")
   // protected WebElement emailField;


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
   // emailField = driver.findElement(By.id("login"));

    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    public List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
    //public WebElement emailField = driver.findElement()
    public LoginPage fillEmailField (String email)
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        //int size = textFieldsList.size();

       textFieldsList.get(0).sendKeys(email);
        //emailField.sendKeys(email);
        return this;
    }
    public LoginPage fillPasswordField (String password) {
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        textFieldsList.get(1).sendKeys(password);
        return this;
    }
    public void pressLoginButton () {
        driver.findElement(By.className("android.widget.Button")).click();

    }


}
