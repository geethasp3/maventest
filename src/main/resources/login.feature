@Smoke
Feature: Login


  Scenario: test the application with valid rights
    Given go to the applcation
    And users logs in to the application
    Then user would be successful

  Scenario: test the application with invalid rights
    Given go to the applcation
    And users logs in to the application
    Then user would not be successful

  Scenario Outline: succesful login with valid entries
    Given website for login
    And users gets navigated to the website
    Then user must login to the website
