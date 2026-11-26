# Exercise 52: Execute system testing of an end-to-end checkout flow using Selenium WebDriver

**Type:** Selenium

## Aim

To write a Selenium WebDriver program to execute system testing of an end-to-end checkout flow.

## Algorithm

**Step 1:** Start the program, create a Maven project and add the selenium-java (Selenium 4) dependency to pom.xml. Selenium Manager downloads the browser driver automatically.

**Step 2:** Login with a valid user on the demo shopping web site.

**Step 3:** Add the Backpack to the cart and verify that the cart badge shows 1.

**Step 4:** Open the cart, click Checkout, enter the first name, last name and postal code and click Continue.

**Step 5:** Click Finish and verify the order confirmation message "Thank you for your order!".

**Step 6:** Display the system test result and stop.

## Program

Source files:
- `src/main/java/Exercise52.java`


**Run:** `mvn -q compile exec:java`  (main class `Exercise52`; Selenium Manager downloads the browser driver automatically)

## Output

```
student@lab: ~ Cart badge count : 1 Order status     : Thank you for your order! System test      : PASS
```

## Result

Thus the Selenium WebDriver program to execute system testing of an end-to-end checkout flow was executed successfully and the output was verified.
