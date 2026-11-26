# Exercise 31: Execute black-box testing on a login page using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to execute black-box testing on a login page.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Prepare four black-box test cases without looking at the code: valid login, wrong password, blank user name and blank password, with the expected result of each.

**Step 3:** Store the test cases in a two dimensional array (user name, password, expected result).

**Step 4:** For every test case delete the cookies, open the login page, enter the data and click the Login button.

**Step 5:** Compare the actual result (the URL or the error message) with the expected result and display PASS or FAIL.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise31.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise31`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ TC1 : PASS TC2 : PASS TC3 : PASS TC4 : PASS
```

## Result

Thus the Selenium WebDriver program to execute black-box testing on a login page was executed successfully and the output was verified.
