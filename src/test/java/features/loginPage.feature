Feature: Login functionality of open cart e commerce website
  
  As a user of the open cart website
  I want to be able to login to the website
  So that i can access my account related features and manage my orders

  Background: 
    Given User is in the open cart website page

  Scenario: Successful login with valid credentials
    Given I have entered a valid user name and password
    Then I click on the login button
    Then I should be logged in successfully
    Then logout from the cart

  #Scenario Outline: unsuccessful login with empty or invalid credentials
    #Given I have entered invalid "<user name>" and "<password>"
    #Then I click on the login button
    #Then I should see an error message indicating "<error_msg>"
#
    #Examples: 
      #| user name | password | error_msg |
#
  #Scenario: Navigating to the forgotten password page
    #When I click on the "Forgotten password" link
    #Then I should be redirected to the password reset page
