Feature: checking the optic fiber page

  Scenario Outline: Brandon wants to check the Tv fiber and mobile plan

    Given That Brandon access successfully to the <website>

    When Brandon goes to <fiberWebsite> lists and interacts with the present fiber plans

    Then Brandon validates the <fiberWebsite> successfully

    Examples:
      | plans | website                  | fiberWebsite                                                   |
      |  1     | https://movistar.com.co/ | https://www.movistar.com.co/hogar/planes-internet-fibra-optica |

