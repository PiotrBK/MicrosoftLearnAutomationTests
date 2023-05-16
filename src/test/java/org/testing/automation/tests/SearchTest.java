package org.testing.automation.tests;


import org.openqa.selenium.WebDriver;
import org.testing.automation.Cleanup;
import org.testing.automation.Setup;
import org.testing.automation.pages.HomePage;
import org.testing.automation.pages.SearchPage;
import org.testng.Assert;
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
        SearchPage searchpage = new SearchPage(driver);
        searchpage.clickCertyfikaty();
        searchpage.clickFirstResult();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://learn.microsoft.com/en-us/certifications/exams/ai-900/"));
    }

    @AfterTest
    public void cleanup(){
        Cleanup.cleanup(driver);

    }

}
