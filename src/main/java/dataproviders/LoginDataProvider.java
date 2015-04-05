package main.java.dataproviders;

/**
 * Created by Vyacheslav on 22.02.2015.
 */

import org.testng.annotations.DataProvider;


public class LoginDataProvider {


        @DataProvider(name = "login-data-provider")
        public static Object[][] dataProviderMethod() {

            return new Object[][]{
                    {"tgtkjdfhjkhkj", "testpassword", "Incorrect username"},
                    {"ttt", "testpassword", "Incorrect password"},
                    {"Wikitestuser2","WikiTestUser", "Login Success!"}//***

            };
        }
}