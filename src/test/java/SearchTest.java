

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.automation.pages.HomePage;
import org.testing.automation.pages.SearchPage;
import org.testng.annotations.*;

public class SearchTest {


    static WebDriver driver;

    @BeforeTest
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searching() {

        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        homePage.searchbox("Azure AI Certification");
        SearchPage searchPage = new SearchPage(driver);

    }

    @AfterTest
    public static void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }


}
