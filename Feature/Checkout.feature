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

Feature: Checkout Banana
Scenario: This is d scenario to test Banana Checkout :)

Given the price of the "banana" is 40 c 
When I checkout 1 "banana"
Then the total price should be 40c


Scenario: Banana split 
Given Banana splitting
When They SPlit
Then mark up 

Scenario: checking banana history 

Given the price is reduced
When the market is iterated
Then you need to add prices

Scenario: Tomboy @ work 
<<<<<<< HEAD
Given Tomboy need candies 
When tomboy gets it 
Then he eats


