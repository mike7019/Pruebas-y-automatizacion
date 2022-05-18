Feature: Review on the TCL module

  Brandon reviews the TCL section

  @XiaomiSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Realme and clicks Online Purchase botton

    Then Brandon visualize the Realme price on the eShop matches with price checked on the price
    Examples:
      | name | mainWebSite              | phoneWebSite                               |
      | Realme  | https://movistar.com.co/ | https://movistar.com.co/celulares?cell=realme |