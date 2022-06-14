Feature: TC01



  Scenario:

        Given HF Launch browser
        And   HF Navigate to url 'http://automationexercise.com'
        And   HF Verify that home page is visible successfully
        And   HF Click on 'Signup / Login' button
        And   HF Verify 'New User Signup!' is visible
        And   HF Enter name and email address
        And   HF Click 'Signup' button
        And   HF Verify that 'ENTER ACCOUNT INFORMATION' is visible
        And   HF Fill details: Title, Name, Email, Password, Date of birth
        And   HF Select checkbox 'Sign up for our newsletter!'
        And   HF Select checkbox 'Receive special offers from our partners!'
        And   HF Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        And   HF Click 'Create Account button'
        And   HF Verify that 'ACCOUNT CREATED!' is visible
        And   HF Click 'Continue' button
        And   HF Verify that 'Logged in as username' is visible
        And   HF Click 'Delete Account' button
        Then  HF Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button