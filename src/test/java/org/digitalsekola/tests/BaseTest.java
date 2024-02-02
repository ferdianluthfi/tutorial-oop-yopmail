package org.digitalsekola.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    @BeforeSuite
    public void globalSetUp(){
        System.out.println("************************************** Test Execution Started *****************************");
    }

    @AfterSuite
    public void globalTearDown(){
        System.out.println("************************************** Test Execution Finished *****************************");
    }

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://yopmail.com");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
