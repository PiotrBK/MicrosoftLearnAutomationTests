package org.testing.automation.homepage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testing.automation.pages.HomePage;
//import org.testing.automation.Page;
public class IsAtHomepageTest {

    @Test
    public void canGoToHomePage(){
        HomePage homepage = new HomePage();
        homepage.goTo();
        Assertions.assertTrue(homepage.isAt());


    }


}
