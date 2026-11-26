# Exercise 12: Locate web elements using id, name, class name, CSS selector and XPath in Selenium

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to locate web elements using id, name, class name, CSS selector and XPath.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Open the login page of the demo web site.

**Step 3:** Locate the user name field using By.id(), the password field using By.name() and the logo using By.className().

**Step 4:** Locate the login button using By.cssSelector() and the logo again using By.xpath().

**Step 5:** Print the attribute or the text of every located element to confirm that the locator works.

**Step 6:** Close the browser and stop.

## Program

Source files:
- `src/main/java/Exercise12.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise12`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ By id          : placeholder = Username By name        : placeholder = Password By className   : text = Swag Labs By cssSelector : value = Login By xpath       : text = Swag Labs
```

## Result

Thus the Selenium WebDriver program to locate web elements using id, name, class name, CSS selector and XPath was executed successfully and the output was verified.
