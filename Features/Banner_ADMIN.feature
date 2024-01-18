Feature: Banner Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then Click on Banner
Then click on Add Banner
Then Enter Banner Name "Testing"
Then Enter Banner Url "https://www.youtube.com/"
Then Upload the image for Banner "C:\Users\Basavaraj\OneDrive - Exalogic Consulting\Documents\Lightshot\\Screenshot_1.png"
Then Click on Expiry Date and select any date for Banner  
Then Enter Priority for Banner "1"
Then Click on Add for Banner
Then User can view the confrm message "Banner added successfully!"
Then close browser