package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver =  new FirefoxDriver();
        //set the browser resolution of 1024x768px
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void closeUp(){
        driver.quit();
    }

}
