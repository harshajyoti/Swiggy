#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@sample
Feature: Location
  I want to write the location on the location field on the website

  @tag1
  Scenario: Enter the Location
    Given I am on the home page of Swiggy application
    When I enter the location of the desired place
    And I click on the location Button

	@tag2
  Scenario: Update the Location
    When I click on the Other option in the left-upper side
    And I send location in string format
    And I will select the exact location Button

  #@tag2
  #Scenario: Update the Location
    #Given I am on the 
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
