Feature: Check login fuctionality

  Scenario: 
    Given user is on login page
    When user enters valid username and password
    And Clicks on login button
    Then User is navigated to home page
