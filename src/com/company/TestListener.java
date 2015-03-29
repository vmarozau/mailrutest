package com.company;

/**
 * Created by Vyacheslav on 24.03.2015.
 */
import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.company.tests.CommonBaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    private String device = "Samsung Galaxy S4"; //temporarily
    private int m_count;

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotHandler handler = new ScreenshotHandler();
        log(result.getName() + " - Failed in " + device + " --  " + new Date(System.currentTimeMillis()));
        String methodName=result.getName().toString().trim();
        handler.takeScreenShot(methodName);
    }


    public void onFinish(ITestContext context) {}

    public void onTestStart(ITestResult result) {   }

    public void onTestSuccess(ITestResult result) {
        log(result.getName() + " - Passed on " + device + " --  " + new Date(System.currentTimeMillis()));
    }

    public void onTestSkipped(ITestResult result) {
        log(result.getName() + " - Skipped on " + device + " --  " + new Date(System.currentTimeMillis()));
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

    public void onStart(ITestContext context) {   }

    private void log(String string)
    {
        System.out.println(string);

        if (++m_count % 40 == 0)
        {
            System.out.println("");
        }
    }
}