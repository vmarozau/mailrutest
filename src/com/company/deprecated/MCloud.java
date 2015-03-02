package com.company.deprecated;

//import org.apache.commons.lang3.ObjectUtils;
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

/**
 * Created by Vyacheslav on 20.09.2014.
 */


        import java.io.File;
        import java.net.URL;
        import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
        import org.openqa.selenium.Capabilities;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.HasTouchScreen;
        import org.openqa.selenium.interactions.TouchScreen;
        import org.openqa.selenium.remote.CapabilityType;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.remote.RemoteTouchScreen;
        import org.openqa.selenium.remote.RemoteWebDriver;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

public class MCloud {

    private WebDriver driver;

    @BeforeMethod
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
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       // platformName: 'Android',

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));

        int size = textFieldsList.size();

        textFieldsList.get(0).sendKeys("mairutest@mail.ru");
        textFieldsList.get(1).sendKeys("MailRuTest");
        //driver.findElements(By.xpath("android.widget.Button")).get(1).click();
        driver.findElement(By.className("android.widget.Button")).click();


        List<WebElement> licenceAgreement = driver.findElements(By.className("android.widget.Button"));
        int size2 = licenceAgreement.size();
        licenceAgreement.get(1).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> buttonsSkipAndNext = driver.findElements(By.className("android.widget.Button"));
        buttonsSkipAndNext.get(1).click();
        //List<WebElement> buttonsSkipAndNext = driver.findElements(By.className("android.widget.Button"));
        //android.widget.CheckBox
        buttonsSkipAndNext.get(1).click();
        buttonsSkipAndNext.get(1).click();
        WebElement checkboxEnableUpload = driver.findElement(By.className("android.widget.CheckBox"));
        checkboxEnableUpload.click();
        WebElement theOnlyButtonGo = driver.findElement(By.className("android.widget.Button"));
        theOnlyButtonGo.click();

       // WebElement addButton = driver.findElement(By.id("menu_upload"));
        //WebElement addButton = driver.findElement(By.linkText("Add"));

        WebElement addButton = driver.findElement(By.name("Add"));
        //addButton.click();
        Assert.assertEquals(addButton.isDisplayed(),true);
        //WebElement logout = driver.findElement(By.name("LOGOUT"));
        //String logOut = logout.getText();
       // System.out.println(logOut);
       // logout.click();
    }
}
/*
    @Test
    public void formTest() throws InterruptedException
    {
        List<webelement> textFieldsList = driver.findElements(By.className("android.widget.RelativeLayout"));
        textFieldsList.get(2).click();

        driver.findElement(By.className("android.widget.Spinner")).click();
        List<webelement> listsDropDown = driver.findElements(By.className("android.widget.CheckedTextView"));
        for(WebElement listdropdown: listsDropDown){
            String list = listdropdown.getText();
            if(list.equals("Oxygen")){
                listdropdown.click();
            }
        }

        //click on check box
        WebElement checkBox = driver.findElement(By.className("android.widget.CheckBox"));
        if(checkBox.isSelected()){
            checkBox.click();
        }

        //radio button
        driver.findElements(By.className("android.widget.RadioButton")).get(1).click();

    }

}
</webelement></webelement></webelement>*/

    /*
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
*/