
import org.openqa.selenium.WebDriver;
import org.testing.automation.Cleanup;
import org.testing.automation.Setup;
import org.testing.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class IsAtHomepageTest {

    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = Setup.setUp();
    }

    @Test
    public void canGoToHomePage(){

        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        Assert.assertTrue(homePage.isAt());

    }

    @AfterTest
    public void cleanup(){
        Cleanup.cleanup(driver);
    }
}
