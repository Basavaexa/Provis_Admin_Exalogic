Feature: FAQ Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then click on FAQ
Then Click on faq for admin
Then click on Add FAQ for Admin
Then Enter Question for Faq "How are you"
Then Enter Answer for Faq "fine"
#Then Click on Status for Faq
Then Click on Save for Faq
Then User can see the conform messag "FAQ Added Successfully!"
Then close browser