Feature: Add Rental Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
#Then page title should be "Provis"
#And user click on close
Then click on Building Mgmt for Add Rental
Then click on Classes for Add Rental
Then Click on Add Rental
Then Enter Title Add Rental "Testing"
Then Upload Image Flyer on Add Rental "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Enter Per week fees on Add Rental "500"
Then Enter Description on Add Rental "fdgrdtgdresre ffrrftrdt ftdrdrd"
Then Enter Terms & Conditions for Add Rental "Testdata Testdata Testdata"
Then Click on Add button for Add Rental
Then User can view the conformation message "Added Successfully!"
Then close browser
