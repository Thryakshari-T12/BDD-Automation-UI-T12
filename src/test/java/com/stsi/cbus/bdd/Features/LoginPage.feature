Feature: Login Page Scenarios

  @login
  Scenario: Validate Application With Valid Credentials
    Given I Navigate to Orange HRM URL
    Then  I Validate Login page is Disaplyed
    When  I Enter Valid User Name and Valid Password
    And   I Click On Login Button
    Then  I Validate Application Logged In Successfully


    @invalidLogin
    Scenario Outline:  Validate Application With In Valid Credentials
      Given I Navigate to Orange HRM URL
      Then  I Validate Login page is Disaplyed
      When  I Enter InValid UserName <userName> and InValid Password <password>
      And   I Click On Login Button
      Then  I Validate Application Not Logged In Successfully
      Examples:
          |     userName    |        password      |
          |     Admin       |        admin12345    |
          |     Test        |        admin123      |
          |     Test        |        admin12345    |



  @validlogin
  Scenario: Validate Application With Valid Credentials
    Given I Navigate to Orange HRM URL
    Then  I Validate Login page is Disaplyed
    When  I Enter Valid User Name "Admin" and Valid Password "admin123"
    And   I Click On Login Button
    Then  I Validate Application Logged In Successfully
