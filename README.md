# Selenium Login Tests

Automated web testing project developed with Java, Selenium WebDriver, JUnit 5 and Maven.

## Description

This project demonstrates basic web test automation using Selenium WebDriver with Java.

The tests automate the login functionality of a practice web application and verify both successful and unsuccessful authentication scenarios.

## Technologies

- Java 25
- Selenium WebDriver
- JUnit 5
- Maven
- Git / GitHub

## Test Scenarios

The project currently includes the following automated tests:

- **Successful login**
    - Valid username
    - Valid password
    - Verifies that the secure area is displayed

- **Invalid password**
    - Valid username
    - Invalid password
    - Verifies that the appropriate error message is displayed

- **Invalid username**
    - Invalid username
    - Valid password
    - Verifies that the appropriate error message is displayed

## Project Structure

```text
selenium-login-tests/
├── pom.xml
├── README.md
└── src/
    └── test/
        └── java/
            └── LoginTest.java