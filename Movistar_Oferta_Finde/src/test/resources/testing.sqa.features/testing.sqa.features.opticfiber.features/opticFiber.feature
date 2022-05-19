Feature: checking the optic fiber page

  Scenario Outline: Brandon wants to check the Tv fiber and mobile plan

    Given That Brandon access successfully to the <website>

    When Brandon goes to <fiberWebsite> and lists te fiber plans


    Then Brandon validates the <fiberWebsite> successfully

    Examples:
      | website                  | fiberWebsite                                                   |
      | https://movistar.com.co/ | https://www.movistar.com.co/hogar/planes-internet-fibra-optica |

