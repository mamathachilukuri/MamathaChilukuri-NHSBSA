This is a UI Test Automation framework for NHS Costs Checker. 


## Tools Used
```
Java 
Apache Maven 
Selenium 3.14.0
Cucumber 1.2.5
TestNG 6.14.3
```

## Reporting

maven-cucumber-reporting plugin version 3.13.0 is used to generate the reports. 
Reports are written to /target/cucumber-report-html/cucumber-html-reports directory after a successful run.

To run locally 
## Commands:

## To run with Chrome
```
mvn clean
mvn test -Dbrowser_name=chrome
```

## To run with Firefox
```
mvn clean
mvn test -Dbrowser_name=firefox
```
