# Day3MentoringSessionFiles

Sunday 6-8PM mentoring with Nurbek

TestNG quick overview
How to run failed testcases

http://testng.org/doc/index.html
http://learn-automation.com/group-test-cases-in-selenium/
http://learn-automation.com/advance-selenium-reporting-with-screenshots-2/
https://www.tutorialspoint.com/testng/testng_tutorial.pdf

http://extentreports.com/community/






Q1-Difference between Java Program and TestNg Script?
Answer- When we execute Java program and TestNG script then functionality wise nothing will change because our script is performing 
the same functionality but using TestNG you will get some additional functionality.

Some benefit of TestNG Script

1- For even single test case you will get 3 reports. These reports generated by TestNG
2-You can check execution time i.e. How much time test case has taken
3-Parallel execution  etc

Q1-Importance of Reporting in Selenium?

Ans-1- Reports helps you to identify the status of the test case (Pass/Fail/Skip).

2- Using reports we calculate time taken by  each test case that helps to calculate ROI(Return on Investment).

3- You can share automation reports with your team and clients as well to share the status of testing progress etc.

 

  Execute Failed test cases using Selenium

Steps

1-If your test cases are failing then once all test suite completed then you have to refresh your project . 
Right click on project > Click on refresh or Select project and press f5.

2-Check test-output folder, at last, you will get testng-failed.xml

3- Now simply run testng-failed.xml.

 
 
 
 Data driven framework in selenium webdriver

This framework purely depends on data and data source can be anything like Excel file, CSV File, database.

In data driven framework script will be separated from Data part, it means so if any changes happen we do not have to modify all the test cases.

Example-

I have to create 50 Gmail accounts so I have two approaches to do this

First- I can create 50 scripts and run them.

Second- I can keep all the data separate in the file and changes the data only that is required
 for script and script will be only one. In future, any changes in my application then I have to modify my one script only 