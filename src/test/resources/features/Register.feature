Feature: Add new customer feature

Scenario: Add new customer
Given User has entered valid user id "mngr528727" and password "ezypAzY"
Then User clicks on new customer link
And User enters the customer details into the below field
|Customer name | naveen |
|Address | chennai |
|City | Chennai |
|State | Tamil nadu |
|Pin | 600024 |
|Mobile Number | 9898989898 |
|E-mail | Test@gmail.com |
|Password | test123 |
Then User clicks on submit button
 