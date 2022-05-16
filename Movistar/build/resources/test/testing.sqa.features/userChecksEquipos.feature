Feature: Research on the Equipos page

  Brandon wants to search on the website
  to review the prices of the phones

  Scenario Outline: Brandon opens the website and reviews the phone lists on the equipos tab

    Given that Brandon opens the website <mainWebSite> and lists phones availables for each manufacturer

    When Brandon goes into <phoneWebSite> and chooses the iphone section

    Then Brandon visualizes the prices on the eShop the prices previosly checked on the <>
    Examples:
      | trademark | phoneWebSite                      | mainWebSite              |
      | iphone    | https://movistar.com.co/celulares | https://movistar.com.co/ |