package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    private By fromSearchBox = By.id("fromPlaceName");
    private By toSearchBox = By.id("toPlaceName");
    private By returnDate = By.id("txtReturnJourneyDate");
    private By searchButton = By.className("btn btn-primary btn-lg btn-block btn-booking");
    private WebElement dateWidget = driver.findElement(returnDate);


    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFromSearchBox (String source){
        driver.findElement(fromSearchBox).sendKeys(source);
       // Select dropdown = new Select(driver.findElement(fromSearchBox));
        //dropdown.selectByVisibleText("CHIKKAMAGALURU");

    }
    public void setToSearchBox (String destination){
        driver.findElement(toSearchBox).sendKeys(destination);
    }

    public void setDepartureDate () {
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        for (WebElement cell : columns) {
            //Select 20th Date
            if (cell.getText().equals("20")) {
                cell.findElement(By.linkText("20")).click();
                break;
            }
        }
    }

    public SearchResultsPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new SearchResultsPage(driver);
    }

    }
