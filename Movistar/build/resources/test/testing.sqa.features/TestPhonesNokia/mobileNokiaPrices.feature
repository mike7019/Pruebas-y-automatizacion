Feature: Review on the Nokia module

  Brandon reviews the Nokia section

  @nokiaSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Nokia and clicks Online Purchase botton

    Then Brandon visualize the Nokia price on the eShop matches with price checked on the price
    Examples:
      | name   | mainWebSite              | phoneWebSite                                  |
      | Nokia | https://movistar.com.co/ | https://movistar.com.co/celulares?cell=Nokia |