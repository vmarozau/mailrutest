package main.java.deprecated;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 08.02.2015.
 */
public class Before {

    //@BeforeTest
    public void goToGrid (AppiumDriver driver){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));

        int size = textFieldsList.size();

        textFieldsList.get(0).sendKeys("mairutest@mail.ru");
        textFieldsList.get(1).sendKeys("MailRuTest");
        //driver.findElements(By.xpath("android.widget.Button")).get(1).click();
        driver.findElement(By.className("android.widget.Button")).click();


        List<WebElement> licenceAgreement = driver.findElements(By.className("android.widget.Button"));
        int size2 = licenceAgreement.size();
        licenceAgreement.get(1).click();

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
    }
}
