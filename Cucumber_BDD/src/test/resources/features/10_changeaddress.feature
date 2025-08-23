Feature: Address Change on eBay

  Scenario: Change user address on eBay account
    Given I login to eBay with my credentials
    When I hover over my profile  
    And I navigate to account settings
    And I go to personal information  
    And I scroll down by 400 pixels
    And I click edit address button
    And I update my address details
    Then my address should be updated successfully