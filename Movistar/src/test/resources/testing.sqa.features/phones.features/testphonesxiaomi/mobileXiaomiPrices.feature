Feature: Review on the Xiaomi module

  Brandon reviews the Xiaomi section

  @XiaomiSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Xiaomi and clicks Online Purchase botton

    Then Brandon visualize the Xiaomi price on the eShop matches with price checked on the price
    Examples:
      | name   | mainWebSite              | phoneWebSite                                  |
      | Xiaomi | https://movistar.com.co/ | https://movistar.com.co/celulares?cell=xiaomi |