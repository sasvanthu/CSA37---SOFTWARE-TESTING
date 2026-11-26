# Exercise 11: Open Chrome using Selenium WebDriver and verify the title and URL of a web page

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to open the Chrome browser and verify the title and URL of a web page.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Create the ChromeDriver object and maximize the browser window.

**Step 3:** Open the web page using driver.get() and read the title using getTitle() and the URL using getCurrentUrl().

**Step 4:** Compare the title with the expected title "Swag Labs" and display PASS or FAIL.

**Step 5:** Close all the browser windows using driver.quit() in the finally block.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/Exercise11.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise11`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Page title : Swag Labs Current URL : https://www.saucedemo.com/ Title verification : PASS
```

## Result

Thus the Selenium WebDriver program to open the Chrome browser and verify the title and URL of a web page was executed successfully and the output was verified.
