Feature: Verifying adactinhotel login pade details
Scenario Outline: Verifying adactinhotel login with valid credentials
Given user is in the adactin hotel page
When user should enter the "<username>" and "<password>"
And user should enter login button
And user should enter the search page details of "<location>","<hotels>","<room type>","<no of rooms>","<check in date>","<check out date>","<adults per room>","<children per room>"
And user should click the search button
And user should click the preferred hotel
And user should click continue
And user should enter the select page details of "<first name>","<last name>","<billing address>","<credit card no>","credit card type","<expiry date month>","expiry date year>","<cvv no>"
Then user should click booknow 
Then print the order ID 

Examples: 
	|username    |password||location|hotels|room type|no of rooms|check in date|check out date|adults per room|children per room||first name||last name||billing address||credit card no||credit card type||expiry month||expiry year||cvv no|
	|kishoreakash|QZA335  ||Sydney|Hotel Creek|Standard|1 - One|01/02/2022|02/02/2021|1 - One|1 - One||kishore|   |akash|    |thoraipakkam|   |1234567890987654"||American Express||January||2012| |1234|
	
	
	
	