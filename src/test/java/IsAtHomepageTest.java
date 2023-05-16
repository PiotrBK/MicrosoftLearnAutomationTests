
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class IsAtHomepageTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();


    }

    @Test
    public void canGoToHomePage(){

        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        Assert.assertTrue(homePage.isAt());

    }

}
