Feature: Home Page Scenarios

  @ValidateLinks
Scenario: Validate all the Menu links are displayed
  Given I Navigate to Orange HRM URL
  Then  I Validate Login page is Disaplyed
  When  I Enter Valid User Name and Valid Password
  And   I Click On Login Button
  Then  I Validate Application Logged In Successfully
  Then  I Validate all the Menu Links are Displayed
  | Admin | PIM | Leave | Time |

