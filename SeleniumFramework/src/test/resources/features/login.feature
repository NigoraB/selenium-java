Feature: This will test the login feature of the website https://phptravels.net/
  As a user of the PHP Travels website
  I want to be able to login with my account
  so that I I can search, book, and manage my bookings

  Background:
    Given I am on the PHPTravels login page

  Scenario: Successful login with valid credentials
    When I provide the valid login credentials
    And I click on Login button
    Then I should be logged in successfully

  Scenario Outline: Unsuccessful Login
    When I provide an invalid "<username>" and "<password>"
    And I click on Login button
    Then I should be logged in unsuccessfully
    Examples:
      | username               | password       |
      | invalidemail@gmail.com | invalidPassword|
      | reyeston22@gmail.com   | invalidPassword|
      | invalidemail@gmail.com | Passw0rd.3     |

