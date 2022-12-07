Feature: Product Search Functionality

  Scenario: Delete Products

    Given Navigate to Upayments
    When Send on the element in the Body Content
      | emailInput    | htest@emailaddress.com |
      | passwordInput | 123456                 |
    Then Click on the element in the Body Content
      | loginButton |
    And Click on the element in the Left Nav Content
      | storeLeftNav              |
      | productsUnderStoreLeftNav |
    Then Search and press enter
      | productNameInput | Empty Box |
    And Verify search results
      | searchResults | Empty Box |
    Then Click Delete Button in the Body Content
      | deleteButton |
    And Click on the element in the Dialog Content
    | okButton |
    Then Success message should be displayed
      | successMessage | success |
    And logout



