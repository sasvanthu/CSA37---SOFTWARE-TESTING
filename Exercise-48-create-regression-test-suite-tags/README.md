# Exercise 48: Create a regression test suite using tags and test suites in JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to create a regression test suite using tags and test suites in JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml. Also add the dependency junit-platform-suite.

**Step 2:** Write the class CartService with the methods addItem(), removeItem(), total() and totalWithDiscount().

**Step 3:** Write the test class CartTest and mark the tests with @Tag("smoke") and @Tag("regression").

**Step 4:** Write the class RegressionSuiteTest annotated with @Suite, @SelectClasses and @IncludeTags("regression") so that only the regression tests are executed.

**Step 5:** Run the suite using mvn test -Dtest=RegressionSuiteTest and verify that only the four regression tests are executed.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/CartService.java`
- `src/test/java/CartTest.java`
- `src/test/java/RegressionSuiteTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test -Dtest=RegressionSuiteTest [INFO]  T E S T S [INFO] Running RegressionSuiteTest [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to create a regression test suite using tags and test suites in JUnit were executed successfully and the output was verified.
