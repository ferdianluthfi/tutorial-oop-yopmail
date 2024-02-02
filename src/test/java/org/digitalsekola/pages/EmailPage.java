package org.digitalsekola.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage{
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "bname")
    private WebElement emailTitle;

    public WebElement getEmailTitle(){
        return emailTitle;
    }
}
