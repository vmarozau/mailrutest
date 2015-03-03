package com.company.deprecated;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Vyacheslav on 08.02.2015.
 */
public class AddNewFile2 extends BaseTest {

    public Before bf;
    @BeforeClass

    public void gt (AppiumDriver driver){
        bf.goToGrid(driver);
    }

    @Test
    public void addNewFileTest(){
        WebElement addButton = driver.findElement(By.name("Add"));
        //addButton.click();
        //Assert.assertEquals(addButton.isDisplayed(), true);

        addButton.click();


        List<WebElement> addOptionsList = driver.findElements(By.className("android.widget.TextView"));

        addOptionsList.get(1).click();


        List<WebElement> cells = driver.findElements(By.className("android.widget.RelativeLayout"));
        //WebElement cells = driver.findElement(By.className("android.widget.RelativeLayout"));
        cells.get(1).click();
    }

}
