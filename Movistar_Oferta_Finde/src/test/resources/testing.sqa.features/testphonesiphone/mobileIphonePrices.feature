Feature: Review on the Iphone module

  Brandon reviews the Iphone section

  @iphoneSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site and clicks Online Purchase botton

    Then Brandon visualize the price on the eShop matches with price checked on the price
    Examples:
      | name   | mainWebSite              | phoneWebSite                      |
      | iphone | https://movistar.com.co/ | https://movistar.com.co/celulares |