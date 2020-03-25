@Search_Feature
Feature: Loga_search

@TC_01
Scenario: To check Login credentials are valid

Given Open the URL in the browser
When click signin
When Enter valid Usernameandpassword
Then Click on signin

@TC_02
Scenario: Valid Search option

Given Open the URL in browser
When Enter the valid value in Search option
Then Click on enter

@TC_03
Scenario: Searchbox shows related searches
Given Open the website url in browser
When Enter the partial value in search option
Then Suggestions are displayed under search tab

@TC_04
Scenario: Items can be searched by size,color,compositions and style
Given Open the site url in browser
When the user search the product by size,color
And the user search the product by compositions,style
Then products are displayed

@TC_05
Scenario: Website displays more info when more option is clicked
Given Open the web url in the  browser
When the user clicks the more button
Then the website navigates to the next page and displays the additional information
