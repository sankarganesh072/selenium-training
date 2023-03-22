Feature: To validate the login functionality of icici bank
Scenario: To validate the login using invalid username and invalid password
Given To launch the browser and maximize the window
When To launch the url of icici login page
And To pass the invalid username in userid field
And to pass the invalid password in password field
And To click the login button
Then To close browser

Scenario Outline: To validate the search functionality of myntra 
Given To launch the browser and maximize the window
When To launch the url of myntra
And To click the search box
And To pass the product name in search box
And to press the enter key

