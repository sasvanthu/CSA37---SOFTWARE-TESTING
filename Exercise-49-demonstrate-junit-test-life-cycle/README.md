# Exercise 49: Demonstrate the JUnit test life cycle using a stack implementation

**Type:** JUnit

## Aim

To write JUnit test cases to demonstrate the JUnit test life cycle using a stack implementation.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class IntStack with the methods push(), pop(), peek(), isEmpty() and size().

**Step 3:** Write the test class IntStackTest and use @BeforeAll, @BeforeEach, @AfterEach and @AfterAll with print statements to show the order of execution.

**Step 4:** Use @TestMethodOrder and @Order to fix the order of the four tests: push, pop, peek and pop on an empty stack.

**Step 5:** Run the tests using mvn test and observe the order in which the life cycle methods are called.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/IntStack.java`
- `src/test/java/IntStackTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test @BeforeAll  : test class initialised   @BeforeEach : new stack created   @AfterEach  : stack discarded   @BeforeEach : new stack created   @AfterEach  : stack discarded   @BeforeEach : new stack created   @AfterEach  : stack discarded   @BeforeEach : new stack created   @AfterEach  : stack discarded @AfterAll   : all tests completed [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0  BUILD SUCCESS
```

## Result

Thus the JUnit test cases to demonstrate the JUnit test life cycle using a stack implementation were executed successfully and the output was verified.
