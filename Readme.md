####Installation Steps
Download the Project from the below link
Open the project in IntelliJ or suitable IDE (Note: Can run the project using command ```mvn test```)
Install plugins if any is required/prompted.

#Setup (Very Important):
Running the test on Windows machine need geckodriver.exe and chromedriver.exe.
Since above files are .exe files, cannot commit them in github.
Please download the files from internet and place them in 'dvlatest\drivers' folder.
####Test Scenarios
There are 3 scenarios for three file types, with below expected results
1) CSV - Pass - Valid vehicle detail present
2) XLS - Fail - No vehice details present
3) XLSX - Fail - Asssertion for Vehicle color

#### Selenium Automation Test Framework
A Cucumber based test project using Selenium page object model and PageFactory
Java and Junit Test Framework
Maven Project Build architecture


####Limitations using Cucumber
Unable to run scenario outline with each set of data from xls or csv files

#####Logger
Set Logger Info levels in this file src/test/resources/log4j2.xml

#####Choose cucumber test
RunCucumberTests.java

```Options 
features = "src/test/resources/features" - folder where feature files are placed
 tags = {"@dvla"}, // Tags to select for execution
```

#### Sample project 
Project template from - https://start.spring.io/

#### What the project about?
BDD test framework to read a CSV files from directory and check make and color of vehicles


