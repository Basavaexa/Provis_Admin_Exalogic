Feature: Document Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then Click on Document for Admin
Then Click on Upload Documents for Admin
Then Enter Document Title "Testing"
Then Enter Document Image "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Click on Expiry Date and select any date for Document
#Then Enter Description for Document "dfdvfugbr roygtryhgrtivh ztlgtyv"
Then Click on Display Type and select any option for Document
Then Click on Add Document for Admin
Then User can view the confirm message "Document added successfully!"
Then close browser
