# Exercise 5: Calculate the factorial of a number and validate the output using JUnit assertions

**Type:** JUnit

## Aim

To write JUnit test cases to calculate the factorial of a number and validate the output using JUnit assertions.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class MathUtil with the method factorial(int n) that multiplies the numbers from 2 to n and throws IllegalArgumentException for a negative number.

**Step 3:** Write the test class MathUtilTest and use assertEquals() to verify the factorial of 0, 1, 5 and 10.

**Step 4:** Use assertThrows() to verify that a negative number is rejected.

**Step 5:** Run the tests using mvn test and verify that all the assertions pass.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/MathUtil.java`
- `src/test/java/MathUtilTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running MathUtilTest [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to calculate the factorial of a number and validate the output using JUnit assertions were executed successfully and the output was verified.
