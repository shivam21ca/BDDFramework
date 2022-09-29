Feature: Parabank Login

Scenario Outline: Parabank Login BillPay test

Given user is already on Login Page
When title of login page is
Then user enters "<username>" and "<password>"
Then user click on SignIn
Then user is on HomePage
Then user moves to BillPay
Then enter bill details "<payee>" and "<address>" and "<city>" and "<state>" and "<zip>" and "<phone>" and "<accno>" and "<verifyacc>" and "<amt>"
Then find transaction done by "<amt>"
Then logout and close browser


Examples:
| username | password | payee | address | city | state | zip | phone | accno | verifyacc | amt|
| shivam | shivam | Steve | Marpin St | Hamilton | ON | l2g2k8 | 291777149 | 885566 | 885566 | 2000 |
| shivam | shivam | Lisa | Queen St | Calgary | AB | l2h0p3 | 4512354545 | 815588 | 815588 | 4000 |