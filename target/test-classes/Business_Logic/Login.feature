Feature: Login functionality
Background: user cancelled initial login window
Given user provide browser name as "chrome" and exe location as "E:\\testing\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancel initial  login window

@SmokeTest
Scenario: login functionality with invalid credentials
When user naviagte on login tab
When user click on my profile
When user enter <username> as username 
When user enter <passworld> as password
When user click on login button
Then Applicaton shows appropriate error msg