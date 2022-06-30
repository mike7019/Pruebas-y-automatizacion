Feature: Review on the TCL module

  Brandon reviews the TCL section

  @TCLSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects TCL and clicks Online Purchase botton

    Then Brandon visualize the TCL price on the eShop matches with price checked on the price
    Examples:
      | name | mainWebSite             | phoneWebSite                               |
      | TCL  | https://movistar.com.co | https://movistar.com.co/celulares?cell=tcl |