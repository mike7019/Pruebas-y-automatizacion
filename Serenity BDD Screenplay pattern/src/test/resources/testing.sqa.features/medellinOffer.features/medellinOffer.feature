Feature: Research on the exclusive offer for medellin

  Brandon wants to review the duo plans

  Scenario Outline: Brandon opens the website and reviews the fiber and tv apps

    Given that Brandon opens the site <site> and opens the duo plans

    When Brandon chooses the <plan> and stares the price

    Then Brandon choose each <plan> and select tvApps like <netflix> <primevideo> and <disney&Star>
    Examples:
      | plan | site                                                           | netflix | primevideo | disney&Star |
      | 0    | https://descubre.movistar.co/ofertas/fibra-exclusiva-medellin/ | 0       | 1          | 4           |
      | 1    | https://descubre.movistar.co/ofertas/fibra-exclusiva-medellin/ | 0       | 1          | 4           |
      | 2    | https://descubre.movistar.co/ofertas/fibra-exclusiva-medellin/ | 0       | 1          | 4           |
      | 3    | https://descubre.movistar.co/ofertas/fibra-exclusiva-medellin/ | 0       | 1          | 4           |