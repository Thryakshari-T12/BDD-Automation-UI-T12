Feature: AmazonPage

  @BrokenLinks
  Scenario: ValidateBrokenLinks
    Given I Navigate to Amazon URL
    Then  I Validate Broken Links in the Web Page


  @ScrollAPage
  Scenario: Scroll the Page Up and Down
    Given I Navigate to Amazon URL
  Then I Scroll the Page Up and Down

  @screenShot
  Scenario: Take Screenshot
    Given I Navigate to Amazon URL
    Then I take Screen shot od a web page



    @dragAndDrop
    Scenario: Perform Drag and Drop
      Given I Navigate to Jquery URL
      Then I perform Drag and Drop