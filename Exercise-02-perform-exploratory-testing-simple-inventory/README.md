# Exercise 2: Perform exploratory testing on a simple inventory management system

**Type:** Manual

## Aim

To perform exploratory testing on a simple inventory management system and record the defects found. Exploratory testing combines test design and test execution in one activity, so it finds the defects that scripted test cases usually miss and it depends on the skill and the curiosity of the tester.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| Application under test | Inventory management system (web or desktop) with a test login |
| Sessions | 8 sessions of 30 minutes, each followed by a 5 minute debriefing |
| Heuristic | SFDIPOT: Structure, Function, Data, Interfaces, Platform, Operations, Time |
| Tools | Session sheet, notebook, screen recorder (optional) |

## Algorithm

**Step 1:** Start and learn the inventory management system without any written test case: the screens, the data and the main functions. Browse every screen for about 15 minutes and draw a map of the features before the testing starts.

**Step 2:** Write the test charters. A charter states the mission of one session, the area to be explored and the time box (30 minutes). Use the form: Explore <area> with <resources> to discover <information>.

**Step 3:** Execute every session. Try valid, invalid and unexpected inputs, note the questions and the observations while testing. Use tours (feature tour, data tour, boundary tour) to cover the area in a systematic way.

**Step 4:** Record every defect found with the steps to reproduce it, and note the risks and the new test ideas that came during the session.

**Step 5:** Prepare the session sheet for every charter: charter id, tester, start time, time split (test design and execution, bug investigation, setup) and the space for the notes.

**Step 6:** Use the tours while testing: the feature tour (visit every menu), the data tour (valid, invalid and boundary data), the back-alley tour (rarely used functions) and the interruption tour (cancel, back and refresh in the middle of an action).

**Step 7:** Review the notes at the end of every session with the test lead (debriefing), decide the charters of the next session and stop.

## Test Cases / Document

***Tours used in the sessions***

| **Tour** | **What is explored** | **Charters** |
| --- | --- | --- |
| Feature tour | Every menu, screen and button once | EX01, EX04, EX06 |
| Data tour | Valid, invalid and boundary data in every field | EX01, EX02, EX03 |
| Back-alley tour | Rarely used functions (delete, import, export) | EX05, EX08 |
| Interruption tour | Cancel, back, refresh and session time out in the middle of an action | EX05, EX08 |
| Security tour | Login, roles and access to the pages of other roles | EX07 |

***Exploratory test charters***

| **Charter** | **Mission** | **Test ideas to explore** | **Time box** | **Defects / notes** |
| --- | --- | --- | --- | --- |
| EX01 | Explore adding a product | Blank fields, duplicate product code, negative price, very long name | 30 min | Duplicate product code is accepted; negative price is saved (2 defects) |
| EX02 | Explore stock update | Add stock, remove more stock than available, decimal quantity, zero quantity | 30 min | Stock becomes negative when more than the available stock is removed; decimal quantity is accepted (2 defects) |
| EX03 | Explore the reorder level alert | Stock equal to, below and above the reorder level | 30 min | Alert is not raised when the stock is equal to the reorder level (1 defect) |
| EX04 | Explore search and filter | Partial name, upper and lower case, special characters, empty search | 30 min | Search is case sensitive; special characters give an error page (2 defects) |
| EX05 | Explore deleting a product | Delete a product with stock, delete a product used in an order, undo | 30 min | A product used in an order can be deleted; there is no undo (2 defects) |
| EX06 | Explore the stock report | Export with no data, with large data, date range, sorting | 30 min | Export with no data creates an empty file without any message (1 defect) |
| EX07 | Explore login and user roles | Wrong password, expired session, access to a page of another role | 30 min | The page of another role opens when its URL is typed (1 defect, High) |
| EX08 | Explore import and export | Wrong file format, empty file, file with duplicate product codes | 30 min | A file with duplicate product codes is imported without a warning (1 defect) |

***Session sheet (one sheet for every session)***

| **Field** | **Details** |
| --- | --- |
| Charter id / tester / date | EX01 / Tester 1 / 05 Oct 2026 |
| Time split (design and execution / bug investigation / setup) | Test design and execution 70 % (21 min) / bug investigation 20 % (6 min) / setup 10 % (3 min) |
| Defects found (ids) | INV-01 (duplicate product code accepted), INV-02 (negative price saved) |
| Issues and questions | Is the maximum length of the product name defined in the requirement? What is the valid range of the price? |
| New test ideas | Product code with spaces and special characters; add 100 products one after another; edit a product while it is in an order |
| Debriefing notes | Area covered: add product screen. 2 defects found. EX02 (stock update) is the next charter because the stock field also accepts a negative value. |

## Result

Thus the exploratory testing of the inventory management system was completed using the test charters and the defects found were recorded. The notes of every session were reviewed and the new test ideas were kept for the next sessions.
