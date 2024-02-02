package org.digitalsekola.tests;

import org.digitalsekola.pages.DomainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DomainPageTest extends BaseTest{

    @BeforeClass
    public void setUpDomainPage(){
        driver.get("https://yopmail.com/en/add-domain");
    }

    @Test
    public void add_new_domain(){
        DomainPage domainPage = new DomainPage(driver);
        domainPage.registerNewDomain("testing@gmail.com", "012345678910");
    }
    @Test
    public void add_new_domain1(){
        System.out.println("MANTAPPPP");
    }
}
