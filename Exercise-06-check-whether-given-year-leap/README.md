# Exercise 6: Check whether a given year is a leap year and validate the output using JUnit assertions

**Type:** JUnit

## Aim

To write JUnit test cases to check whether a given year is a leap year and validate the output using JUnit assertions.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class YearUtil with the method isLeapYear(int year) using the rule: divisible by 4 and not by 100, or divisible by 400.

**Step 3:** Write the test class YearUtilTest with one test for each case: a normal leap year, a century year, a century year divisible by 400 and a non-leap year.

**Step 4:** Use assertTrue() and assertFalse() to verify the result of each case.

**Step 5:** Run the tests using mvn test and verify the output.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/YearUtil.java`
- `src/test/java/YearUtilTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running YearUtilTest [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to check whether a given year is a leap year and validate the output using JUnit assertions were executed successfully and the output was verified.
