package com.dvla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GetVehicleInfoPage extends PageBase {

    //Locators
    @FindBy(how = How.CSS, using = "#get-started > a")
    private WebElement startNowButton;

    public GetVehicleInfoPage(WebDriver driver) {
        super(driver);
        String PAGE_URL = "https://www.gov.uk/get-vehicle-information-from-dvla";
        driver.get(PAGE_URL); // Navigate to vehicle Info page
        PageFactory.initElements(driver, this); // Page Factory Initialisation
    }

    //Actions
    public void clickOnStartButton() {
        startNowButton.click();
    }
}

