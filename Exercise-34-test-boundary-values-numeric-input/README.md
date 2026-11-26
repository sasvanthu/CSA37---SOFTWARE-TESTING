# Exercise 34: Test the boundary values of a numeric input field using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to test the boundary values of a numeric input field.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Create an HTML number field with the valid range 18 to 60 using JavascriptExecutor (about:blank page).

**Step 3:** Identify the boundary values of the range: 17, 18, 19, 59, 60 and 61.

**Step 4:** For every value clear the field, enter the value using sendKeys() and call the HTML5 method checkValidity() using JavascriptExecutor.

**Step 5:** Print the validity of every value and verify that 18 to 60 are valid and 17 and 61 are invalid.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise34.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise34`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Age 17 -> valid = false Age 18 -> valid = true Age 19 -> valid = true Age 59 -> valid = true Age 60 -> valid = true Age 61 -> valid = false
```

## Result

Thus the Selenium WebDriver program to test the boundary values of a numeric input field was executed successfully and the output was verified.
