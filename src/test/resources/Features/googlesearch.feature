Feature: feature to test google fuctionality

  Scenario: Validate google search is working
    Given user is on google search page
    When user enter the text in the search box
    Then user is able to see search results
