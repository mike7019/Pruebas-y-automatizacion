Feature: Register on the website test

  Brandon wants to register on the Advantage web site
  to purchase a new laptop

  Scenario Outline: Brandon wants to register on the website

    Given That Brandon registered successfully on the <webSite> and attempts to log in

    When Brandon clicks on User and types the info to register a new account
      | user   | email   | password   | confPass   |
      | <user> | <email> | <password> | <confPass> |

    Then Brandon validates the registry was successfully done showing the user name displayed as <user>

    Examples:
      | user        | email                 | password    | confPass    | webSite                                    |
      | Liliana7129 | Liliana7129@gmail.com | Deutsch7019 | Deutsch7019 | https://www.advantageonlineshopping.com/#/ |


