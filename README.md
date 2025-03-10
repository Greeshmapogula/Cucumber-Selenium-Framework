
🚀 This is a Cucumber BDD-based automation framework built with Selenium, TestNG, and Extent Reports to test web applications efficiently. The framework follows a modular design for better maintainability and reusability.

📌 Features

✔️ BDD with Cucumber – Uses Gherkin syntax for writing test scenarios

✔️ Selenium WebDriver – Automates browser interactions

✔️ TestNG Integration – For test execution and parallel runs

✔️ Page Object Model (POM) – Improves code reusability

✔️ Extent Reports – Generates detailed test execution reports

✔️ Parameterized Tests – Runs scenarios with multiple test data

✔️ Hooks (Before/After) – Manages test setup and teardown

✔️ Reusable Utility Functions – Includes common utilities like screenshots

📂 Project Structure
```bash
Automation_Framework/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/             # Page Object Model (POM) classes
│   │   │   ├── utilities/         # Helper utilities (Extent Reports, Screenshots, etc.)
│   ├── test/
│   │   ├── java/
│   │   │   ├── stepdefinitions/    # Step definitions for Cucumber scenarios
│   │   │   ├── runners/           # TestNG and Cucumber runner files
│   │   │   ├── hooks/             # Before/After hooks for setup & teardown
│   ├── resources/
│   │   ├── features/              # Feature files written in Gherkin
│   │   ├── config.properties      # Configuration settings
│── pom.xml                        # Maven dependencies  
│── README.md                      # Project documentation  
```
🛠️ Setup & Installation
1️⃣ Clone the repository:
```bash
git clone https://github.com/yourusername/your-repo-name.git
cd your-repo-name
```
2️⃣ Install dependencies:

Ensure you have Java (JDK 11+) and Maven installed.
Run:
```bash
mvn clean install
```
3️⃣ Run tests:
```bash
mvn test
```
OR run the TestRunner file from the runners package.

📊 Reports & Logs
Extent Reports: Generated under test-output/ExtentReports/.
Screenshots: Captured in screenshots/ (Feature planned for future implementation).

📌 To Be Done (Future Enhancements)

✅ Add screenshot capture for failed tests

✅ Implement logging for better debugging

✅ Enhance reporting with additional details

