package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by mac-248 on 2/4/15.
 */
public class Testios {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        // set up appium
        //For Mac
        File appDir = new File("/Users/mac-248/Downloads");
        //For Windows
        //File appDir = new File("E:/Dev")
        File app = new File(appDir, "mailrucloud.apk"); //my case “demo1.apk”
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("device", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        //capabilities.setCapability(CapabilityType.VERSION, "4.4");
        // capabilities.setCapability(CapabilityType.PLATFORM, "Android");


        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy S4");
        capabilities.setCapability("app", app.getAbsolutePath());
        //capabilities.setCapability("app-package", "{app package name}");  //my case com.gorillalogic.monkeytalk.demo1
        // capabilities.setCapability("app-activity", ".{main activity class}");  //my case RootActivity
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:5955/wd/hub"), capabilities);
        // platformName: 'Android',

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement LoginButton = driver.findElement(By.className("android.widget.Button"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals(LoginButton.isEnabled(), false);

        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));

        int size = textFieldsList.size();

        textFieldsList.get(0).sendKeys("killesk@mail.ru");
        textFieldsList.get(1).sendKeys("Static-x108");

        Assert.assertEquals(LoginButton.isEnabled(),true);

    }
}
