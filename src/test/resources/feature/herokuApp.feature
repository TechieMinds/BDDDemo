# Feature, Scenario, Given, When, Then, And, But, Scenario Outline, Examples, Background, data table
# Cucumber - Testng
# Feature - Suite
# Scenario - TestCase
# Scenario outline, example - Data provider, test
# steps, given, when, then, and, but
#
@Ramana
Feature: HerokuApp

  Scenario: Validating the Dynamic Loading Link in HerokuApp Page
    Given I have to navigate to "The Internet HerokuApp"
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Dynamic Loading" link
    Then I have to see the "Dynamically Loaded Page Elements" heading on the page
    When I click on the "Example 1: Element on page that is hidden" link
    Then I have to see the "Example 1: Element on page that is hidden" header
    When I click on the Start button
    Then I have to see the "Hello World!" text displayed.

  Scenario: Validating the Disappearing Elements Link in HerokuApp Page
    Given I have to navigate to "The Internet HerokuApp"
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Disappearing Elements" link
    Then I have to see the "Disappearing Elements" heading on the page
    When I click on the "Home" button
    Then I have to see "Available Examples" header on the page
    When I click on the "Disappearing Elements" link again
    Then I have to see the "Disappearing Elements" heading on the page again
    When I click on "About" button
    Then I have to see the "Not Found" header displayed.

  Scenario: Validating the Form Authentication Link in HerokuApp Page
    Given I have to navigate to "The Internet HerokuApp"
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Form Authentication" link
    Then I have to see the "Login Page" heading on the page
    When I enter userName in the "Username" textfield
    Then I have to print the userName entered
    When I enter password in the "Password" text field
    Then I have to print the password entered
    When I click on "Login" button
    Then I have to see the "Secure Area" header displayed.
    When I click on "Logout" button
    Then I have to see "You logged out of the secure area!" message displayed

  Scenario: Validating the Forgot Password Link in HerokuApp Page
    Given I have to navigate to "The Internet HerokuApp"
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Forgot Password" link
    Then I have to see the "Forgot Password" heading on the page
    When I enter the "Ramanareddy3107"email id into the E-mail text box
    Then I should get the email entered in the text box to verify it whether entered correctly or not.
    When I click on the "Retrieve Password Button" button
    Then I have to see the "Internal Server Error" heading on the page again
