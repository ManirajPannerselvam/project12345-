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

Feature: validation facebook login
   Scenario Outline: different username and password
    Given user launch facebook url
    When user enter valid username"<username>"and valid password"<password>" 
    And user enter login button
    Then user validate home page
      Examples: 
      |username|password|
      |9867992333|Raja@98|
      |8939486799|Maniraj@2|
