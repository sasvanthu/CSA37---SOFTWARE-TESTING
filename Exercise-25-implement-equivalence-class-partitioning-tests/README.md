# Exercise 25: Implement equivalence class partitioning tests for a calculator using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to implement equivalence class partitioning tests for a calculator using JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class Calculator with the methods add(), subtract(), multiply() and divide().

**Step 3:** Identify the equivalence classes of the inputs for add(): positive and positive, negative and negative, positive and negative, and zero and zero.

**Step 4:** Write a @ParameterizedTest with @CsvSource that executes one representative value from each valid class.

**Step 5:** Write one test for a valid class of divide() and one test for the invalid class (divisor = 0) using assertThrows().

**Step 6:** Run the tests using mvn test and verify the output.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/Calculator.java`
- `src/test/java/CalculatorEPTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running CalculatorEPTest [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to implement equivalence class partitioning tests for a calculator using JUnit were executed successfully and the output was verified.
