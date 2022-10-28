Feature: Recruitment User

  Scenario: Recruitment user function
    When User click menus recruitment
    Then User on menu recruitment

  Scenario: Add recruitment candidates
    When User click button add
    And User enter fullname
    And User select vacancy
    And User enter email
    And User enter contact number
    And User upload resume
    And User enter keywords
    And User enter date of application
    And User enter notes
    And User checklist consent to keep data
    And User click button save
    Then User showing application stage data

  Scenario: Candidates search by date
    When User select search candidate by date
    And User click button search
    Then User showing candidate by date

