package main.java.deprecated;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.net.URL;

/**
 * Created by Vyacheslav on 04.10.2014.
 */
public class BaseTest {

    public AppiumDriver driver;
    //webdriver

    @BeforeSuite
    public void setUp() throws Exception {

        // set up appium
        //File appDir = new File("E://Dev");
        File appDir = new File("/Users/mac-248/Downloads");

        File app = new File(appDir, "wikipedia2.apk");
        //File app = new File(appDir, "wikipedia.app");
        //File app = new File(appDir, "wikipedia.ipa");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("device", "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        //capabilities.setCapability(CapabilityType.VERSION, "4.4");
        // capabilities.setCapability(CapabilityType.PLATFORM, "Android");

        capabilities.setCapability("browserName", "");
        //capabilities.setCapability("platformVersion", "4.4");
        //capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy S4");
        capabilities.setCapability("app", app.getAbsolutePath());
        //capabilities.setCapability("app-package", "{app package name}");  //my case com.gorillalogic.monkeytalk.demo1
        // capabilities.setCapability("app-activity", ".{main activity class}");  //my case RootActivity
        //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       // driver = new AndroidDriver(new URL("http://127.0.0.1:5955/wd/hub"), capabilities);
        driver = new AndroidDriver(new URL("http://127.0.0.1:5955/wd/hub"), capabilities);
        // platformName: 'Android',

        //return driver;
    }


    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}//
