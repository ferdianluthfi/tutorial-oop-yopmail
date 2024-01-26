package org.digitalsekola.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "ycptinput")
    private WebElement searchbarInput;

    public void testing(){
        System.out.println("MANTAAPPPP MASUK SINI");
    }
}
