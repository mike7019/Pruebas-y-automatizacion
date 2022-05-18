Feature: Brandon purchase a laptop test

  Brandon wants to purchase the ENVY 17T touch Laptop on the website

  Background:

    Given That Brandon logs in successfully and purchased a new laptop

    When Brandon logins on the web site with the following information
      | user     | password    |
      | Liliana7129 | Deutsch7019 |

  Scenario Outline: <scene>
  Brandon logs in on the website and purchases a new laptop

    When Brandon logs in and sees <user> and selects the <laptop> and adds it to the shopping cart


    Then Brandon visualizes the correct laptop was successfully choose and shows the laptop name <laptop>

    Examples:
      | scene           | laptop              | user     |
      | Purchase laptop | HP ENVY - 17T TOUCH | Liliana7129 |


