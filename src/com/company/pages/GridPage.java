package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Vyacheslav on 13.02.2015.
 */
public class GridPage {

    private AppiumDriver driver;

    public GridPage(AppiumDriver driver)
    {
        this.driver = driver;
    }

    public GridPage pressAddButton () {

        WebElement addButton = driver.findElement(By.name("Add"));
        //addButton.click();
        //Assert.assertEquals(addButton.isDisplayed(),true);

        addButton.click();
        return this;
    }

    public AddPhotoPage pressAddPhoto ()
    {
        List<WebElement> addOptionsList = driver.findElements(By.className("android.widget.TextView"));

        addOptionsList.get(1).click();
        return new AddPhotoPage(driver);
    }

    public GridPage longPressOnElement () {
        return this;
    }


}
