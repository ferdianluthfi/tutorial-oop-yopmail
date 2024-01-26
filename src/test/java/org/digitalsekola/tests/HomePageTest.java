package org.digitalsekola.tests;

import org.digitalsekola.pages.HomePage;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest{
    @Test
    public void openHomePageTest(){
        driver.get("https://yopmail.com/en/");
        HomePage homePage = new HomePage(driver);
        homePage.testing();
    }

}
