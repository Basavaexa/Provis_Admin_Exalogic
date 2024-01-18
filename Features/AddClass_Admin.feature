Feature: Add Class Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
#Then page title should be "Provis"
#And user click on close
Then click on Building Mgmt for Add class
Then click on Classes for Add class
Then Click on Add Class
Then Enter Class Title for Add class "Cricket"
Then Enter Service Provider for Add class "Testing"
Then Enter the Service Provider Email for Add class "test@yopmail.com"
Then Upload Website Images for Add class "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Upload Mobile Images for Add class "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
#Then click ok on pop up
Then Enter location for Add class "Test data"
Then click on Start Date for Add class 
Then select the date on Start Date for Add class 
Then click on End Date for Add class 
Then select the date on End Date for Add class 
Then Enter Max No of Application for Add class "1"
Then Enter Description for Add class "Testing Testing Testing"
Then Enter Terms & Conditions for Add class "Testdata Testdata Testdata"
Then Enter the Package Title for Add class "Test"
Then Enter Fee for Add class "500"
Then Enter age Range for Add class "25"
#Then Enter first time for Add class "13:40"
#Then Enter second time for Add class "15:40"
#Then Click on Add button for Add class
Then User can view the confrmation mesage "Added Successfully!"
Then close browser


