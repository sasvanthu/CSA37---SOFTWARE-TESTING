# Exercise 53: Execute smoke testing of the critical pages of a website using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to execute smoke testing of the critical pages of a website.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Prepare the list of the critical pages and the heading that each page must show.

**Step 3:** Open every page in a loop and read the first heading of the page using the CSS selector "h1, h2, h3".

**Step 4:** Compare the heading with the expected heading and display PASS or FAIL for every page.

**Step 5:** Display the number of pages that passed. If any page fails the build is not accepted for detailed testing.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise53.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise53`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Smoke / -> Welcome to the-internet -> PASS Smoke /login -> Login Page -> PASS Smoke /checkboxes -> Checkboxes -> PASS Smoke /dropdown -> Dropdown List -> PASS Smoke test result : 4/4 passed
```

## Result

Thus the Selenium WebDriver program to execute smoke testing of the critical pages of a website was executed successfully and the output was verified.
