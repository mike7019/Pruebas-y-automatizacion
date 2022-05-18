Feature: Loggin in on the website and purchase a laptop test

  Brandon wants to login on the Advantage web site
  to purchase a new laptop

  Scenario Outline: Brandon logs in on the website and purchases a new laptop

    Given That Brandon logs in successfully and purchased a new laptop

    When Brandon logins on the web site with the following information
      | user   | password   |
      | <user> | <password> |
    Then Brandon visualizes the following user name <user> on the website

    Examples:
      | user        | password    |
      | Liliana7129 | Deutsch7019 |
