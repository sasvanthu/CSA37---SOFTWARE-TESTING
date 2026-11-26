# Exercise 29: Execute path coverage testing on a payroll calculation program using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to execute path coverage testing on a payroll calculation program using JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class Payroll with the method netSalary(basic, overtimeHours) containing three decisions: overtime > 0, gross > 50000 and gross > 25000.

**Step 3:** Draw the control flow graph and calculate the cyclomatic complexity V(G) = number of decisions + 1 = 3 + 1 = 4.

**Step 4:** Identify the four independent paths: P1 (no overtime, no tax), P2 (overtime, no tax), P3 (10% tax) and P4 (20% tax).

**Step 5:** Write one JUnit test for each independent path using assertEquals() with a delta value.

**Step 6:** Run the tests using mvn test and verify that all four paths are executed.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/Payroll.java`
- `src/test/java/PayrollPathTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running PayrollPathTest [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to execute path coverage testing on a payroll calculation program using JUnit were executed successfully and the output was verified.
