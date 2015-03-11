package com.company.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by Vyacheslav on 03.03.2015.
 */
public class QueryDataProvider {

    @DataProvider(name = "query-provider")
    public static Object[][] dataProviderMethod() {


        return new Object[][]{
                {"Beer"},
                {"Android"},
                {"Google"}

        };
    }
}
