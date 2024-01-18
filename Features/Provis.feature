Feature: Login to Provis 
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
#Then page title should be "Provis"
#And user click on close
#And user click on account
#When user click on logout
#Then Page2 title should be "Login to Provis"
Then close browser