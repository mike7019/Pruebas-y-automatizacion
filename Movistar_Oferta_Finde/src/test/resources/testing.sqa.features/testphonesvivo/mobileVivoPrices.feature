Feature: Review on the Vivo module

  Brandon reviews the Vivo section

  @vivoSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Vivo and clicks Online Purchase botton

    Then Brandon visualize the Vivo price on the eShop matches with price checked on the price
    Examples:
      | name | mainWebSite              | phoneWebSite                                |
      | vivo | https://movistar.com.co/ | https://movistar.com.co/celulares?cell=vivo |