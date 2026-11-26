# Exercise 30: Achieve branch coverage on a program that finds the largest of three numbers using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to achieve branch coverage on a program that finds the largest of three numbers using JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class MaxFinder with the method largest(a, b, c) containing the decisions a >= b, a >= c and b >= c.

**Step 3:** List the branches: each decision must be executed once as true and once as false.

**Step 4:** Write four tests so that every return statement is executed: a is largest, c is largest when a >= b, b is largest and c is largest when b > a.

**Step 5:** Add one more test with three equal numbers.

**Step 6:** Run the tests using mvn test and verify that all the branches are covered.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/MaxFinder.java`
- `src/test/java/MaxFinderTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running MaxFinderTest [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to achieve branch coverage on a program that finds the largest of three numbers using JUnit were executed successfully and the output was verified.
