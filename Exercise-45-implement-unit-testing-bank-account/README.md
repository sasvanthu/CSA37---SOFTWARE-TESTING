# Exercise 45: Implement unit testing for a bank account management application using JUnit

**Type:** JUnit

## Aim

To write JUnit test cases to implement unit testing for a bank account management application using JUnit.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the junit-jupiter dependency (JUnit 5) to pom.xml.

**Step 2:** Write the class BankAccount with the methods deposit(), withdraw() and getBalance(), and validations for negative amounts and insufficient balance.

**Step 3:** Write the test class BankAccountTest and create a new account with the balance 5000 before each test using @BeforeEach.

**Step 4:** Write tests for deposit, withdrawal, insufficient balance, negative deposit and negative opening balance.

**Step 5:** Run the tests using mvn test and verify that every unit of the account class works independently.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/BankAccount.java`
- `src/test/java/BankAccountTest.java`


**Run:** `mvn test`

## Output

```
student@lab: ~ $ mvn test [INFO]  T E S T S [INFO] Running BankAccountTest [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0 [INFO] BUILD SUCCESS
```

## Result

Thus the JUnit test cases to implement unit testing for a bank account management application using JUnit were executed successfully and the output was verified.
