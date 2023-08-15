Feature: Login User

  @smoke
  Scenario Outline: Enter the website and shopping products
    Given the user wishes to buy product
    When the user enters yours credentials <email>
    Then he must display your buy in the shopping car
    Examples:
      | email               |
      | test53324@gmail.com |