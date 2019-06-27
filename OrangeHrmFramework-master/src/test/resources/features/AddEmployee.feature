#Author: syntax team     //john.smith@wellfargo.com
@addEmployee @sprint5
Feature: Add Employee

  Background: 
    Given I logged in into OrangeHrm
    And I click on PIM link
    And I click on  Add Employee link

  @smoke 
  Scenario Outline: Add Employee
    When I provide "<FirstName>", "<MiddleName>", "<LastName>" and "<Location>"
    And I click on save button
    Then I see "<FirstName>", "<LastName>" is displayed

    Examples: 
|FirstName   |MiddleName|LastName  |Location     |
|Mustafa  |Ismail   |Dama |Smart Office |
|Melek   |Lina   |Yavuz |North Office |
|Ece  |Kasim  |Kaya |West Office  |
|Muhammed   |Arif  |Yildiz |HQ           |
@regression @temp
  Scenario: Add Employee and Create Login Details
    When I provide employee details from "EmployeeDetails"
    And I click on create login details
    And I provide all mandatory fields
    And I click on save button
    Then I see employee is added successfully

@regression
  Scenario: Add Employee Labels Verification
    Then I see following labels
      | First Name  |
      | Middle Name |
      | Last Name   |
      | Employee Id |
      | Location    |
      |Create Login Details|

      
