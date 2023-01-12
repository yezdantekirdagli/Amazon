Feature: Amazon.com
  Scenario: Amazon.com adding product
    Given  user is on homepage
    When click accept cookies
    When click on search box
    When write Airpods on search box
    When click on search button
    When select item shipped by amazon only filter
    When select Apple filter as brand
    When select the first product
    When add cart
    When go cart
    When see product on the cart page
