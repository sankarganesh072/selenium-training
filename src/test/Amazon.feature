Feature: To validate the login functionality of amazon application
Scenario: To validate the sign in by passing valid email and invalid password
Given To launch the browser and maximize window
When To launch the url of the amazon signin page
And To pass the valid email or mobileno in email field
|sankar|8220886588|ganesh|rakesh|
And To click the continue button
And To pass the invalid password in password field
|sankar|rakesh|ganesh|akshan|
|hockey|football|cricket|tennis|
And To click the sign in button
Then To close browser 

