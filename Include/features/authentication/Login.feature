Feature: Login
  As I user, I want to able to signin into the sauceLab
  So that I can enjoy all features in sauceLab

  Background: 
    Given User navitages to the login page

  @login @ValidCredentials
  Scenario: Login with valid credentials
    And User enters user name
    And User enters password
    When User clicks on login button
    Then User should be redirected to the home page

  @login @InvalidCredentials
  Scenario: Login with invalid credentials
    And User enters invalid username
    And User enters invalid password
    When User clicks on login button
    Then User will be get error message invalid credentials
