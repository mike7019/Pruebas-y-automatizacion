#language en

Feature: Reviwing the IVA off day

  Scenario Outline: Brandon wants to review the prices without IVA

    Given That Brandon visit the <site>
    When Brandon clicks on the link and sees the price on the site
    Then Validates that the price matches with the data provided

    Examples:
      | site                                                                                                                          |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1eaHCWO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PbsUuKu#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PbQ71KS#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4WCk0JM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PavjwPY#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PldO6WO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PmFhx56#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PmkeEG8#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rlYpwDrvIO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84Pa4NLxQ#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PZcH452#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1c7qbfk#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy6c6J7I#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy2qUR4C#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000o9dYf7sOOm#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rlXVoDyLmS#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rlYoUgHBKa#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PcM1Brc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84Pcpp4WO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PYR2YWO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PZGPx44#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rlXIGmzwfI#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rlXui2pcK8#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rlZ3eGoWBc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy5Z6AKW#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy661dQ0#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBTPXbp9Ie#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4WnMG5g#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4ViMvOS#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy50khai#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PeshlfE#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PdhkrEe#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PogiYHQ#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PoGbSJU#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PnnvyAy#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy3NhVHk#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridy4Ug1tQ#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PgK7PdY#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1bWNYVE#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1fFR2Nk#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJudazeO3M#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PnFs6ZE#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84PfMnFS4#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000p84Phy1PKi#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJudbUsGMS#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1Y4M0Qa#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1ZKhIKO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000o9dYfaGHPE#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBTPYOvkno#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1gNGMNc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxihozsO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfi9v4Ua#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1YlDR4K#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000f2osk4ZSqG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000f2osk4ZSqG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000f2osk4ZSqG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000as96etWZ8K#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000as96etWZ8K#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000as96etWZ8K#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfdl8YUa#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rjCVZWBn4y#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rjCVZWBn4y#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rjCVZWBn4y#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfZbgNW4#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfYHMhnM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfYHMhnM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr4c4qJM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr4c4qJM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr3kQejA#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr3kQejA#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxygT3pY#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxygT3pY#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr7O5l8S#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr7O5l8S#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfdl8YUa#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfdl8YUa#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNqz6szxo#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr6RcOLA#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr6RcOLA#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr8BTxlg#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr8BTxlg#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr5WqcKG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr5WqcKG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr5WqcKG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr0wQXzc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBNr0wQXzc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuGR7kuhM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuGR7kuhM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuGSLXoQa#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuRsmvHto#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuRtnede4#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuRtnede4#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuRtnede4#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuRv0ajz6#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBTPZVL59M#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBTPZVL59M#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rjEV6DcGCu#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000rjEV6DcGCu#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxjUMP7Q#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxjUMP7Q#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuM9h1AJs#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfZbgNW4#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuGPqYpPM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxmfM1OC#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxkjZIUy#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBQfbUuiEi#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBTPaOgrVw#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBTPaOgrVw#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1gvtQFU#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1gvtQFU#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxsD6FuK#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxsD6FuK#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxr5GvuS#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1W4JIaO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1W4JIaO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1VDVuOO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1VDVuOO#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4UEgUNc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4UEgUNc#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuXjluGav#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJuXjluGav#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxvy8vhI#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxvy8vhI#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxvy8vhI#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000okQIHFbn8a#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000okQIHFbn8a#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4PnLaD2#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4PnLaD2#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4PnLaD2#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4PnLaD2#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4R2GsSW#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4R2GsSW#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4R2GsSW#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000oBS4SCeacy#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000uJk1WzMfjM#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxpeQUCG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxpeQUCG#/physicaloffer |
      | https://mimovistar.movistar.co/cwp/baas/selfservice/html/offer/physicaloffer.html?offeringId=11zu000000ridxpeQUCG#/physicaloffer |

