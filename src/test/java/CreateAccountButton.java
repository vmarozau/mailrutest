package test.java;

import main.java.pages.CreateAccountPage;
import main.java.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class CreateAccountButton extends CommonBaseTest {

    @BeforeTest
    public void pressCreateAccountButton(){
        StartPage.pressCreateAccountButton(driver);
    }
    @Test
    public void pressCreateAccountButtonShouldOpenCreatePage () {

        Assert.assertEquals(CreateAccountPage.createElementsArePresent(driver), true, "Not all needed elements are found");

    }
}
