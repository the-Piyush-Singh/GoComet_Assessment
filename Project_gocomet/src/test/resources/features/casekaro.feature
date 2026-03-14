Feature: Casekaro

Scenario: Add mobile cover materials

Given user opens casekaro website
When user navigates to iphone 16 pro covers
And user opens first product
And user adds hard material
And user adds soft material
And user adds glass material
When user opens cart
Then cart should contain 3 items
And print product details