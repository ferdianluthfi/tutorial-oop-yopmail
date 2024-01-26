package org.digitalsekola;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

class AppTest{

    @Test
    public void TestCase1(){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://yopmail.com/en/");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        message.getText();
        driver.quit();
    }
}