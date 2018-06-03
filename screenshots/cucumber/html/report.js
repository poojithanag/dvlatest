$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("vehicleChecker.feature");
formatter.feature({
  "line": 1,
  "name": "Check vehicle registration from Supported file types",
  "description": "All vehicles present in CSV / XLS /XLSX file must be checked",
  "id": "check-vehicle-registration-from-supported-file-types",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5586634994,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Validate the vehicle details",
  "description": "",
  "id": "check-vehicle-registration-from-supported-file-types;validate-the-vehicle-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@dvla"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I have \"csv\" files in \"TestVehicle\" folder",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have navigated to the DVLA get Vehicle Information page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify make and color of all vehicles",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "csv",
      "offset": 8
    },
    {
      "val": "TestVehicle",
      "offset": 23
    }
  ],
  "location": "DvlaVehicleInfoStep.i_have_files_in_folder(String,String)"
});
formatter.result({
  "duration": 830252451,
  "status": "passed"
});
formatter.match({
  "location": "DvlaVehicleInfoStep.iHaveNavigatedToTheDVLAGetVehicleInformationPage()"
});
formatter.result({
  "duration": 916393841,
  "status": "passed"
});
formatter.match({
  "location": "DvlaVehicleInfoStep.iVerifyMakeAndColorOfAllVehicles()"
});
formatter.result({
  "duration": 2736402866,
  "status": "passed"
});
formatter.after({
  "duration": 80956621,
  "status": "passed"
});
formatter.before({
  "duration": 5053750985,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate the vehicle details",
  "description": "",
  "id": "check-vehicle-registration-from-supported-file-types;validate-the-vehicle-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@dvla"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I have \"xls\" files in \"TestVehicle\" folder",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I have navigated to the DVLA get Vehicle Information page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify make and color of all vehicles",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "xls",
      "offset": 8
    },
    {
      "val": "TestVehicle",
      "offset": 23
    }
  ],
  "location": "DvlaVehicleInfoStep.i_have_files_in_folder(String,String)"
});
formatter.result({
  "duration": 161962494,
  "error_message": "java.lang.AssertionError: Vehice details missing\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertFalse(Assert.java:64)\n\tat com.dvla.stepDefinitions.DvlaVehicleInfoStep.i_have_files_in_folder(DvlaVehicleInfoStep.java:34)\n\tat ✽.Given I have \"xls\" files in \"TestVehicle\" folder(vehicleChecker.feature:12)\n",
  "status": "failed"
});
formatter.match({
  "location": "DvlaVehicleInfoStep.iHaveNavigatedToTheDVLAGetVehicleInformationPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DvlaVehicleInfoStep.iVerifyMakeAndColorOfAllVehicles()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 81748347,
  "status": "passed"
});
formatter.before({
  "duration": 5018334598,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate the vehicle details",
  "description": "",
  "id": "check-vehicle-registration-from-supported-file-types;validate-the-vehicle-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@dvla"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I have \"xlsx\" files in \"TestVehicle\" folder",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I have navigated to the DVLA get Vehicle Information page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify make and color of all vehicles",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "xlsx",
      "offset": 8
    },
    {
      "val": "TestVehicle",
      "offset": 24
    }
  ],
  "location": "DvlaVehicleInfoStep.i_have_files_in_folder(String,String)"
});
formatter.result({
  "duration": 508150035,
  "status": "passed"
});
formatter.match({
  "location": "DvlaVehicleInfoStep.iHaveNavigatedToTheDVLAGetVehicleInformationPage()"
});
formatter.result({
  "duration": 841154858,
  "status": "passed"
});
formatter.match({
  "location": "DvlaVehicleInfoStep.iVerifyMakeAndColorOfAllVehicles()"
});
formatter.result({
  "duration": 10216448835,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#Vrm\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.39.562713 (dd642283e958a93ebf6891600db055f1f1b4f3b2),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027Tejz-MBP.connect\u0027, ip: \u0027fe80:0:0:0:1457:538d:797:a73a%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.39.562713 (dd642283e958a9..., userDataDir: /var/folders/b4/56gvbxnx2bl...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: c830fac608b24274c24e5c3b216a7b2c\n*** Element info: {Using\u003dcss selector, value\u003d#Vrm}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:465)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy73.sendKeys(Unknown Source)\n\tat com.dvla.pages.VehicleEnquiryPage.enterRegNumber(VehicleEnquiryPage.java:27)\n\tat com.dvla.stepDefinitions.DvlaVehicleInfoStep.iVerifyMakeAndColorOfAllVehicles(DvlaVehicleInfoStep.java:49)\n\tat ✽.Then I verify make and color of all vehicles(vehicleChecker.feature:20)\n",
  "status": "failed"
});
formatter.after({
  "duration": 86260155,
  "status": "passed"
});
});