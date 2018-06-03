# Selenium Automation Test Framework
##### A Cucumber based test project with Selenium page objects 
BDD test framework to read a CSV files from directory and check make and color of vehicles

#####Logger
Set Logger Info levels in this file src/test/resources/log4j2.xml

#####Choose cucumber test
RunCucumberTests.java

```Options 
features = "src/test/resources/features" - folder where feature files are placed
 tags = {"@dvla"}, // Tags to select for execution
```

####Executing tests
Tests can be run using IntelliJ or any other suitable IDE
or using command ```mvn test```

#### Sample project 
Project template from - https://start.spring.io/

