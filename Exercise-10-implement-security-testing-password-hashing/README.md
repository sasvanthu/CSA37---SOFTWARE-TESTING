# Exercise 10: Implement security testing for password hashing and authentication using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to implement security testing for password hashing and authentication using JUnit assertions.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class AuthService with the method hash() that converts a password into a SHA-256 hexadecimal string using MessageDigest.

**Step 3:** Add the methods register() to store the hashed password and login() to compare the hash of the entered password with the stored hash.

**Step 4:** Write the test class AuthServiceTest to verify that the hash is repeatable, is different from the plain password and has 64 hexadecimal characters.

**Step 5:** Verify that login() returns true for the correct password and false for a wrong password.

**Step 6:** Run the tests using mvn test and verify the output.

**Step 7:** Stop.

## Program

Source files:
- `src/main/java/AuthService.java`
- `src/test/java/AuthServiceTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running AuthServiceTest [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to implement security testing for password hashing and authentication using JUnit assertions were executed successfully and the output was verified.
