# Exercise 9: Test the exception handling of a division program using assertThrows in JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to test the exception handling of a division program using assertThrows.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class Calculator with the method divide(int a, int b) that throws ArithmeticException with the message "Cannot divide by zero" when b is 0.

**Step 3:** Write the test class CalculatorTest and verify a valid division using assertEquals().

**Step 4:** Use assertThrows() to capture the exception for division by zero and compare its message using assertEquals().

**Step 5:** Run the tests using mvn test and verify the output.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/Calculator.java`
- `src/test/java/CalculatorTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running CalculatorTest [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to test the exception handling of a division program using assertThrows were executed successfully and the output was verified.
