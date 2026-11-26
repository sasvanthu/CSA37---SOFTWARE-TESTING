# Exercise 1: Identify and document the software defects of an ATM system from its specification

**Type:** Manual

## Aim

To select a system such as an ATM system, examine its specification and identify and document the software defects present in it. The activity trains the tester to derive test cases from a written specification (black-box approach) and to report every deviation as a defect with enough detail for the developer to reproduce it.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| Application under test | ATM system (simulator or the specification document of an ATM) |
| Test data | Valid card, PIN 1234, savings account balance 25,000 |
| Limits in the specification | Per transaction 10,000; per day 40,000; multiples of 100; 3 PIN attempts |
| Tools | Spreadsheet for the bug report, screen capture tool |
| Roles | Tester (designs and executes), reviewer (checks the bug reports) |

## Algorithm

**Step 1:** Start and select the ATM system. Study the specification and list the features to be tested: validity of the card, authentication of the user, withdraw transaction flow and dispensing of cash. Note the business rules (PIN length, per transaction limit, daily limit, denominations) because the expected results are derived from them.

**Step 2:** Identify the functions where a defect can occur (card, PIN, account type, balance, limits, denominations and receipt) and give a Bug Id (ATM001, ATM002 ...) to each of them. Write the precondition, the input and the expected result of every function before the execution.

**Step 3:** Execute the steps of every function on the system with the prepared data and compare the expected result with the actual result. Repeat the failed steps once to confirm that the defect is reproducible.

**Step 4:** Document every defect with its Bug Id, name, steps to reproduce, expected result and actual result, and attach the screenshot of the actual result.

**Step 5:** Prepare the test environment and the test data before the execution: the card, the PIN, the balance and the limits stated in the rule table, so that the expected result of every step is known in advance.

**Step 6:** Give a severity (Critical, Major, Minor) and a priority (High, Medium, Low) to every defect and set its status to New.

**Step 7:** Record the status of every bug as Pass or Fail, prepare the defect summary and stop.

## Test Cases / Document

***Features and business rules of the ATM (basis of the expected results)***

| **Feature** | **Business rule** |
| --- | --- |
| Card validation | Only a valid, unexpired and unblocked card is accepted |
| PIN | 4 digits; the card is blocked after 3 wrong attempts |
| Withdraw | Amount in multiples of 100; maximum 10,000 per transaction; maximum 40,000 per day |
| Balance | Amount cannot be more than the available balance |
| Receipt | Receipt is printed on request after every successful transaction |

***Bug report***

| **Bug Id** | **Bug Name** | **Steps to Reproduce** | **Expected Result** | **Actual Result (defect)** |
| --- | --- | --- | --- | --- |
| ATM001 | Invalid card | Insert a valid card | Welcome screen is displayed | Invalid card message is displayed |
| ATM002 | Invalid PIN | Insert a valid card and enter the correct PIN | Menu screen is displayed | Invalid PIN message is displayed |
| ATM003 | Invalid account type | Enter PIN, select Withdraw and select Savings | Enter amount screen is displayed | Invalid account type message is displayed |
| ATM004 | Insufficient balance | Withdraw an amount less than the balance | Cash is dispensed | Insufficient balance message is displayed |
| ATM005 | Transaction limit | Withdraw an amount within the per transaction limit | Cash is dispensed | Transaction limit exceeded message is displayed |
| ATM006 | Day limit | Withdraw within the daily limit | Cash is dispensed | Daily limit exceeded message is displayed |
| ATM007 | Invalid denominations | Withdraw 500 (a valid multiple of 100) | Cash is dispensed | Invalid denomination message is displayed |
| ATM008 | Receipt not printed | Complete a withdrawal and request the receipt | Receipt is printed | Receipt is not printed |
| ATM009 | PIN change mismatch | Change PIN and enter the same new PIN twice | PIN is changed | PIN mismatch message is displayed |
| ATM010 | Wrong PIN three times | Enter a wrong PIN three times | Card is blocked and a message is displayed | Card is not blocked and no message is displayed |
| ATM011 | Cancel the transaction | Select Withdraw and press Cancel | Card is returned to the user | Transaction continues and the card is not returned |

***Defect summary (fill after the execution)***

| **Severity** | **Number of defects** | **Bug Ids** |
| --- | --- | --- |
| Critical | 3 | ATM001, ATM002, ATM010 |
| Major | 6 | ATM003, ATM004, ATM005, ATM006, ATM007, ATM011 |
| Minor | 2 | ATM008, ATM009 |

## Result

Thus the defects of the ATM system were identified from its specification and documented as bug reports, and the output was verified. Every deviation between the expected and the actual result was reported with the steps to reproduce it.
