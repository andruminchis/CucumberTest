Feature: search

Scenario: Search dresses

Given the user is in the index page
When enter the website with username and password
And select transfer funds option
Then make a transfer <start>

Examples:

	| start | 
	|   12  | 
	|   20  | 

