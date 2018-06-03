package com.dvla.pages;

import com.dvla.utils.DriverRepository;
import org.openqa.selenium.WebDriver;

class PageBase extends DriverRepository {
    PageBase(WebDriver driver) {
        this.driver = driver;
    }
}