CaseKaro QA Automation -
Automated end-to-end test suite for the CaseKaro e-commerce platform, built with Playwright (Java), Cucumber (BDD), and Maven.

Overview -
This suite simulates a real user shopping flow — browsing iPhone 16 Pro back covers, selecting a product, adding it to the cart in three different materials, and validating cart contents — all driven by human-readable Gherkin scenarios.

Tech Stack
ToolPurposeJavaCore languagePlaywright (Java)Browser automationCucumberBDD / Gherkin test scenariosJUnitTest runner integrationMavenDependency & build management

Test Scenario
The automated flow covers the following steps:

Open the CaseKaro website
Navigate to iPhone 16 Pro back covers
Open the first available product
Add the same product in three different materials — Hard, Soft, and Glass — closing the cart drawer after each addition
Open the cart
Assert that exactly 3 items are present
Print product details to the console for each cart item


Project Structure
Project_gocomet/
├── src/
│   └── test/
│       ├── java/
│       │   ├── runner/
│       │   │   └── TestRunner.java
│       │   └── stepdefinitions/
│       │       └── CaseSteps.java
│       └── resources/
│           └── features/
│               └── casekaro.feature
├── pom.xml
└── README.md

Getting Started
Prerequisites

Java 11+
Maven 3.8+
IntelliJ IDEA (recommended)

Run the Tests
bash# Clone the repository
git clone <your-repo-link>
cd Project_gocomet

-Run via Maven
-mvn test

- Or open in IntelliJ and run:
- src/test/java/runner/TestRunner.java
-

- Sample Console Output
---
Items in cart: 3

Classic Cafe Racer 99 iPhone 16 Pro Back Cover
Material : Glass
Price    : ₹249
Link     : https://casekaro.com/products/...

Classic Cafe Racer 99 iPhone 16 Pro Back Cover
Material : Black Soft
Price    : ₹149
Link     : https://casekaro.com/products/...

Classic Cafe Racer 99 iPhone 16 Pro Back Cover
Material : Hard
Price    : ₹69
Link     : https://casekaro.com/products/...

Notes

Tests run in non-headless mode by default — you can watch the automation execute in real time
The BDD feature file (casekaro.feature) serves as living documentation of the test scenarios
To run headless, update the Playwright launch options in CaseSteps.java
