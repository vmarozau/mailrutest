package main.java;

/**
 * Created by Vyacheslav on 24.03.2015.
 */
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    private String device = "Samsung Galaxy S4"; //temporarily
    private int m_count;

    @Override
    public void onTestFailure(ITestResult result) {
        TestLogger testLogger = new TestLogger();
        log(result.getName() + " - Failed in " + device + " --  " + new Date(System.currentTimeMillis()));
        String methodName=result.getName().toString().trim();
        ScreenshotHandler.takeScreenShot(result);
        testLogger.addToLog("Screenshot is <a href=E://Screenshots//" + result.getName() +".png>here</a>");
        //testLogger.addToLog("Screenshot is <a href=../" + SCREENSHOT_FOLDER_FOR_REPORT + result.getName() + timeStamp + SCREENSHOT_FORMAT + ">here</a>");
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