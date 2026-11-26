# Exercise 54: Automate the file upload functionality of a website using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to automate the file upload functionality of a website.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Create a temporary text file in the program using File.createTempFile() and write a line into it.

**Step 3:** Open the file upload page and send the absolute path of the file to the file input element using sendKeys().

**Step 4:** Click the Upload button and read the status heading and the name of the uploaded file.

**Step 5:** Verify that the status is "File Uploaded!" and that the displayed file name is the same as the name of the created file.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise54.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise54`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Upload status     : File Uploaded! File name matches : true
```

## Result

Thus the Selenium WebDriver program to automate the file upload functionality of a website was executed successfully and the output was verified.
