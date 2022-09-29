Feature: ParaBank Update Contact Test

Scenario: ParaBank Update Contact Test

Given user is already on Login Page
When title of login page is
Then user enters username and password
| username | password |
| shivam | shivam |
Then user click on SignIn
Then user is on HomePage
Then user goes in UpdateContact Page
Then user update profile details
| fname | lname | address | city | state | zip | phone |
| Steve | Maven | Murry St | Niagara | ON | L2g2g5 | 9824455334 |
Then logout and close browser