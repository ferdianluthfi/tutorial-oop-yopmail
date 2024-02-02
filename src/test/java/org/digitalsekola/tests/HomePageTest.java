package org.digitalsekola.tests;

import org.digitalsekola.pages.EmailPage;
import org.digitalsekola.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    HomePage homePage;
    EmailPage emailPage;
    @BeforeMethod
    public void setupPages(){
        homePage = new HomePage(driver);
        emailPage = new EmailPage(driver);
    }

    @AfterMethod
    public void backPage(){
        driver.get("https://yopmail.com");
    }

    @Test
    public void searchEmailAddress(){
        homePage.inputOnSearchBar("testing");
        Assert.assertEquals(emailPage.getEmailTitle().getText(),"testing@yopmail.com");
    }

    @Test
    public void searchEmailAddress2(){
        homePage.clearSearchBar();
        homePage.inputOnSearchBar("testing22");
        Assert.assertEquals(emailPage.getEmailTitle().getText(),"testing22@yopmail.com");
    }
}
