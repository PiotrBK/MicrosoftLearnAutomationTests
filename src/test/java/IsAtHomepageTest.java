import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.automation.pages.HomePage;

public class IsAtHomepageTest {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();


    }

    @Test
    public void canGoToHomePage(){

        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        Assertions.assertTrue(homePage.isAt());

    }

}
