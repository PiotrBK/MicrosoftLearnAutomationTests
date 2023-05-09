import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.automation.pages.HomePage;
import org.testing.automation.pages.SearchPage;

public class SearchTest {


    static WebDriver driver;

    @BeforeAll
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

    @AfterAll
    public static void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }


}
