
Feature: Test OrangeHRM Application
Scenario: Validate login page
    
    When user enter valid username as "Admin"
    Then click on login button
    And capture warning message
