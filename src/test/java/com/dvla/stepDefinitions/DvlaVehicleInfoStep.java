package com.dvla.stepDefinitions;

import com.dvla.pages.GetVehicleInfoPage;
import com.dvla.pages.VehicleDetailsPage;
import com.dvla.pages.VehicleEnquiryPage;
import com.dvla.utils.DriverRepository;
import com.dvla.utils.ServiceReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
public class DvlaVehicleInfoStep {
    @Autowired
    private World world;
    private static final Logger logger = LogManager.getLogger(DvlaVehicleInfoStep.class);

    private List<String[]> vehicleList;
    WebDriver driver = DriverRepository.driver;
    private final ServiceReader serviceReader = new ServiceReader();

    @Given("^I have \"([^\"]*)\" files in \"([^\"]*)\" folder$")
    public void i_have_files_in_folder(String fileType, String folderName) {
        vehicleList = serviceReader.getVehicleInfo(fileType, folderName);
        Assert.assertFalse("Vehice details missing", vehicleList.size() < 1);
        logger.info("Reading Vehice Info " + fileType + " files from " + folderName + " folder");
    }

    @And("^I have navigated to the DVLA get Vehicle Information page$")
    public void iHaveNavigatedToTheDVLAGetVehicleInformationPage() {
        world.getVehicleInfoPage = new GetVehicleInfoPage(DriverRepository.driver);
        world.getVehicleInfoPage.clickOnStartButton();
    }

    @Then("^I verify make and color of all vehicles$")
    public void iVerifyMakeAndColorOfAllVehicles() {
        world.vehicleEnquiryPage = new VehicleEnquiryPage(DriverRepository.driver);
        world.vehicleDetailsPage = new VehicleDetailsPage(DriverRepository.driver);
        for (String[] Info : vehicleList) {
            world.vehicleEnquiryPage.enterRegNumber(Info[0]);
            world.vehicleEnquiryPage.clickContinue();
            world.vehicleDetailsPage.validate(Info[1], Info[2]);
            world.vehicleDetailsPage.searchAgain();
        }
    }
}
