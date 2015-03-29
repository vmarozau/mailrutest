package com.company;

import com.asprise.ocr.Ocr;
import com.company.tests.CommonBaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vyacheslav on 26.03.2015.
 */
public class ScreenshotHandler extends CommonBaseTest{

//    public WebDriver getDriver(){
//        WebDriver driver = super.driver;
//    }
    private static String filePath = "E:\\SCREENSHOTS\\"; //bad idea, temporarily

    public File takeScreenShot(String methodName) { //bad, methodname is not always needed
        //get the driver
        // driver= getDriver();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));

            //bad filename, overrides taken screenshots if 2 or more tests fail in tests with data provider

            System.out.println("***Placed screenshot in "+filePath+" ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return scrFile;
    }

    public static String readAllTextFromScreenshot(File screenshot) {

        Ocr.setUp(); // one time setup
        Ocr ocr = new Ocr(); // create a new OCR engine
        ocr.startEngine("eng", Ocr.SPEED_SLOW); // English
        String s = ocr.recognize(new File[]{screenshot},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        System.out.println("Result: " + s);
        ocr.stopEngine();
        return s;
    }

    public String getScreenshotText(){
        return readAllTextFromScreenshot(takeScreenShot("testtakingscreenshot"));

    }
}
