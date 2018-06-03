Feature: Check vehicle registration from Supported file types
  All vehicles present in CSV / XLS /XLSX file must be checked

  @dvla
  Scenario: Validate the vehicle details
    Given I have "csv" files in "TestVehicle" folder
    And I have navigated to the DVLA get Vehicle Information page
    Then I verify make and color of all vehicles

  @dvla
  Scenario: Validate the vehicle details
    Given I have "xls" files in "TestVehicle" folder
    And I have navigated to the DVLA get Vehicle Information page
    Then I verify make and color of all vehicles

  @dvla
  Scenario: Validate the vehicle details
    Given I have "xlsx" files in "TestVehicle" folder
    And I have navigated to the DVLA get Vehicle Information page
    Then I verify make and color of all vehicles