Feature: ParaBank Contact Test

Scenario: ParaBank Contact Test

Given user is already on Login Page
When title of login page is
Then user enters username and password
| shivam | shivam |
Then user click on SignIn
Then user is on HomePage
Then user move to contactpage
Then user enter name email phone message
| Steve | rSteve@gmail.com | 1232424144 | This is testing message |
Then logout and close browser