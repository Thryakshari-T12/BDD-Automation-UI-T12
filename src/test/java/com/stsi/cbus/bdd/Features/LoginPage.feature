Feature: Login Page Scenarios

  @login
  Scenario: Validate Application With Valid Credentials
    Given I Navigate to Orange HRM URL
    Then  I Validate Login page is Disaplyed
    When  I Enter Valid User Name and Valid Password
    And   I Click On Login Button
    Then  I Validate Application Logged In Successfully
