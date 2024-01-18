Feature: Add Amenity Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then click on Building Mgmt for Add Amenity 
Then click on Amenity for Add Amenity 
Then Click on Add Amenity Manually
Then Enter Amenity Name "Vijsh"
Then Enter No of Minutes "30"
Then Enter Time Interval "10"
Then Enter Amenity Deposit "500"
Then Enter Max member per Amenity "2"
Then Enter Max member per Unit "2"
Then Enter Start Time for Add Amenity "13:30"
Then Enter End Time for Add Amenity "14:30"
Then Enter Weekdays Amount "100"
Then Enter Weekend Amount "300"
Then Enter Lead Time "30"
Then Enter Location Name Add Amenity "Abu"
Then Click on Amenity Features
Then Upload Amenity Image "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Enter Description for Add Amenity "Testing Testing Testing"
Then Enter Terms Conditions for Add Amenity "Test Test Test"
Then click on Save for Add Amenity
Then User can see the conformat messag "Added Successfully!"
Then close browser

