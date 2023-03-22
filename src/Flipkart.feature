Feature: To validate the login functionality of flipkart application
Scenario: To search the product
Given To launch the chrome browser and maximize window
When To launch url of flipkart apllication
And To pass the product name in search field'
And to click the login button
Then To close the browser

Scenario Outline: To validate positive and negative login functionality
Given User has to launch the window and maximize
When User has to hit the facebook url
And User has to pass the data in "<emaildatas>"email field
And User has to pass the data in"<passworddatas>" password field
And user has to click login button
Then User has to close the browser    	   

Examples:
|emaildatas||passworddatas|
|seleniuminmakes@gmail.com||Inmakes|
|abc@gmail.com||12345|
|inmakes@gmail.com||selenium|
|frameworks@gmail.com||cucumber|