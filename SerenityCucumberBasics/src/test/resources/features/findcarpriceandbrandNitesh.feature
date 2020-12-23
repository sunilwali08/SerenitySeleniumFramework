Feature: Finding New car price and brand name(New Feature)
  As a user I want to search New car price and brand name

  Background: 
    Given user navigate to the website

  Scenario Outline: User finding car price and brand names
    When user choose menu as new cars
    Then user clicks on find new cars

    And user search for <brand> car
    And user find a new car and price

    Examples: 
      | brand   |
      | Kia     |
      | Toyota  |
      | Hyundai |
      | Honda   |
