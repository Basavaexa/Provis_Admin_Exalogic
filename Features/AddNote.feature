Feature: Add Notes Admin
@Admin
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://uat1.realcube.estate/"
And User enters email as "all_oaadmin@gmail.com" and password as "EX@(c&#e)93$"
And Click on login
Then Click on Notes 
Then Click on Add Note
Then Enter Title for Admin "Testing"
Then Enter Description for Admin " vsrwfdwetdfwegewgjccgdcddcdgeydyewbc bjjj"
Then Click on Add for Admin
Then User can view the confrm messag "Notes Added Successfully!"
Then close browser