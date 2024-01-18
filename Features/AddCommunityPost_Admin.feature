Feature: Add Community Post Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then click on Building Mgmt for Add Community Post 
Then click on Building chat Mgmt for Add Community Post 
Then Click on Add Community chat Post
Then click on Community dropdown and select community for Add Community Post
Then Enter the title for Add Community Post "Testing"
Then Enter the Description for Add Community Post "Testing Testing Testing"
Then Enter the Location for Add Community Post "Abu"
Then Enter the video url for Add Community Post "https://www.youtube.com/"
#Then upload Upload Image or PDF for Add Community Post "C:\Users\SuvenduB\Downloads\\ict.png"
Then Click on Start date and select the date for Add Community Post
Then Enter Start Time for Add Community Post "14:30"
Then Click on End date and select the date for Add Community Post
Then Enter End Time for Add Community Post "16:50"
Then Click on Save for Add Community Post
Then User can view the confrm mesage "You have successfully added a new community post."
Then close browser