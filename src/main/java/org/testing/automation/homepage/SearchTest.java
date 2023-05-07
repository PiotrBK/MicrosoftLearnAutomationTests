package org.testing.automation.homepage;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testing.automation.Browser;

import java.util.HashMap;
import java.util.Map;

public class SearchTest {


    static private Map<String, Object> vars;
    static JavascriptExecutor js;
    private static Browser browser;

    @BeforeAll
    public static void setUp() {
        browser = new Browser();
        js = (JavascriptExecutor) browser.driver;
        vars = new HashMap<String, Object>();
    }

    @Test
    public void searching() {

        Pages.homePage().goTo();
        browser.driver.findElement(By.id("welcome-page-search-form-autocomplete-input")).click();
        browser.driver.findElement(By.id("welcome-page-search-form-autocomplete-input")).sendKeys("Azure");
        browser.driver.findElement(By.id("welcome-page-search-form-autocomplete-input")).sendKeys(Keys.ENTER);

    }


}
