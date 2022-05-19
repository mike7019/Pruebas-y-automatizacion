Feature: Research on the pospago plans page

  Brandon wants to search on the website
  to review the prices of the phones

  Scenario Outline: Brandon opens the website and reviews the pospago plans on the tab

    Given that Brandon opens the website <website> and lists the available plans

    When Brandon goes into planes postpago and chooses portabilidad postpago and chooses the <case> GB plan

    Then Brandon visualizes the prices on the eShop as shows on the main page <website> and sees the <case> GB plan
    Examples:
      | case | website                                                                                                                                                                                  |
      | 25   | https://www.movistar.com.co/pospago?tab=portabilidad+&utm_source=pospago&utm_medium=landing&utm_campaign=portabilidad_movistar&_ga=2.175364842.991541161.1651499786-391698342.1649861260 |
      | 50   | https://www.movistar.com.co/pospago?tab=portabilidad+&utm_source=pospago&utm_medium=landing&utm_campaign=portabilidad_movistar&_ga=2.175364842.991541161.1651499786-391698342.1649861260 |
      | 80   | https://www.movistar.com.co/pospago?tab=portabilidad+&utm_source=pospago&utm_medium=landing&utm_campaign=portabilidad_movistar&_ga=2.175364842.991541161.1651499786-391698342.1649861260 |