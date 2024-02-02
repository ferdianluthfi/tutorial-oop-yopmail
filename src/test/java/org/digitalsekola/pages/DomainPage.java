package org.digitalsekola.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DomainPage extends BasePage{
    public DomainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "adddomain")
    private WebElement addDomainBar;

    @FindBy(id = "addcontact")
    private WebElement addContactBar;

    @FindBy(id = "msgsend")
    private WebElement enterButton;

    public void registerNewDomain(String domainName, String contactNamr){
        addDomainBar.sendKeys(domainName);
        addContactBar.sendKeys(contactNamr);
        enterButton.click();

    }
}
