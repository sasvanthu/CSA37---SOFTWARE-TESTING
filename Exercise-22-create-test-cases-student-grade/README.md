# Exercise 22: Create test cases for a student grade evaluation system using boundary value analysis

**Type:** Manual

## Aim

To create test cases for a student grade evaluation system using boundary value analysis. Boundary value analysis is based on the fact that the defects occur more often at the edges of the input range than in the middle of it.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| Application under test | Student grade evaluation system (marks 0 to 100 gives the grade) |
| Grade rule | A: 90-100,  B: 80-89,  C: 70-79,  D: 60-69,  E: 50-59,  F: 0-49 |
| Technique | Boundary value analysis: min-1, min, min+1, max-1, max, max+1 |
| Tools | Test case sheet (spreadsheet) |

## Algorithm

**Step 1:** Start and study the grade rules: A (90-100), B (80-89), C (70-79), D (60-69), E (50-59) and F (0-49). Valid marks are 0 to 100, so a mark below 0 or above 100 must be rejected.

**Step 2:** Find the lower and the upper boundary of every range, including the boundaries of the valid input range (0 and 100).

**Step 3:** For every boundary select the value on the boundary and the values just inside and just outside the range.

**Step 4:** Prepare the test case table with the marks, the boundary tested and the expected result.

**Step 5:** Prepare the boundary table of every grade range with the six values: just below the minimum, the minimum, just above the minimum, just below the maximum, the maximum and just above the maximum.

**Step 6:** Remove the duplicate values (the maximum of one range is next to the minimum of the next range) and add the two invalid values -1 and 101 that are outside the whole range.

**Step 7:** Execute the test cases, compare the actual grade with the expected grade, record the status and stop.

## Test Cases / Document

***Boundary values of the grade ranges***

| **Grade** | **Range** | **Min-1** | **Min** | **Min+1** | **Max-1** | **Max** | **Max+1** |
| --- | --- | --- | --- | --- | --- | --- | --- |
| F | 0 - 49 | -1 | 0 | 1 | 48 | 49 | 50 |
| E | 50 - 59 | 49 | 50 | 51 | 58 | 59 | 60 |
| D | 60 - 69 | 59 | 60 | 61 | 68 | 69 | 70 |
| C | 70 - 79 | 69 | 70 | 71 | 78 | 79 | 80 |
| B | 80 - 89 | 79 | 80 | 81 | 88 | 89 | 90 |
| A | 90 - 100 | 89 | 90 | 91 | 99 | 100 | 101 |

***Test cases***

| **TC ID** | **Marks** | **Boundary tested** | **Expected result** | **Actual result** | **Status** |
| --- | --- | --- | --- | --- | --- |
| TC01 | -1 | Just below the minimum | Invalid marks message | Invalid marks message | Pass |
| TC02 | 0 | Minimum | Grade F | Grade F | Pass |
| TC03 | 49 | Upper boundary of F | Grade F | Grade F | Pass |
| TC04 | 50 | Lower boundary of E | Grade E | Grade E | Pass |
| TC05 | 59 | Upper boundary of E | Grade E | Grade E | Pass |
| TC06 | 60 | Lower boundary of D | Grade D | Grade D | Pass |
| TC07 | 69 | Upper boundary of D | Grade D | Grade D | Pass |
| TC08 | 70 | Lower boundary of C | Grade C | Grade C | Pass |
| TC09 | 79 | Upper boundary of C | Grade C | Grade C | Pass |
| TC10 | 80 | Lower boundary of B | Grade B | Grade B | Pass |
| TC11 | 89 | Upper boundary of B | Grade B | Grade B | Pass |
| TC12 | 90 | Lower boundary of A | Grade A | Grade A | Pass |
| TC13 | 100 | Maximum | Grade A | Grade A | Pass |
| TC14 | 101 | Just above the maximum | Invalid marks message | Invalid marks message | Pass |
| TC15 | abc | Non-numeric value (error guessing) | Invalid marks message | Invalid marks message | Pass |

***Test execution summary (fill after the execution of the test cases)***

| **Total designed** | **Executed** | **Passed** | **Failed** | **Blocked** | **Pass %** |
| --- | --- | --- | --- | --- | --- |
| 15 | 15 | 15 | 0 | 0 | 100 % |

## Result

Thus the test cases of the student grade evaluation system were created using boundary value analysis and the output was verified. The values on and around every boundary of the grade ranges were tested.
