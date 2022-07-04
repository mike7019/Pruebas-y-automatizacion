Feature: Purchase an item on BangGood app

  @SmokeTest
  Scenario Outline:  Recommend and purchasing an item on BangGood app

    Given That Brandon opens the app BangGood

    When  Brandon interacts with the elements and adds them to cart

    Then  he sees the <items> on the cart list

    Examples:
      | items                                                                                                                                   |
      | SAFETYON 4 Pieces Drill Brush Attachment Electric Drill Brushes for Cleaning Pool Tile Flooring Brick Ceramic Marble Grout Bathroom Car |