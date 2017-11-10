@regression2
Feature: registration feature for AutomationPractice site
  As an User
  I want to see account created successfully

#  Scenario: verify that user created a New Account
#    Given user on Home page
#    When user click the SignIn button in home page
#    And enters a valid email as "sahi1234@gmail.com"
#    And clicks Create An Account button
#    Then user will be on Register page
#    When user have clicked on MRS tiltle
#    And user have entered a First Name as "sahi"
#    And user have entered a Last Name as "sunny"
#    And user have entered a Email "sahi1234@gmail.com"
#    And user have entered a Password as "sahisunny"
#    And user have selected Date Of Birth "13" "10" "2015"
#    And in YOUR ADDRESS section user have entered First Name as "sahi"
#    And user have entered a Last name in address as "sunny"
#    And user have entered a Address as "1234 melton rd"
#    And user have entered a City "london"
#    And user have selected a state "5"
#    And user have entered a Zip/PostalCode "12345"
#    And user have selected a Country "United States"
#    And user have entered a Additional Information "Leicestershire"
#    And user have entered a Home Phone "011678905332"
#    And user have entered a Mobile Phone as " 12334567887"
#    And user have entered in Assign an address alias for future reference text box as "same address"
#    And user clicks on the Register button
#    Then user account created successfully


  Scenario: verify account creation validation message
    Given user on Home page
    When user click the SignIn button in home page
    And enters a valid email as "sahidaida1234@gmail.com"
    And clicks Create An Account button
    Then user will be on Register page
    When user have clicked on MRS tiltle
    And user have entered a First Name as "sahi"
    And user have entered a Last Name as "sunny"
    And user have entered a Email "sahi1234@gmail.com"
    And user have entered a Password as "sahisunny"
    And user have selected Date Of Birth "13" "10" "2015"
    And in YOUR ADDRESS section user have entered First Name as "sahi"
    And user have entered a Last name in address as "sunny"
    And user have entered a Address as "1234 melton rd"
    And user have entered a City "london"
    And user have selected a state "5"
    And user have entered a Zip/PostalCode "12345893"
    And user have selected a Country "United States"
    And user have entered a Additional Information "Leicestershire"
    And user have entered a Home Phone "011678905332"
    And user have entered a Mobile Phone as " 12334567887"
    And user have entered in Assign an address alias for future reference text box as "same address"
    And user clicks on the Register button

