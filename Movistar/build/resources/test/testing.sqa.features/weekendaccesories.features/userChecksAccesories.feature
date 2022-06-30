Feature: Brandon wants to check the huawei accesories

  Scenario Outline: Brandon checks the prices on the Huawei accesories

    Given That Brandon goes to the <webSite> and reviews all the accesories

    When Brandon lists all the accesories and compares them with the data provided

    Then Brandon validates all the prices were successfully updated
    Examples:
      | webSite                                                                      |
      | https://movistar.com.co/accesorios?cell=accesorios-huawei                    |
      | https://descubre.movistar.co/oferta-madres-celulares/?cell=accesorios-huawei |
