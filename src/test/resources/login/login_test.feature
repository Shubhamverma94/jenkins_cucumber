Feature: Test OrangeHRM
#Scenario: To test login functionality  
#for one ans static data above


#Given I should be on login page
#When  enter the username "Admin"
#When  enter the password "admin123"
#And click on the login button 
#Then i should see the "PIM"


#for multiple ans data driven testing
Scenario Outline: to test login functonality


Given I should be on login page
When  enter the username <Username>
When  enter the password <Password>
And click on the login button 
Then i should see the "PIM"

Examples:
| Username | Password   |
| "Anurag" | "anu@123"  |
| "Razz"   | "arss@12"  |
| "Asmoii" | "khjn@33"  |
| "Admin"  | "admin123" |