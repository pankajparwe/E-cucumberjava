Feature: Test login fuctionality

  Scenario Outline: Check login successful with valid credentials
    Given Browser is open
    And User is on login page
    When use enters <username> and <password>
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Pankaj   |    12345 |
