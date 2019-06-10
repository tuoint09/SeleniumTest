
Feature: Login to system
  In order to do something
  As an user
  I would like to login to system

Scenario: Login system with incorrect data
    Given I am on home page
    When I input my account is "nguyentuoi9x1@gmail.com"
    And I input my password is "abcde12"
    And I click submit button
    Then I should see a alert message is "Authentication failed"

  