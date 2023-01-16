package scenario;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchResultsPage;

public class Test1 extends BaseTests {
    @Test
    public void testBookingSeat(){
        homePage.setFromSearchBox("CHIKKAMAGALURU");
        homePage.setToSearchBox("BENGALURU");
        homePage.setDepartureDate("20");
        SearchResultsPage searchResultsPage =  homePage.clickSearchButton();
        //**To Do--> Complete the scenario inside searchResultsPage**//
    }
}
