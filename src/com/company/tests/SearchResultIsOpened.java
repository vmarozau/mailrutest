package com.company.tests;

import com.company.dataproviders.QueryDataProvider;
import com.company.pages.FeaturedArticlePage;
import com.company.pages.PagePage;
import com.company.pages.SearchResultsPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 11.03.2015.
 */
public class SearchResultIsOpened extends CommonBaseTest {

    @BeforeTest
    public void pressSkip(){
        StartPage.pressSkip(driver);
    }

//    @AfterMethod
//    public void

    @Test(dataProvider = "query-provider", dataProviderClass = QueryDataProvider.class)
    public void searchResultIsOpened(String query) throws InterruptedException {
        FeaturedArticlePage.enterTextInSearchField(query, driver);
        SearchResultsPage.tapSearchResult(query, driver);
        Assert.assertTrue(PagePage.searchResultIsPresentInTitle(query, driver));


    }
}
