Feature: Review on the Huawei module

  Brandon reviews the Huawei section

  @huaweiSection
  Scenario Outline: Brandon opens the website and reviews the <name> lists on the equipos tab

    Given that Brandon goes to <mainWebSite>

    When Brandon clicks on <phoneWebSite> validates the correct site, selects Huawei and clicks Online Purchase botton

    Then Brandon visualize the Huawei price on the eShop matches with price checked on the price
    Examples:
      | name    | mainWebSite              | phoneWebSite                                   |
      | Huawei | https://movistar.com.co/ | https://movistar.com.co/celulares?cell=huawei |