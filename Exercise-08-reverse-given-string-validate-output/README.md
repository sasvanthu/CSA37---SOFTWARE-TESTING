# Exercise 8: Reverse a given string and validate the output using JUnit assertions

**Type:** JUnit

## Aim

To write JUnit test cases to reverse a given string and validate the output using JUnit assertions.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class StringUtil with the method reverse(String s) that returns null for a null input and otherwise returns the reversed string using StringBuilder.

**Step 3:** Write the test class StringUtilTest and use assertEquals() to verify the reverse of a word, an empty string and a palindrome.

**Step 4:** Use assertNotNull() and assertNull() to verify the result for valid and null inputs.

**Step 5:** Run the tests using mvn test and verify the output.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/StringUtil.java`
- `src/test/java/StringUtilTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running StringUtilTest [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to reverse a given string and validate the output using JUnit assertions were executed successfully and the output was verified.
