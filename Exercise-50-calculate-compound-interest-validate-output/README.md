# Exercise 50: Calculate compound interest and validate the output using JUnit parameterized tests

**Type:** JUnit

## Aim

To write JUnit test cases to calculate compound interest and validate the output using JUnit parameterized tests.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class CompoundInterest with the method interest(principal, rate, years) = P x (1 + R/100)^N - P and an exception for a negative principal.

**Step 3:** Write the test class CompoundInterestTest with a @ParameterizedTest and @CsvSource containing the principal, rate, years and the expected interest.

**Step 4:** Use assertEquals() with a delta of 0.01 to compare the double values.

**Step 5:** Write one more test that expects IllegalArgumentException for a negative principal.

**Step 6:** Run the tests using mvn test and verify the output.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/CompoundInterest.java`
- `src/test/java/CompoundInterestTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running CompoundInterestTest [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to calculate compound interest and validate the output using JUnit parameterized tests were executed successfully and the output was verified.
