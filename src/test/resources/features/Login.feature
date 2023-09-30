Feature: Login Functionality

Scenario: Login with valid credentials
Given User has entered valid user id "mngr528727" into the user id field
And User has entered valid password "ezypAzY" into the password field
And User clicks on login button
Then User should successfully logged in

Scenario Outline: Login with in-valid credentials

Given User enters invalid user id <Username> into the user id field
Given User enters the invalid password <Password> into the password field
Then User should end up with warning alert on the screen

Examples:
|Username|Password|
|asdasd|asdsad|
|naveen|aasdassdsad|
|a4331|asds1212|
|asdasdasd|asdsad|
|asdasd|asdsad|
