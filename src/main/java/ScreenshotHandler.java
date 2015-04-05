package main.java;

import test.java.CommonBaseTest;
import com.asprise.ocr.Ocr;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vyacheslav on 26.03.2015.
 */
public class ScreenshotHandler {

    //WebDriver driver=null;
    private static String filePath = "E:\\SCREENSHOTS\\"; //bad idea, temporarily

    public static File takeScreenShot(ITestResult result) { //bad, methodname is not always needed
        //get the driver
        WebDriver driver= CommonBaseTest.getDriver();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath+result.getName()+".png"));

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

    public static String getScreenshotText(ITestResult result){
        return readAllTextFromScreenshot(takeScreenShot(result));

    }
}
