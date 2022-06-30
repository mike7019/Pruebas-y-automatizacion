Feature: Review on the Honor module

  Brandon reviews the Honor section

  @honorSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Honor and clicks Online Purchase botton

    Then Brandon visualize the Honor price on the eShop matches with price checked on the price
    Examples:
      | name  | mainWebSite             | phoneWebSite                                 |
      | Honor | https://movistar.com.co | https://movistar.com.co/celulares?cell=honor |