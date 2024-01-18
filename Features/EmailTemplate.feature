Feature: Email Template Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then Click on Template 
Then Click on Email Template
Then Click on Add Email Template
Then Enter Template Name "Testing"
Then Enter Subject for Template "Test"
Then Enter Email Message for Template "hvhsdchdshv"
Then Enter SMS Message for Template "hcdvdgdvdgdvd"
Then Enter Notification Message for Template "dtgfvfdgfvdhgvfef"
Then Click category drop down and select any one option for Email template
Then Enter Discussion Wall for Email Template "Test"
Then click on submit for Email Template
Then User can view the conform message "Email Template Added Successfully!"
Then close browser

