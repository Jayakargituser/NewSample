Feature: To Test Multiple Records

Scenario Outline: Sending Multiple Records
Given User navigates to home page
When The "<username>" and "<password>" is entered
Then Login Successful

Examples:
|username|password|
|jayakar123|jaya123|
|kalai123|kalai123|