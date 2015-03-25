package com.company.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 04.10.2014.
 */
public class CommonBaseTest {

    public AppiumDriver driver;


    //webdriver
    //private String serverURL = "http://127.0.0.1:5955/wd/hub"; //mac
    //private String serverURL = "http://127.0.0.1:4723/wd/hub"; //acer
    //private String serverURL;
    public String getServerURL(){
        if (System.getProperty("os.name").contains("Windows"))
        {
            return "http://127.0.0.1:4723/wd/hub";
        }
        else return "http://127.0.0.1:5955/wd/hub";
    }

    //@BeforeTest
    @BeforeSuite
    public void setUp() throws Exception {

        //temporarily

        int device = 1; //0 - iOS; 1 - Android
        switch (device){
            case 0:

                iOSSetup();

                break;

            case 1:

                androidSetup();

                break;
                    }
    }

    public void iOSSetup() throws MalformedURLException {
        File appDir = new File("/Users/mac-248/Downloads");
        //File appDir = new File("E://Dev");
        File app = new File(appDir, "wikipedia.app");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceName", "iPhone Simulator");
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new IOSDriver(new URL(getServerURL()), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void androidSetup() throws MalformedURLException {
        File appDir = new File("E://Dev");
        //File appDir = new File("/Users/mac-248/Downloads");

        File app = new File(appDir, "wikipedia2.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceName", "Galaxy S4");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL(getServerURL()), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }

//    //to test app kill after data provider iteration
//    @AfterTest
//    public void killapp() throws Exception {
//        System.out.println("system out print ln worked");
//        driver.closeApp();
//    }

}//
