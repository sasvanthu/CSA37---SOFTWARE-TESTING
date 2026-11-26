# Exercise 27: Validate voting eligibility based on age using boundary value analysis in JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to validate voting eligibility based on age using boundary value analysis in JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class VoteChecker with the method isEligible(int age) that returns true for age 18 or more and throws IllegalArgumentException for age below 0 or above 120.

**Step 3:** Identify the boundary values: -1, 0, 17, 18, 19, 120 and 121.

**Step 4:** Write a @ParameterizedTest with @CsvSource for the valid boundary values and verify the result using assertEquals().

**Step 5:** Write a second @ParameterizedTest with @ValueSource for the invalid ages -1 and 121 using assertThrows().

**Step 6:** Run the tests using mvn test and verify the output.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/VoteChecker.java`
- `src/test/java/VoteCheckerTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running VoteCheckerTest [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to validate voting eligibility based on age using boundary value analysis in JUnit were executed successfully and the output was verified.
