Feature: Download page operations

  @Smoke
  Scenario: Check how many browser options are available
    Given User launch the Chrome browser
    When User opens URL "https://www.selenium.dev/downloads/"
    Then Page title should be "Downloads | Selenium"
    When clicks on plus button
    Then Numbers of browser options are visible