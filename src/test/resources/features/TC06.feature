Feature: TC06



  Scenario:

        Given HF Launch browser
        And HF Navigate to url 'http://automationexercise.com'
        And HF Verify that home page is visible successfully
        And HF Click on 'Contact Us' button
        And HF Verify 'GET IN TOUCH' is visible
        And HF Enter name, email, subject and message
        And HF Upload file
        And HF Click 'Submit' button
        And HF Click OK button
        And HF Verify success message 'Success! Your details have been submitted successfully.' is visible
        Then HF Click 'Home' button and verify that landed to home page successfully
