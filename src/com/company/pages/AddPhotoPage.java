package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Vyacheslav on 18.02.2015.
 */
public class AddPhotoPage {

    private AppiumDriver driver;

    public AddPhotoPage(AppiumDriver driver)
    {
        this.driver = driver;
    }

    public void selectPhoto () {
        List<WebElement> cells = driver.findElements(By.className("android.widget.RelativeLayout"));
        //WebElement cells = driver.findElement(By.className("android.widget.RelativeLayout"));
        cells.get(1).click();
    }
}
