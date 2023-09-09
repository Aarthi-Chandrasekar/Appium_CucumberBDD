Feature: Testing General Store App
  @Android_NativeApp
  Scenario Outline: Open the app and check the title
    Given the app is opened
    When User logs in with username "<username>" and country "<country>" and select gender "<gender>"
    Then User is able to login successfully and lands on Products page
    When User selects item "<item>" to add to the cart
    Then the item is added to the cart successfully
   Examples:
         | username| country | gender|item|
         | Aarthi | India | female |1|