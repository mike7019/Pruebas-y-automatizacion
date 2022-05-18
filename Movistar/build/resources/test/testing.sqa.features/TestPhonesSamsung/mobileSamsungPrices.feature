Feature: Review on the Samsung module

  Brandon reviews the Samsung section

  @samsungSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Samsung and clicks Online Purchase botton

    Then Brandon visualize the Samsung price on the eShop matches with price checked on the price
    Examples:
      | name     | mainWebSite              | phoneWebSite                                   |
      | motorola | https://movistar.com.co/ | https://movistar.com.co/celulares?cell=samsung |