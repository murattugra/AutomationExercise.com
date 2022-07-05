Feature: TC14 Uzun Versiyon

  Scenario:
    Given ed  Launch browser
    And   ed  Navigate to url automationexercise.com
    And   ed  Verify that home page is visible successfully
    And   ed  Add products to cart
    And   ed  Click Cart button
    And   ed  Verify that cart page is displayed
    And   ed  Click Proceed To Checkout button
    And   ed  Click Register Login button
    And   ed  Fill all details in Signup and create account
    And   ed  Verify ACCOUNT CREATED! and click Continue button
    And   ed  Verify Logged in as username at top
    And   ed  Click Cart button
    And   ed  Click Proceed To Checkout button
    And   ed  Verify Address Details and Review Your Order
    And   ed  Enter description in comment text area and click Place Order
    And   ed  Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And   ed  Click Pay and Confirm Order button
    And   ed  Verify success message Your order has been placed successfully!
    And   ed  Click Delete Account button
    Then  ed  Verify ACCOUNT DELETED! and click Continue button