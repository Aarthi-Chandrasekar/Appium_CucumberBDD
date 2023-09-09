Feature: Login and add items to cart on SauceDemo

  @Android_Web_ChromeBrowser
  Scenario Outline: User is able to add items to cart after successful login
    Given User is on the SauceDemo login page
    When User logs in with username "<username>" and password "<password>"
    Then User is able to login successfully
    And User adds an item to the cart
    Then The item is added to the cart successfully

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
