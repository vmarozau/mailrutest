package main.java.pages.AndroidPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mac-248 on 2/24/15.
 */
public class AndroidLoginPage {

    public static boolean isLoginTextPresent (WebDriver driver) {
        WebElement loginText = driver.findElement(By.name("Log in"));
        return loginText.isDisplayed();


    }
}
