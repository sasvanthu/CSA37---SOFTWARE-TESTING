# Exercise 41: Execute smoke testing on a new version of a messaging application

**Type:** Manual

## Aim

To execute smoke testing on a new version of a messaging application. Smoke testing is a quick and shallow check of the critical functions of a new build; it decides whether the build is stable enough for the detailed testing.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| Build under test | New build of the messaging application (build number to be recorded) |
| Devices | One Android and one iOS device with two test accounts |
| Time limit | The smoke test must be completed in 30 minutes |
| Rule | If any critical check fails the build is rejected and the testing stops |

## Algorithm

**Step 1:** Start and install the new build of the messaging application on the test device.

**Step 2:** Prepare the smoke test checklist that covers only the critical functions of the application. Keep it short so that it can be executed in about 15 to 30 minutes.

**Step 3:** Execute the checklist in the given order. If a critical function fails stop the testing.

**Step 4:** If all the checks pass accept the build for detailed testing; otherwise reject the build and return it to the developers with the failed checks.

**Step 5:** Install the build on the devices, note the build number and check the network connection before the first check.

**Step 6:** Execute the checks in the order of the table, and stop the execution at the first failure of a critical function and return the build with the failure details to the developers.

**Step 7:** Record the decision and the build number and stop.

## Test Cases / Document

***Entry and exit criteria of the smoke test***

| **Criteria** | **Condition** |
| --- | --- |
| Entry | Build is installed, the test accounts are ready and the network is available |
| Pass | All the critical checks pass in the time limit |
| Fail | Any critical check fails or the application crashes |
| Exit | Decision recorded: build accepted for detailed testing or rejected |

***Smoke test checklist***

| **TC ID** | **Critical function** | **Test** | **Expected result** | **Actual result** | **Status** |
| --- | --- | --- | --- | --- | --- |
| SM01 | Install and launch | Install the build and open the application | Application opens without a crash | Application opens without a crash | Pass |
| SM02 | Login | Login using the mobile number and OTP | Chat list is displayed | Chat list is displayed | Pass |
| SM03 | Send text | Send a text message to a contact | Message is sent and shows the delivered tick | Message is sent and shows the delivered tick | Pass |
| SM04 | Receive text | Receive a message from another device | Message is displayed with a notification | Message is displayed with a notification | Pass |
| SM05 | Send image | Send an image from the gallery | Image is delivered | Image is delivered | Pass |
| SM06 | Create group | Create a group with two members | Group is created and the members are added | Group is created and the members are added | Pass |
| SM07 | Notification | Keep the application in the background and receive a message | Notification is displayed | Notification is displayed | Pass |
| SM08 | Logout | Logout from the application | Login screen is displayed | Login screen is displayed | Pass |
| SM09 | Delete a message | Delete a sent message | Message is removed from the chat | Message is removed from the chat | Pass |
| SM10 | Upgrade | Install the new build over the old build | Old chats are retained | Old chats are retained | Pass |

***Build acceptance record***

| **Build number** | **Date** | **Tested by** | **Checks passed** | **Checks failed** | **Decision** |
| --- | --- | --- | --- | --- | --- |
| Build 2.5.0 | 10 Nov 2026 | Tester 1 and Tester 2 | 10 | 0 | Accepted for detailed testing |

## Result

Thus the smoke testing of the new version of the messaging application was executed and the build was accepted or rejected for detailed testing. Only the critical functions were checked, and the decision on the build was recorded.
