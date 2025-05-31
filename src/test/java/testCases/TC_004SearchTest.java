package testCases;

import org.testng.annotations.Test;
import pageObjects.SearchPage;

public class TC_004SearchTest extends BaseClass {

    @Test
    public void searchTest1() {
        SearchPage searchPage = new SearchPage(driver);
        
        searchPage.setSearch(p.getProperty("search"));  // Sets search text
        searchPage.clickSearch();                        // Clicks the search button

        // Optionally add assertions here to validate the search results
        // Assert.assertTrue(searchPage.isResultDisplayed(), "Search result not displayed");
    }
}
