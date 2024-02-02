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
        System.out.println("************************************** Setup before class *************************************");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("************************************** Setup after class *************************************");
    }
}
