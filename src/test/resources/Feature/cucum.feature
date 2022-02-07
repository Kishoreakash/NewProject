Feature: Verifying adactinhotelapp details
Scenario: Verifying adactinhotelapp login with valid credentials

	Given user is in the login page
	When user should enter username and password
	And user should enter login button
	Then user should verify success message 
	
	