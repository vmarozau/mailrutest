package com.company;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.URL;

/**
 * Created by Vyacheslav on 04.10.2014.
 */
public class BaseTest {

    public static AppiumDriver driver;

    @BeforeTest
    public void setUp() throws Exception {

        // set up appium
        File appDir = new File("E://Dev");
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
        //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        // platformName: 'Android',

        //return driver;
    }


    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}//
