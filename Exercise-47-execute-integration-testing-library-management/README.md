# Exercise 47: Execute integration testing for a library management system using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to execute integration testing for a library management system.

## Algorithm

**Step 1:** Create the Maven project with junit-jupiter. Write the classes Book, Member (borrowing limit = 2) and Library that depend on each other.

**Step 2:** Create the Library with real Book and Member objects in @BeforeEach so that the interfaces between the modules are tested together.

**Step 3:** Write six integration tests: issue a book, issue it twice, exceed the limit, return a book, return a book not borrowed and unknown member.

**Step 4:** Run the tests using mvn test, verify the output and stop.

## Program

Source files:
- `src/main/java/Book.java`
- `src/main/java/Member.java`
- `src/main/java/Library.java`
- `src/test/java/LibraryIntegrationTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO] Running LibraryIntegrationTest [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0   BUILD SUCCESS
```

## Result

Thus the JUnit test cases to execute integration testing for a library management system were executed successfully and the output was verified.
