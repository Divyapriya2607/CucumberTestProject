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
Feature: This is to test Admin feature
Scenario: Add User scenario
	Given user is clicking users from User Management and Clicking on Add button
	When user is selecting User Role "Admin"
	And user is typing the Employee Name "Employee1"
	And user is selecting Status "Enabled"
	And user is typing the Username "testusername"
	And user is typing the Password "testuser123"
	And user is typing the confirm password "testuser123"
	And enters the save button
	Then the user navigates to the user Page