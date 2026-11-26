# Exercise 13: Automate the filling and submission of a web form using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to automate the filling and submission of a web form.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the sample web form page of Selenium.

**Step 3:** Enter the text in the text box, the password in the password box and the comment in the text area using sendKeys().

**Step 4:** Click the Submit button using click().

**Step 5:** Read the heading and the message of the result page and verify that the form was submitted.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise13.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise13`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Page title : Web form Heading : Form submitted Message : Received!
```

## Result

Thus the Selenium WebDriver program to automate the filling and submission of a web form was executed successfully and the output was verified.
