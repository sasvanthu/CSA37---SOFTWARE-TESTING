# Exercise 33: Automate dropdown selection using the Select class in Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to automate dropdown selection using the Select class.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the dropdown page and locate the dropdown element using By.id("dropdown").

**Step 3:** Wrap the element in a Select object.

**Step 4:** Select an option using selectByVisibleText(), selectByValue() and selectByIndex() one after the other.

**Step 5:** After every selection print the text of getFirstSelectedOption() and print the total number of options.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise33.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise33`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ By visible text : Option 1 By value        : Option 2 By index        : Option 1 Total options   : 3
```

## Result

Thus the Selenium WebDriver program to automate dropdown selection using the Select class was executed successfully and the output was verified.
