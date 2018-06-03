package com.dvla.utils;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(Hooks.class);
    private static final ChromeOptions options = new ChromeOptions();

    @Before
    public static void driverSetup() {
        String OS = System.getProperty("os.name").toLowerCase();
        logger.info("Executing test on " + OS);
        if (OS.contains("win")) {
            System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        }
        options.addArguments("--start-maximized");
        options.addArguments("--disable-geolocation");
        WebDriver driver = new ChromeDriver(options);
        DriverRepository.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public static void driverClose() {
        DriverRepository.driver.quit();
    }
}
