
Feature: Home Page

  
  Scenario Outline: Title of your scenario
    Given the chrome is launched
    When url is hit
    Then launches to the home page and accept the cookies
  
	When user hover upon the Products 
	And clicks on the Entrata Business Intelligence
	Then lands to the BI page and goes to the previous page
	

	
	And User is on the entrata home page
	When User clicks on the Watch Demo
	And User enters the "<fname>" "<lname>" "<email>" "<company>" and  "<phone>"
	And User enters the count and "<title>"
	Then User goes to the home page
	
	Examples:
	
	|fname|lname|email|company|phone|title|
	|Sushmita|Bhadra|sushmitabhadra11@gmail.com|xyz|8340563219|Analyst|
	|Anisha|Singh|singhAnisha11@gmail.com|pqr|5340563719|BA|
	|Vipasha|Agarwal|VipashaAg34@gmail.com|abc|3340523219|Developer|
	