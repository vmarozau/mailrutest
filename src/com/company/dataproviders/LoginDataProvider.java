package com.company.dataproviders;

/**
 * Created by Vyacheslav on 22.02.2015.
 */
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginDataProvider {


        @DataProvider(name = "login-data-provider")
        public static Object[][] dataProviderMethod() {

            //*** won't work for now because of google issue https://github.com/appium/appium/issues/968
            return new Object[][]{
                    //***{"tgtkjdfhjkhkj", "testpassword", "Incorrect username"},
                    //***{"ttt", "testpassword", "Incorrect password"},
                    {"Wikitestuser2","WikiTestUser", "Login Success!"}//***

            };
        }

//        @Test(dataProvider = "data-provider")
//        public void testMethod(String data) {
//            System.out.println("Data is: " + data);
//        }

}