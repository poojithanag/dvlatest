package com.dvla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VehicleEnquiryPage extends PageBase {
    public String button = "#content > form > div > div > div.form-group.no-bottom > fieldset > button";

    //Locators
    @FindBy(how = How.CSS, using = "#Vrm")
    private WebElement regNo;

    @FindBy(how = How.CSS, using = "#content > form > div > div > div.form-group.no-bottom > fieldset > button")
    private WebElement continueButton;

    //Constructor
    public VehicleEnquiryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void enterRegNumber(String registrationNumber) {
        regNo.sendKeys(registrationNumber);
    }

    public void clickContinue() {
        continueButton.click();
    }
}
