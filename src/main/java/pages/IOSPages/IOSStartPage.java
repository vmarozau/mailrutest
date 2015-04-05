package main.java.pages.IOSPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

/**
 * Created by mac-248 on 2/24/15.
 */
public class IOSStartPage {

    public static void pressAlreadyHaveAnAccountButton(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement alreadyHaveAnAccountButton = driver.findElement(By.name("Already have an account? Log in"));
        //List<WebElement> buttonsList = driver.findElements(By.className("android.widget.Button"));
        alreadyHaveAnAccountButton.click();
        //driver.findElement(By.className("android.widget.Button")).click();


    }


}