# Exercise 14: Automate checkbox and radio button selection using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to automate checkbox and radio button selection.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the checkboxes page and collect all the check boxes using findElements().

**Step 3:** Read the initial state of both check boxes using isSelected(); select the first one and clear the second one using click().

**Step 4:** Open the web form page and select the second radio button using click().

**Step 5:** Print the state of the check boxes and the radio buttons after the click to verify the selection.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise14.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise14`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Checkbox 1 initially selected : false Checkbox 2 initially selected : true Checkbox 1 after click : true Checkbox 2 after click : false Radio 1 selected : false Radio 2 selected : true
```

## Result

Thus the Selenium WebDriver program to automate checkbox and radio button selection was executed successfully and the output was verified.
