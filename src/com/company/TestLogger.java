package com.company;

import org.testng.Reporter;

/**
 * Created by Vyacheslav on 28.03.2015.
 */

    public class TestLogger
    {

        public void testStep(String text)
        {
            if (text.startsWith("-- "))
            {
                addToLog("<b>" + text + "</b>");
            } else
            {
                addToLog(text);
            }
        }

        public void testCheckResult(String text)
        {
            addToLog("<b> Verify that: </b> " + text);
        }

        public void logPassed()
        {
            addToLog("<b style=\"color:green\"> Passed </b>");
        }

        public void logFailed()
        {
            addToLog("<b style=\"color:red\"> Failed </b>");
        }

        public void logFailed(String errorText)
        {
            addToLog("<b style=\"color:red\">" + errorText + "</b>");
        }

        public void addToLog(String text)
        {
            Reporter.log(text + "<br>");
        }
    }


