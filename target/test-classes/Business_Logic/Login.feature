Feature: Login functionality
Background: user cancelled initial login window
Given user provide browser name as "chrome" and exe location as "E:\\testing\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancel initial  login window

@SmokeTest
Scenario: login functionality with valid credentials
When user naviagte on login tab
When user click on my profile
When user enter "8999663205" as username 
When user enter "yogesh" as password
When user click on login button
Then Applicaton shows user profile to user 