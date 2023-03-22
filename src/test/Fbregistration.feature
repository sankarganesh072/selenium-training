Feature: To validate the account creation in FB
Scenario: To craete new account
Given To launch Browser
When To launch FB url
And To click the create new account button
And To pass the first name in first name text box
|selenium|python|java|frames|
And To pass second name in second name text box
And To pass mobile number or email in email text box
|abc@gmail.com|8220886522|inmakes@gmail.com|5411561255|
|4212421201|nbcvm@gmail.com|hdnbn@gmail.com|2532452685|
|5245257595|4724389635|ncmnxm@gmail.com|mbmb@gmail.com|
And  To create new password
Then To close the entire browser

