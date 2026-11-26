# Exercise 32: Implement data-driven testing of a login page using JUnit parameterized tests and Selenium

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to implement data-driven testing of a login page using JUnit parameterized tests and Selenium.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the dependencies selenium-java and junit-jupiter to pom.xml.

**Step 2:** Write the test class LoginDataDrivenTest. Create the ChromeDriver in @BeforeEach and close it in @AfterEach.

**Step 3:** Write a @ParameterizedTest with @CsvSource whose rows contain the user name, the password and the expected result (page title or error message).

**Step 4:** In the test method enter the data, click Login and read the actual result. Use assertEquals() to compare the actual and expected results.

**Step 5:** Run the class using mvn test and verify that the test runs once for every data row.

**Step 6:** Stop.

## Program

Source files:
- `src/test/java/LoginDataDrivenTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO] Running LoginDataDrivenTest [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0 [INFO] Results: [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the Selenium WebDriver program to implement data-driven testing of a login page using JUnit parameterized tests and Selenium was executed successfully and the output was verified.
