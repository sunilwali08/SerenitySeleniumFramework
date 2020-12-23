Feature: Finding Car price and brand names
  As a user I want to find new cars price and brand names
  
  Background:
  Given user navigate to the website

  Scenario Outline: User finding Car price and Brand names
    
    When user choose menu as new cars
    Then user clicks on find new cars
    |price|
    |2000 |
    |5000 |
    And user search for <brand> car
    And user find car name and price

    Examples: 
      | brand   |
      | Kia     |
      | Toyota  |
      | Hyundai |
      | Honda   |