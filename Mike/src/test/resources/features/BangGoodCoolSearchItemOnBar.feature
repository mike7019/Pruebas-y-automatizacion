Feature: Purchase an item on the search bar

  @SmokeTest
  Scenario Outline:  Searching and purchasing by SearchBar

    Given That Brandon opens the app BangGood

    When  Brandon selects inflating bump item

    Then He sees the <items> word after choosing the element

    Examples:
      | items |
      | Hot   |