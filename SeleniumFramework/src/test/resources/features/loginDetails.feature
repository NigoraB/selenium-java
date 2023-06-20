Feature: This will test the page where the user can get a trial login credentials for 20 days

  Background:
    Given User is on the get login details page

  Scenario: User successfully gets the login details
    When The user provides a valid email id
    And The user submits a request
    Then The temporary login details are shown

  Scenario Outline: User unsuccessfully gets the login details
    When The user provides an invalid "<email_id>"
    Then An "<error_message>" is displayed
    Examples:
      | email_id     | error_message             |
      | invalidEmail | Email ID is not valid     |
      |              | Email ID must not be blank|

