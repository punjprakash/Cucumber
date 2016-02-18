Feature: Learn Datatable

  Scenario: Existing user Verification
    Given user is displayed login screen
    Then we verify following user exists
      | Name    | Email           |
      | Shankar | sgarg@email.com |
      | Ram     | ram@email.com   |
      | Sham    | sham@email.org  |
