$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AddAmenity_Admin.feature");
formatter.feature({
  "name": "Add Amenity Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Building Mgmt for Add Amenity",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Building_Mgmt_for_Add_Amenity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Amenity for Add Amenity",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Amenity_for_Add_Amenity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Amenity Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Amenity_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Amenity Name \"Vijsh\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Amenity_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter No of Minutes \"30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_No_of_Minutes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Time Interval \"10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Time_Interval(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Amenity Deposit \"500\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Amenity_Deposit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Max member per Amenity \"2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Max_member_per_Amenity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Max member per Unit \"2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Max_member_per_Unit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Start Time for Add Amenity \"13:30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Start_Time_for_Add_Amenity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter End Time for Add Amenity \"14:30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_End_Time_for_Add_Amenity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Weekdays Amount \"100\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Weekdays_Amount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Weekend Amount \"300\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Weekend_Amount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Lead Time \"30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Lead_Time(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Location Name Add Amenity \"Abu\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Location_Name_Add_Amenity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Amenity Features",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Amenity_Features()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Amenity Image \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Amenity_Image(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Description for Add Amenity \"Testing Testing Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Description_for_Add_Amenity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Terms Conditions for Add Amenity \"Test Test Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Terms_Conditions_for_Add_Amenity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save for Add Amenity",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Save_for_Add_Amenity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the conformat messag \"Added Successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_conformat_messag(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/AddClass_Admin.feature");
formatter.feature({
  "name": "Add Class Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Building Mgmt for Add class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Building_Mgmt_for_Add_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Classes for Add class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Classes_for_Add_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Class Title for Add class \"Cricket\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Class_Title_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Service Provider for Add class \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Service_Provider_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Service Provider Email for Add class \"test@yopmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Service_Provider_Email_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Website Images for Add class \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Website_Images_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Mobile Images for Add class \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Mobile_Images_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter location for Add class \"Test data\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_location_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Start Date for Add class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Start_Date_for_Add_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the date on Start Date for Add class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_the_date_on_Start_Date_for_Add_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on End Date for Add class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_End_Date_for_Add_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the date on End Date for Add class",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_the_date_on_End_Date_for_Add_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Max No of Application for Add class \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Max_No_of_Application_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Description for Add class \"Testing Testing Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Description_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Terms \u0026 Conditions for Add class \"Testdata Testdata Testdata\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Terms_Conditions_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Package Title for Add class \"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Package_Title_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Fee for Add class \"500\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Fee_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter age Range for Add class \"25\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_age_Range_for_Add_class(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confrmation mesage \"Added Successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confrmation_mesage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/AddCommunityPost_Admin.feature");
formatter.feature({
  "name": "Add Community Post Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Building Mgmt for Add Community Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Building_Mgmt_for_Add_Community_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Building chat Mgmt for Add Community Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Building_chat_Mgmt_for_Add_Community_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Community chat Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Community_chat_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Community dropdown and select community for Add Community Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Community_dropdown_and_select_community_for_Add_Community_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the title for Add Community Post \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_title_for_Add_Community_Post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Description for Add Community Post \"Testing Testing Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Description_for_Add_Community_Post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Location for Add Community Post \"Abu\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_Location_for_Add_Community_Post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the video url for Add Community Post \"https://www.youtube.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_video_url_for_Add_Community_Post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Start date and select the date for Add Community Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Start_date_and_select_the_date_for_Add_Community_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Start Time for Add Community Post \"14:30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Start_Time_for_Add_Community_Post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on End date and select the date for Add Community Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_End_date_and_select_the_date_for_Add_Community_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter End Time for Add Community Post \"16:50\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_End_Time_for_Add_Community_Post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save for Add Community Post",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Save_for_Add_Community_Post()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confrm mesage \"You have successfully added a new community post.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confrm_mesage(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[text()\u003d\u0027You have successfully added a new community post.\u0027]\"}\n  (Session info: chrome\u003d118.0.5993.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EC-PF1HVDWY\u0027, ip: \u0027192.168.198.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.15.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 118.0.5993.89, chrome: {chromedriverVersion: 118.0.5993.70 (e52f33f30b91..., userDataDir: C:\\Users\\BASAVA~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54784}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 252b0cba077b5f4d0284d9f367d2d4f7\n*** Element info: {Using\u003dxpath, value\u003d//p[text()\u003d\u0027You have successfully added a new community post.\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinations.Steps.user_can_view_the_confrm_mesage(Steps.java:778)\r\n\tat ✽.User can view the confrm mesage \"You have successfully added a new community post.\"(file:Features/AddCommunityPost_Admin.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:Features/AddEnrollManually_Admin.feature");
formatter.feature({
  "name": "Add Enroll Manually Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Building Mgmt for Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Building_Mgmt_for_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Classes for Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Classes_for_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on class drop down Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_class_drop_down_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any option under class on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_any_option_under_class_on_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "lick on User  drop down Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.lick_on_User_drop_down_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any option under User on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.select_any_option_under_User_on_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Select Your Package on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Select_Your_Package_on_Add_Enroll_Manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Select Your Schedule on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Select_Your_Schedule_on_Add_Enroll_Manually()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\u0027 Sunday 08 Oct 2023 \u0027]\"}\n  (Session info: chrome\u003d118.0.5993.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EC-PF1HVDWY\u0027, ip: \u0027192.168.198.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.15.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 118.0.5993.89, chrome: {chromedriverVersion: 118.0.5993.70 (e52f33f30b91..., userDataDir: C:\\Users\\BASAVA~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54842}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 285ae77ddcc9622ddd5f29ebda5cb91d\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\u0027 Sunday 08 Oct 2023 \u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat PageObjects.AddEnrollManually_POM_ADMIN.clickSelectYourSchedule_E(AddEnrollManually_POM_ADMIN.java:176)\r\n\tat StepDefinations.Steps.click_on_Select_Your_Schedule_on_Add_Enroll_Manually(Steps.java:479)\r\n\tat ✽.click on Select Your Schedule on Add Enroll Manually(file:Features/AddEnrollManually_Admin.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on unit number and select the any one option on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_unit_number_and_select_the_any_one_option_on_Add_Enroll_Manually()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Applicant Name on Add Enroll Manually \"Akash\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Applicant_Name_on_Add_Enroll_Manually(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Applicant Age on Add Enroll Manually \"25\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Applicant_Age_on_Add_Enroll_Manually(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Add Enrollment on Add Enroll Manually",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Enrollment_on_Add_Enroll_Manually()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see the conformtion messag \"Enrollment added\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_conformtion_messag(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:Features/AddNote.feature");
formatter.feature({
  "name": "Add Notes Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Notes",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Notes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Note",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Note()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Title for Admin \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Title_for_Admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Description for Admin \" vsrwfdwetdfwegewgjccgdcddcdgeydyewbc bjjj\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Description_for_Admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add for Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_for_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confrm messag \"Notes Added Successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confrm_messag(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/AddRental_ADMIN.feature");
formatter.feature({
  "name": "Add Rental Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Building Mgmt for Add Rental",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Building_Mgmt_for_Add_Rental()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Classes for Add Rental",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Classes_for_Add_Rental()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Rental",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Rental()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Title Add Rental \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Title_Add_Rental(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload Image Flyer on Add Rental \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_Image_Flyer_on_Add_Rental(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Per week fees on Add Rental \"500\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Per_week_fees_on_Add_Rental(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Description on Add Rental \"fdgrdtgdresre ffrrftrdt ftdrdrd\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Description_on_Add_Rental(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Terms \u0026 Conditions for Add Rental \"Testdata Testdata Testdata\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Terms_Conditions_for_Add_Rental(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button for Add Rental",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_button_for_Add_Rental()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the conformation message \"Added Successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_conformation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Banner_ADMIN.feature");
formatter.feature({
  "name": "Banner Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Banner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add Banner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Banner Name \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Banner_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Banner Url \"https://www.youtube.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Banner_Url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload the image for Banner \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.upload_the_image_for_Banner(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Expiry Date and select any date for Banner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Expiry_Date_and_select_any_date_for_Banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Priority for Banner \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Priority_for_Banner(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Expiry date should be greater than Start date}\n  (Session info: chrome\u003d118.0.5993.89): Expiry date should be greater than Start date\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EC-PF1HVDWY\u0027, ip: \u0027192.168.198.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.15.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 118.0.5993.89, chrome: {chromedriverVersion: 118.0.5993.70 (e52f33f30b91..., userDataDir: C:\\Users\\BASAVA~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54967}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: a28fd0d4850c1325647f1339e00fab81\n*** Element info: {Using\u003did, value\u003dbanner_priority}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat PageObjects.Banner_POM_ADMIN.setBannerPriority(Banner_POM_ADMIN.java:130)\r\n\tat StepDefinations.Steps.enter_Priority_for_Banner(Steps.java:1043)\r\n\tat ✽.Enter Priority for Banner \"1\"(file:Features/Banner_ADMIN.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Add for Banner",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_for_Banner()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view the confrm message \"Banner added successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confrm_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:Features/Document_Admin.feature");
formatter.feature({
  "name": "Document Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Document for Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Document_for_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Upload Documents for Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Upload_Documents_for_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Document Title \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Document_Title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Document Image \"C:\\Users\\Basavaraj\\OneDrive - Exalogic Consulting\\Documents\\Lightshot\\\\Screenshot_1.png\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Document_Image(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Expiry Date and select any date for Document",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Expiry_Date_and_select_any_date_for_Document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Display Type and select any option for Document",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Display_Type_and_select_any_option_for_Document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Document for Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Document_for_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the confirm message \"Document added successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_confirm_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/EmailTemplate.feature");
formatter.feature({
  "name": "Email Template Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Template",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Email Template",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Email_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Email Template",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_Email_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Template Name \"Testing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Template_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Subject for Template \"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Subject_for_Template(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email Message for Template \"hvhsdchdshv\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Email_Message_for_Template(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter SMS Message for Template \"hcdvdgdvdgdvd\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_SMS_Message_for_Template(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Notification Message for Template \"dtgfvfdgfvdhgvfef\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Notification_Message_for_Template(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click category drop down and select any one option for Email template",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_category_drop_down_and_select_any_one_option_for_Email_template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Discussion Wall for Email Template \"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Discussion_Wall_for_Email_Template(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit for Email Template",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_submit_for_Email_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the conform message \"Email Template Added Successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_conform_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/FAQ_Admin.feature");
formatter.feature({
  "name": "FAQ Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on FAQ",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_FAQ()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on faq for admin",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_faq_for_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add FAQ for Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Add_FAQ_for_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Question for Faq \"How are you\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Question_for_Faq(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Answer for Faq \"fine\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Answer_for_Faq(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save for Faq",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Save_for_Faq()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the conform messag \"FAQ Added Successfully!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_see_the_conform_messag(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Provis.feature");
formatter.feature({
  "name": "Login to Provis ",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://uat1.realcube.estate/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"all_oaadmin@gmail.com\" and password as \"EX@(c\u0026#e)93$\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});