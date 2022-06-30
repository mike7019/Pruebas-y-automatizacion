Feature: Review on the Alcatel module

  Brandon reviews the Alcatel section

  @honorSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Alcatel and clicks Online Purchase botton

    Then Brandon visualize the Alcatel price on the eShop matches with price checked on the price
    Examples:
      | name    | mainWebSite             | phoneWebSite                                   |
      | Alcatel | https://movistar.com.co | https://movistar.com.co/celulares?cell=alcatel |