Feature: TC05



  Scenario:

        Given HF Launch browser
        And   HF Navigate to url 'http://automationexercise.com'
        And   HF Verify that home page is visible successfully
        And   HF Click on 'Signup / Login' button
        And   HF Verify 'New User Signup!' is visible
        And   HF Enter name and already registered email address
        And   HF Click 'Signup' button
        Then  HF Verify error 'Email Address already exist!' is visible
