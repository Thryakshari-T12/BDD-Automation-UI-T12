Feature: Facebook Login Page Scenarios.

  @Facebooklogin
  Scenario: Validate Application With Valid Credentials
    Given I Navigate to Facebook URL
    Then  I Validate Facebook Login page is Displayed
    When  I Enter Valid Facebook User Name and Valid Password
    And   I Click On Facebook Login Button
    Then  I Validate Facebook Application Logged In Successfully