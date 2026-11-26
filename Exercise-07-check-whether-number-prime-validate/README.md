# Exercise 7: Check whether a number is prime and validate the output using JUnit assertions

**Type:** JUnit

## Aim

To write JUnit test cases to check whether a number is prime and validate the output using JUnit assertions.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class PrimeUtil with the method isPrime(int n) that returns false for n < 2 and checks divisibility from 2 up to the square root of n.

**Step 3:** Write the test class PrimeUtilTest with tests for prime numbers, composite numbers and numbers less than 2.

**Step 4:** Use assertTrue() for the prime numbers and assertFalse() for all the other numbers.

**Step 5:** Run the tests using mvn test and verify the output.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/PrimeUtil.java`
- `src/test/java/PrimeUtilTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running PrimeUtilTest [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to check whether a number is prime and validate the output using JUnit assertions were executed successfully and the output was verified.
