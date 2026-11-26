# Exercise 35: Handle JavaScript alert, confirm and prompt pop-ups using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to handle JavaScript alert, confirm and prompt pop-ups.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the JavaScript alerts page.

**Step 3:** Click the JS Alert button, switch to the alert using driver.switchTo().alert(), print its text and accept it.

**Step 4:** Click the JS Confirm button and dismiss it. Click the JS Prompt button, enter a text using sendKeys() and accept it.

**Step 5:** Read the result text displayed on the page after every pop-up and verify it.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise35.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise35`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Alert text   : I am a JS Alert Result       : You successfully clicked an alert Confirm text : I am a JS Confirm Result       : You clicked: Cancel Result       : You entered: Hello Selenium
```

## Result

Thus the Selenium WebDriver program to handle JavaScript alert, confirm and prompt pop-ups was executed successfully and the output was verified.
