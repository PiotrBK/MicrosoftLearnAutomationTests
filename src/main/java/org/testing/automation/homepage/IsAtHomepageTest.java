package org.testing.automation.homepage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testing.automation.Browser;
import org.testing.automation.Pages;

public class IsAtHomepageTest {

    @Test
    public void canGoToHomePage(){

        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());

    }

}
