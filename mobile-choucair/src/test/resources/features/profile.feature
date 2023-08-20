Feature: Add item to cart

  Scenario Outline: Add an item to cart
    Given The user into the app without credentials
    When The user enters the following data in the application
      | Product   | Address   | Email   |
      | <product> | <address> | <email> |
    Then The user views the product in the shopping cart
    Examples:
      | product | address           | email                |
      | Neveras | Calle 26 Sur # 43 | juanse98672@test.com |