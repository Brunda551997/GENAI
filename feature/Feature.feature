#Read the Feature_Prompt.js file path: GenAI_Hackathon_PB/Optimus_Core/Design_Studio/Feature_Prompt.js

Feature: To test parabank application for various banking services

  #Background: User navigates to the homepage of the Parabank application by clicking on the URL
	
	@Register
  Scenario: User Registration
    Given User is on the homepage of the Parabank application
    When User clicks on the Register option
    And User fills in the required fields from fixture "registerpage"
    Then User should be able to register successfully

  #Scenario: Log-in to the application
    #Given User is on the homepage of the Parabank application
    #When User logs in to the application using credentials from fixture "registerpage"
    #Then User should be able to log in successfully
#
  #Scenario: Open new account page
    #Given User is logged in to the Parabank application
    #When User clicks on the open new account option in the account services menu
    #Then User should be able to view the account type dropdown
    #And User selects the account type from the dropdown
    #And User selects the amount to transfer from the dropdown
    #And User clicks on the open new account button
    #Then User should view the success message for opening a new account
#
  #Scenario: Bill payment page
    #Given User is logged in to the Parabank application
    #When User clicks on the bill pay option in the account services menu
    #Then User should be able to enter bill payment details from fixture "billpayment"
    #And User clicks on send payment button to complete the bill payment
    #Then User should view the bill payment complete message
#
  #Scenario: Apply for a loan page
    #Given User is logged in to the Parabank application
    #When User clicks on the request loan option in the account services menu
    #Then User should be able to fill in loan details from fixture "loanrequest"
    #And User clicks on the apply now button to submit the loan application
    #Then User views loan request processed message
#
  # Negative Scenarios
  #Scenario: User Registration without fields
    #Given User is on the homepage of the Parabank application
    #When User clicks on the Register option
    #Then User fills in the required fields from fixture "registerpage" with missing fields
    #And User clicks on the Register button
    #Then User should view the error messages for the missing fields
#
  #Scenario: Log-in with incorrect credentials
    #Given User is on the homepage of the Parabank application
    #When User logs in to the application using incorrect credentials from fixture "registerpage"
    #Then User should not be able to log in successfully
#
  #Scenario: Bill payment page without fields
    #Given User is logged in to the Parabank application
    #When User clicks on the bill pay option in the account services menu
    #Then User should be able to enter incomplete bill payment details from fixture "billpayment"
    #Then User clicks on the send payment button
    #Then User should see the error message for missing fields
#
  #Scenario: Apply loan without fields
    #Given User is logged in to the Parabank application
    #When User clicks on the request loan option in the account services menu
    #Then User should be able to fill in the loan amount from fixture "loanrequest" with missing fields
    #And User clicks on the apply now button to submit the loan application
    #Then User views error message on new page