package org.digitalsekola;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

class AppTest{

    @Test
    public void TestCase1(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://yopmail.com/en/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement inputBar = driver.findElement(By.className("ycptinput"));
        inputBar.sendKeys("testing");
        WebElement enterKey = driver.findElement(By.xpath("//button[@class=\"md\"]"));
        enterKey.click();
        WebElement titleEmail = driver.findElement(By.className("bname"));

//        Assert.assertEquals(titleEmail.getText(),"testing@yopmail.com!");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(titleEmail.getText(),"testing@yopmail.com!");


//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(d -> inputBar.isDisplayed());


        driver.quit();
        softAssert.assertAll();
    }
}