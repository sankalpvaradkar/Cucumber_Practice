Feature: Test facebook smooke scenario

Scenario: Test login with valid credentials
 	Given Open firefox and start application 
When I enter valid "san8ssv@gmail.com" and valid "sankalp8"
Then user should be able tp login successfully

