Feature: Testing Hotel Management Platform

  @suite
  Scenario: User wants to create an entry
    Given I want go to home page of hotel management platform
    When I click "Login" link
    And I login to website
    Then I should be on "Hotel Management Platform" page
    And I enter following data in text fields:
      | field     | value |
      | hotelName | aa    |
      | address   | aa    |
      | owner     | aa    |
      | phone     | aa    |
      | email     | aa    |
    And I click on "createHotel" button
    Then I should be able to delete input hotel
    And I should be entering multiple(3) values in page