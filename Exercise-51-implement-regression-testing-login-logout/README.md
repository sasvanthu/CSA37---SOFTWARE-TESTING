# Exercise 51: Implement regression testing of the login and logout functionality using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to implement regression testing of the login and logout functionality.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Create the ChromeDriver and a WebDriverWait object with a time out of 10 seconds.

**Step 3:** Login with a valid user and verify that the Products page is displayed (login check).

**Step 4:** Open the menu, click Logout and verify that the login button is displayed again (logout check).

**Step 5:** Run the same script after every change of the application so that a defect introduced in these features is detected.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise51.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise51`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Login check  : PASS Logout check : PASS
```

## Result

Thus the Selenium WebDriver program to implement regression testing of the login and logout functionality was executed successfully and the output was verified.
