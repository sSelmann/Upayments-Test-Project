Feature: Product Search Functionality

  Scenario: Search Products

    Given Navigate to Upayments
    When Send on the element in the Body Content
      | emailInput    | htest@emailaddress.com |
      | passwordInput | 123456                 |
    Then Click on the element in the Body Content
      | loginButton |
    Then Click on the element in the Left Nav Content
      | storeLeftNav              |
      | productsUnderStoreLeftNav |
    Then Search and press enter
    | productNameInput | Empty Box |
    Then Verify search results
    | searchResults | Empty Box |
    And logout



