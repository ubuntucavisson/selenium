Feature: Feature to test google search functionality

	
  Scenario Outline: Check google search is successfull
    Given browser is open
    When user enters <text> in search textbox
    And user hits enter
    Then user is navigated to search results page
    
    Examples: 
    |text|
    |parameter|
    |Selenium|