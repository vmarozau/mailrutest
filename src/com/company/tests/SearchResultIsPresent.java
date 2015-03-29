package com.company.tests;

import com.company.dataproviders.QueryDataProvider;
import com.company.pages.FeaturedArticlePage;
import com.company.pages.SearchResultsPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 03.03.2015.
 */
public class SearchResultIsPresent extends CommonBaseTest{

    @BeforeTest
    public void pressSkip(){
        StartPage.pressSkip(driver);
    }

    @Test(dataProvider = "query-provider", dataProviderClass = QueryDataProvider.class)
    public void searchResultIsPresent(String query) throws InterruptedException {
        testLogger.testStep("1. Entering query in search field");
        FeaturedArticlePage.enterTextInSearchField(query, driver);

        testLogger.testStep("2.Verify that entered query is present in Search results page");
        Assert.assertTrue(SearchResultsPage.searchResultIsPresent(query, driver));

    }
}
