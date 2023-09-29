Feature: AmazonPage

  @BrokenLinks
  Scenario: ValidateBrokenLinks
    Given I Navigate to Amazon URL
    Then  I Validate Broken Links in the Web Page

