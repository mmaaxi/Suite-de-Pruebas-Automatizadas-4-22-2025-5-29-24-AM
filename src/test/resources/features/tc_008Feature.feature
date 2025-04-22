Feature: Validate addition of 'Folio Pre solicitud' column

  Scenario: Add 'Folio Pre solicitud' column to the exported Excel
    Given I am on the Excel export page
    When I generate the Excel export
    Then I should see 'Folio Pre solicitud' column added right of the 'Ramo' column without values