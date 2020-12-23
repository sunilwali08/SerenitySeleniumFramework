Feature: Finding New cars
  As a user I want to find new cars

  Background: 
    

  Scenario Outline: User finding a new car
  	Given user navigate to Website 
    When user User navigates to new car menu
    Then user click on Find New Car
    And User select the <brand> car
    And user validate the car title

    Examples: 
      | brand   |
      | Maruti  |
 			| Hyundai |
  		| Honda		|
