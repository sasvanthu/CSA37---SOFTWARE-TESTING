# Exercise 4: Classify the defects of a loan application by defect class and build a defect repository

**Type:** Manual

## Aim

To classify the defects of a loan application according to the defect class and the phase in which they originate, and to build a defect repository. The repository is used to find the phase in which most of the defects originate, so that the defect prevention actions can be planned for that phase.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| Source of the defects | Review reports, code inspection reports and test reports of the loan application |
| Defect classes | Requirements and specification, design, coding and testing defects |
| Tool | Spreadsheet (the defect repository) |
| Output of the analysis | Defect count by class and by phase; the class with the largest count |

## Algorithm

**Step 1:** Start and collect the defects found in the loan application during requirements, design, coding and testing, from the review reports and the test reports.

**Step 2:** Classify every defect into one of the defect classes: requirements and specification, design, coding or testing defects, by the phase in which the defect was introduced.

**Step 3:** Enter every defect in the defect repository with an id, description, phase of origin, defect class and severity.

**Step 4:** Count the defects of every class and find the class that has the largest number of defects (defect clustering).

**Step 5:** Find the cause of every defect (missing information, wrong decision, coding mistake or wrong test) so that it is placed in the correct class and not only in the phase in which it was found.

**Step 6:** Calculate the percentage of the defects of every class using (defects of the class x 100) / total defects and draw a bar chart of the counts.

**Step 7:** Review the repository to plan the defect prevention actions (for example reviews of the requirements or the code inspection) and stop.

## Test Cases / Document

***Defect classes and examples***

| **Defect class** | **Meaning** | **Example** |
| --- | --- | --- |
| Requirements / specification | Missing, ambiguous or contradictory requirement | Maximum loan amount is not stated |
| Design | Wrong module interface, algorithm or data design | Zero interest rate not handled in the EMI design |
| Coding | Syntax, logic, data or control flow mistakes | EMI calculated for years instead of months |
| Testing | Wrong test case, test data or test environment | Wrong expected value for the age limit |

***Defect repository (sample entries)***

| **Defect Id** | **Description** | **Phase of origin** | **Defect class** | **Severity** |
| --- | --- | --- | --- | --- |
| LN-01 | The maximum loan amount is not stated in the requirement document | Requirements | Requirements / specification | Major |
| LN-02 | The requirement for the co-applicant is ambiguous | Requirements | Requirements / specification | Medium |
| LN-03 | The EMI module does not handle the zero interest rate in the design | Design | Design | Major |
| LN-04 | The database design has no field to store the guarantor | Design | Design | Medium |
| LN-05 | EMI is calculated for the number of years instead of the number of months | Coding | Coding | Critical |
| LN-06 | Loop counter error in the amortisation table (one row is missing) | Coding | Coding | Major |
| LN-07 | The test case for the age limit uses the wrong expected value | Testing | Testing | Minor |
| LN-08 | Test data of the rejected loans is not prepared | Testing | Testing | Minor |

***Defect count by class***

| **Defect class** | **Number of defects** |
| --- | --- |
| Requirements / specification | 2 |
| Design | 2 |
| Coding | 2 |
| Testing | 2 |

***Defect prevention plan***

| **Class with most defects** | **Cause** | **Preventive action** | **Owner** |
| --- | --- | --- | --- |
| Coding (2 defects, includes the critical defect LN-05) | The unit of the period (years or months) and the loop limit were not checked in the code review | Code inspection and unit testing of the EMI and the amortisation modules before every build | Development lead |
| Requirements / specification (2 defects) | The requirement document was not reviewed for the missing limits and the ambiguous statements | Review of the requirement document with a checklist (limits, roles and special cases) | Business analyst |
| Design (2 defects) | The special cases (zero interest) and the guarantor data were not considered in the design | Design review and walkthrough of the data model and the EMI logic | Design lead |

## Result

Thus the defects of the loan application were classified by defect class and stored in the defect repository, and the output was verified. The count of every class shows where the defect prevention actions are needed.
