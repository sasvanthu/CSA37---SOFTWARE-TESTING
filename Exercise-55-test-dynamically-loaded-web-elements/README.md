# Exercise 55: Test dynamically loaded web elements using explicit waits in Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to test dynamically loaded web elements using explicit waits.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the dynamic loading page. The text is not present in the page until the Start button is clicked and the loading bar finishes.

**Step 3:** Click the Start button.

**Step 4:** Create a WebDriverWait of 10 seconds and wait until the element with id "finish" becomes visible using ExpectedConditions.visibilityOfElementLocated().

**Step 5:** Read the text of the element and verify that it is "Hello World!". A direct findElement() without the wait fails with NoSuchElementException.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise55.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise55`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Dynamic text : Hello World! Verification : PASS
```

## Result

Thus the Selenium WebDriver program to test dynamically loaded web elements using explicit waits was executed successfully and the output was verified.
