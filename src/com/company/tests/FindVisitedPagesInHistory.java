package com.company.tests;

import com.company.dataproviders.QueryDataProvider;
import com.company.pages.FeaturedArticlePage;
import com.company.pages.PagePage;
import com.company.pages.SearchResultsPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 11.03.2015.
 */
public class FindVisitedPagesInHistory extends CommonBaseTest {

    @BeforeTest
    public void pressSkip(){
        StartPage.pressSkip(driver);
        FeaturedArticlePage.enterTextInSearchField("Beer", driver);
        SearchResultsPage.tapSearchResult("Beer", driver);

    }

    @Test
    public void visitedPagesShouldBeInHistory() throws InterruptedException {
        //FeaturedArticlePage.enterTextInSearchField(query, driver);
        //SearchResultsPage.tapSearchResult(query, driver);
        PagePage.swipeToOpenLeftMenu(driver);
        PagePage.pressHistoryButton(driver);
        Assert.assertTrue(PagePage.areHistoryItemsPresent("Beer", driver));


    }
}
