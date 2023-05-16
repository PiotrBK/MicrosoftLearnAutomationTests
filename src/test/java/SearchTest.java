


import org.openqa.selenium.WebDriver;
import org.testing.automation.Cleanup;
import org.testing.automation.Setup;
import org.testing.automation.pages.HomePage;
import org.testing.automation.pages.SearchPage;
import org.testng.annotations.*;

public class SearchTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = Setup.setUp();
    }

    @Test
    public void searching() {

        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        homePage.searchbox("Azure AI Certification");

    }

    @AfterTest
    public void cleanup(){
        Cleanup.cleanup(driver);

    }

}
