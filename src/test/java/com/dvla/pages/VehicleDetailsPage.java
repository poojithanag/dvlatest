package com.dvla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class VehicleDetailsPage extends PageBase {
    //Locators
    @FindBy(how = How.CSS, using = "#pr3 > div > ul > li:nth-child(2) > span:nth-child(2) > strong")
    private WebElement makeElement;

    @FindBy(how = How.CSS, using = "#pr3 > div > ul > li:nth-child(3) > span:nth-child(2) > strong")
    private WebElement colorElement;

    @FindBy(how = How.CSS, using = "#proposition-name")
    private WebElement searchAgain;

    //Constructor
    public VehicleDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void validate(String make, String color) {
        assertEquals("Vehicle details does not match or Vehicle details could not be found", make, makeElement.getText());
        assertEquals("Vehicle details does not match or Vehicle details could not be found", color, colorElement.getText());
    }

    public void searchAgain() {
        searchAgain.click();
    }
}
