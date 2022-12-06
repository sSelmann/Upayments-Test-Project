Feature: Products Add Functionality

  Scenario: Add Products

    Given Navigate to Upayments
    When Send on the element in the Body Content
      | emailInput    | htest@emailaddress.com |
      | passwordInput | 123456                 |
    Then Click on the element in the Body Content
      | loginButton |
    Then Click on the element in the Left Nav Content
      | storeLeftNav              |
      | productsUnderStoreLeftNav |
    And Click on the element in the Body Content
      | addProductButton |
    Then Upload product image
      | uploadImageButton | C:\Users\yusuf\Desktop\box.png |
    And Send on the element in the Body Content
      | productNameEN | Empty Box  |
      | productNameAR | صندوق فارغ |
    Then Send on the element in the Frame
      | productDesc | this is a empty box | 0 |
      | productDesc | هذا هو مربع فارغ    | 1 |
    And Select on the element in the Body Content
      | selectCountryOrigin | AU |
    Then Send on the element in the Body Content
      | sku | 111 |
    And Select on the element in the Body Content
      | weightType | gram       |
      | lengthType | millimeter |
    Then Send on the element in the Body Content
      | weightValue | 1                   |
      | lengthValue | 222                 |
      | widthValue  | 222                 |
      | heightValue | 400                 |
      | videoUrl    | https://youtube.com |
    And Select on the element in the Body Content
      | selectProductCategory | 215762 |
    Then Send on the element in the Body Content
      | productPrice       | 100     |
      | itemCode           | 1232321 |
      | productQuantity    | 25000   |
      | dailyQuantityLimit | 1000    |
    And Click on the element in the Body Content
      | productSumbitButton |
    Then Success message should be displayed
      | successMessage | success |


