# Exercise 15: Capture a screenshot of a web page and store it in the local system using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to capture a screenshot of a web page and store it in the local system.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the web page using driver.get().

**Step 3:** Cast the driver to TakesScreenshot and call getScreenshotAs(OutputType.FILE) to capture the page as a temporary file.

**Step 4:** Create the folder screenshots and copy the temporary file into it as home_page.png using Files.copy().

**Step 5:** Print the path of the saved file and verify that the image is created.

**Step 6:** Stop.

## Program

Source files:
- `src/main/java/Exercise15.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise15`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Screenshot saved at : <project-folder>/screenshots/home_page.png
```

## Result

Thus the Selenium WebDriver program to capture a screenshot of a web page and store it in the local system was executed successfully and the output was verified.
