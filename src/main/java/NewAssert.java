package main.java;

import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vyacheslav on 30.03.2015.
 */
public class NewAssert extends TestLogger
{

    private Map<ITestResult, List<Throwable>> verificationFailuresMap = new HashMap<ITestResult, List<Throwable>>();
    //private ScreenshotMaker screenshotMaker = new ScreenshotMaker();

    public void assertTrue(boolean condition)
    {
        try
        {
            org.testng.Assert.assertTrue(condition);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertTrue(boolean condition, String message)
    {
        try
        {
            org.testng.Assert.assertTrue(condition, message);
        } catch (AssertionError e)
        {
            logFailed("The following assertion has been failed: " + message);
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertFalse(boolean condition)
    {
        try
        {
            org.testng.Assert.assertFalse(condition);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertFalse(boolean condition, String message)
    {
        try
        {
            org.testng.Assert.assertFalse(condition, message);
        } catch (AssertionError e)
        {
            logFailed("The following assertion has been failed: " + message);
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertEquals(boolean actual, boolean expected)
    {
        try
        {
            org.testng.Assert.assertEquals(actual, expected);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertEquals(Object actual, Object expected)
    {
        try
        {
            org.testng.Assert.assertEquals(actual, expected);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertEquals(Object[] actual, Object[] expected)
    {
        try
        {
            org.testng.Assert.assertEquals(actual, expected);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void assertEquals(Object actual, Object expected, String message)
    {
        try
        {
            org.testng.Assert.assertEquals(actual, expected, message);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
        logPassed();
    }

    public void fail(String errorText)
    {
        try
        {
            org.testng.Assert.fail(errorText);
        } catch (AssertionError e)
        {
            logFailed();
            addScreenshot();
            throw e;
        }
    }

    public void verifyTrue(boolean condition)
    {
        try
        {
            assertTrue(condition);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void verifyTrue(boolean condition, String message)
    {
        try
        {
            assertTrue(condition, message);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void verifyFalse(boolean condition)
    {
        try
        {
            assertFalse(condition);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void verifyFalse(boolean condition, String message)
    {
        try
        {
            assertFalse(condition, message);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void verifyEquals(boolean actual, boolean expected)
    {
        try
        {
            assertEquals(actual, expected);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void verifyEquals(Object actual, Object expected)
    {
        try
        {
            assertEquals(actual, expected);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void verifyEquals(Object[] actual, Object[] expected)
    {
        try
        {
            assertEquals(actual, expected);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public void softFail(String errorText)
    {
        try
        {
            fail(errorText);
        } catch (Throwable e)
        {
            addVerificationFailure(e);
        }
    }

    public List<Throwable> getVerificationFailures()
    {
        List<Throwable> verificationFailures = verificationFailuresMap.get(Reporter.getCurrentTestResult());
        return verificationFailures == null ? new ArrayList<Throwable>() : verificationFailures;
    }

    private void addVerificationFailure(Throwable e)
    {
        List verificationFailures = getVerificationFailures();
        verificationFailuresMap.put(Reporter.getCurrentTestResult(), verificationFailures);
        verificationFailures.add(e);
    }

    private void addScreenshot()
    {
        ScreenshotHandler.takeScreenShot(Reporter.getCurrentTestResult());
    }
}

