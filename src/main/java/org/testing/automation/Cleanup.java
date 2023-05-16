package org.testing.automation;
import org.openqa.selenium.WebDriver;

public class Cleanup {


    public static void cleanup(WebDriver driver) {
        driver.manage().deleteAllCookies();
        driver.close();


    }
}