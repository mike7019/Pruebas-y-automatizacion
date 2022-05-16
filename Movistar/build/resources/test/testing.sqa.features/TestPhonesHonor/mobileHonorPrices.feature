Feature: Review on the Iphone module

  Brandon reviews the Iphone section

  @iphoneSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <website> and choose Iphone and validates each prices

    When Brandon clicks on Online Purchase botton and goes to the eShop page

    Then Brandon visualize the price on the eShop matches with price checked on the <website>
    Examples:
      | name  | website                           |
      | iphone | https://movistar.com.co/celulares |