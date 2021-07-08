Feature: Feature to test login

	@smokeTest
  Scenario: check login is successful with valid cred
    Given user is on login page
    When user enters username and passwd
    And clicks on login button
    Then user is navigated to the home page
