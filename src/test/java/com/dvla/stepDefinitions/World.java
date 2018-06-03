package com.dvla.stepDefinitions;

import com.dvla.pages.GetVehicleInfoPage;
import com.dvla.pages.VehicleDetailsPage;
import com.dvla.pages.VehicleEnquiryPage;
import org.springframework.stereotype.Component;

@Component
public class World {
    GetVehicleInfoPage getVehicleInfoPage;
    VehicleDetailsPage vehicleDetailsPage;
    VehicleEnquiryPage vehicleEnquiryPage;
}