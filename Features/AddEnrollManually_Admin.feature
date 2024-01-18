Feature: Add Enroll Manually Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
#Then page title should be "Provis"
#And user click on close
Then click on Building Mgmt for Add Enroll Manually
Then click on Classes for Add Enroll Manually
Then Click on Add Enroll Manually
Then click on class drop down Add Enroll Manually
Then select any option under class on Add Enroll Manually
Then lick on User  drop down Add Enroll Manually
Then select any option under User on Add Enroll Manually
Then click on Select Your Package on Add Enroll Manually
Then click on Select Your Schedule on Add Enroll Manually
Then click on unit number and select the any one option on Add Enroll Manually
Then Enter Applicant Name on Add Enroll Manually "Akash"
Then Enter Applicant Age on Add Enroll Manually "25"
#Then click on Terms Conditions on Add Enroll Manually
Then click on Add Enrollment on Add Enroll Manually
Then User can see the conformtion messag "Enrollment added"
Then close browser
