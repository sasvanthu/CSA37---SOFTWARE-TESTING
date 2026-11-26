# Exercise 46: Design a test harness using a stub and a driver to unit test a fare calculation module

**Type:** JUnit

## Aim

To write JUnit test cases to design a test harness using a stub and a driver to unit test a fare calculation module.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the interface DistanceService that returns the distance in km between two stops. The real implementation is not ready, so it will be replaced by a stub.

**Step 3:** Write the class FareCalculator (unit under test) that calculates fare = 50 + 12 x km using the DistanceService.

**Step 4:** Write the test class FareCalculatorTest as the driver. Create stubs using lambda expressions that return fixed distances 10, 0 and -5.

**Step 5:** Verify the fare for each stub using assertEquals() and assertThrows().

**Step 6:** Run the tests using mvn test and verify the output.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/DistanceService.java`
- `src/main/java/FareCalculator.java`
- `src/test/java/FareCalculatorTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running FareCalculatorTest [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to design a test harness using a stub and a driver to unit test a fare calculation module were executed successfully and the output was verified.
