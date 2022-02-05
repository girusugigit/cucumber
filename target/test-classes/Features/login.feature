Feature: To validate Login functionality of fb application

  Background: 
    Given user need to be in login page

  @smoke
  Scenario Outline: To validate login with invalid username and invalid password
    When user should enter invalid "<username>" and invalid "<password>"
    And user clicks login button
    Then user will redirect to invalid credential page

    Examples: 
      | username | password |
      | Java     | java     |
      | Greens   | greens   |
      | Selenium | selenium |

  @sanity
  Scenario: To validate login with empty username and empty password
    When user should click login button
    Then user will navigate to invalid credential page
