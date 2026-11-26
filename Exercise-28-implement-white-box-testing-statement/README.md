# Exercise 28: Implement white-box testing using statement coverage on a number sorting program using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to implement white-box testing using statement coverage on a number sorting program using JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class SortUtil with the method bubbleSort(int[] a) that contains a null check, two nested loops, a comparison and a swap.

**Step 3:** Study the code and list the statements: null check, outer loop, inner loop, comparison and the three swap statements.

**Step 4:** Write a test with an unsorted array so that the swap statements are executed, and tests for a sorted array, a single element, an empty array and a null array.

**Step 5:** Run the tests with the coverage option of the IDE (Run with Coverage) and verify that every statement of bubbleSort() is executed.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/SortUtil.java`
- `src/test/java/SortUtilTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running SortUtilTest [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to implement white-box testing using statement coverage on a number sorting program using JUnit were executed successfully and the output was verified.
