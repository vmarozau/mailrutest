package main.java.deprecated;

import main.java.pages.LoginPage;
import test.java.CommonBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 08.02.2015.
 */
public class EmptyEmail2 extends CommonBaseTest {

    @Test
    public void emptyEmail2 () {
        //LoginPage loginPage = new LoginPage(driver);
        LoginPage.fillEmailField("", driver);
        LoginPage.fillPasswordField("", driver);
        Assert.assertEquals(LoginPage.isButtonEnabled(driver), false);
    }
}
