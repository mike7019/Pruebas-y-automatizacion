Feature: Review on the Motorola module

  Brandon reviews the Motorola section

  @motorolaSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Motorola and clicks Online Purchase botton

    Then Brandon visualize the Motorola price on the eShop matches with price checked on the price
    Examples:
      | name     | mainWebSite             | phoneWebSite                                    |
      | motorola | https://movistar.com.co | https://movistar.com.co/celulares?cell=motorola |