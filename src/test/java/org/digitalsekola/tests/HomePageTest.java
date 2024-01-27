package org.digitalsekola.tests;

import org.digitalsekola.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HomePageTest extends BaseTest{
    @Test
    public void openHomePageTest(){
        HomePage homePage = new HomePage(driver);
        driver.get("https://yopmail.com/en/");
        homePage.inputOnSearchBar("Testing");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(5,4);
        System.out.println("MASUK SINIIII");
        softAssert.assertAll();

    }

}
