Feature: login functionality


@All@a
Scenario: Varify login page is displayed with valid user
Given  Launch "<URL>"
Then Click on Log in
Then Type valid username and password
Then Click log in button.                                  
Then Varify Login Pageis displayed with valid user 

@All@b
Scenario: Varify user is unable to login
Given Launch "<URL>"                                          
Then Click on log in
Then Type invalid username and valid password                                                         
Then Click log in button               
Then Verify user is unable to login
