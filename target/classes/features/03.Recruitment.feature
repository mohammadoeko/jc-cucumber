Feature: Recruitment User

  Scenario: Recruitment user function
    When User click menus recruitment
    Then User on menu recruitment

  Scenario: Candidates search by hiring manager
    When User select search Linda Anderson by hiring manager
    And User click button search
    Then User showing Linda Jane Anderson by hiring manager
