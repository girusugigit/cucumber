Feature: To validate search functionality of amazon application

  @sanity
  Scenario: To check the product page using search functionality
    Given user need to be in amazon home page
    When user should enter product name
      | Product | New product |
      | iphone  | mac laptop  |
    And user should click search button
    Then user will navigate to products page
