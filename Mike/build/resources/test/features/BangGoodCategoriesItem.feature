Feature: Purchase a categorize item

  @SmokeTest
  Scenario Outline:  Category and purchasing

    Given That Brandon opens the app BangGood categories

    When  Brandon selects a category and goes to electric saw to purchase

    Then  Validates the <items> on the cart list

    Examples:
      | items |
      | Hot   |
