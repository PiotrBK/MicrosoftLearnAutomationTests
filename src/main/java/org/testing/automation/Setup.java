package org.testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Setup {


    static WebDriver driver;
    @BeforeTest
    public static WebDriver setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
