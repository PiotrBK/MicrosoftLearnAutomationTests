package org.testing.automation.homepage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testing.automation.Page;
import org.testing.automation.pages.HomePage;
public class IsAtHomepageTest {

    @Test
    public void canGoToHomePage(){
        Page homepage = new HomePage();
        homepage.goTo();
        Assertions.assertTrue(homepage.isAt());


    }


}
