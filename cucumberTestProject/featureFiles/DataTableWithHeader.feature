Feature: This is to test Login feature

  Scenario: Login scenario
    Given Go to login page
    When enter the below credentials
    |UserName	|	Password|
    |Admin | admin123|
    And click login button
    