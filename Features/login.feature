@sampleProject
Feature: log in on Yahoo

As a existing user
I want to put my user ID and password 
So that I can log in on my Yahoo account

Scenario: Check yahoo inbox

Given I am navigate to Yahoo home page
When I put my email ID, password, select sign in, choose Inbox
Then I can see my new and undeleted emails