# Exercise 44: Execute acceptance testing for a hotel reservation system

**Type:** Manual

## Aim

To execute acceptance testing for a hotel reservation system. Acceptance testing is done with the customer or the user to decide whether the system satisfies the acceptance criteria and can be accepted.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| System under test | Hotel reservation system (search, booking, payment, cancellation and billing) |
| Users | Hotel manager, receptionist and two guests as the acceptance testers |
| Environment | User acceptance environment that is the copy of the production setup |
| Basis | Acceptance criteria agreed with the customer for every requirement |

## Algorithm

**Step 1:** Start and take the requirements of the customer and write the acceptance criteria of every requirement.

**Step 2:** Prepare the acceptance test cases. The alpha test is executed by the users at the developer's site and the beta test by the real users in their own environment.

**Step 3:** Execute the acceptance test cases with the user in the user acceptance environment.

**Step 4:** Record Accept or Reject for every criterion with the comments of the user.

**Step 5:** Agree the acceptance criteria and the pass rule (all High priority criteria accepted) with the customer before the execution.

**Step 6:** Let the users execute the tests with their own data while the tester observes and records their comments, and collect the sign-off at the end.

**Step 7:** Take the decision about the acceptance of the system, get the sign-off of the customer and stop.

## Test Cases / Document

***Alpha and beta acceptance testing***

| **Type** | **Performed by** | **Place** | **Purpose** |
| --- | --- | --- | --- |
| Alpha test | Internal users or testers who are not in the development team | Developer's site | Find the defects before the release to the customer |
| Beta test | Selected real users (hotel staff and guests) | User's own site | Confirm the fitness for use in the real environment |
| User acceptance test (UAT) | Customer representatives | Acceptance environment | Decide the acceptance of the system |

***Acceptance test cases***

| **AC Id** | **Requirement** | **Acceptance test** | **Expected result** | **Actual result** | **Accept / Reject** |
| --- | --- | --- | --- | --- | --- |
| AC01 | Search the available rooms | Search by the check-in date, check-out date and guests | Available rooms and rates are displayed | Available rooms and rates are displayed | Accept |
| AC02 | Book a room | Select a room and enter the guest details | Booking is confirmed with a booking number | Booking is confirmed with a booking number | Accept |
| AC03 | Online payment | Pay the advance using a card | Payment receipt is displayed | Payment receipt is displayed | Accept |
| AC04 | Booking confirmation | Complete a booking | Confirmation e-mail is received in 5 minutes | Confirmation e-mail is received in 5 minutes | Accept |
| AC05 | Modify a booking | Change the check-out date | New date and amount are displayed | New date and amount are displayed | Accept |
| AC06 | Cancel a booking | Cancel a booking before the cancellation limit | Booking is cancelled and the refund is shown | Booking is cancelled and the refund is shown | Accept |
| AC07 | Reception view | Receptionist opens the list of today's arrivals | List of the guests is displayed | List of the guests is displayed | Accept |
| AC08 | Generate the bill | Check-out a guest | Bill with the room charge and the tax is printed | Bill with the room charge and the tax is printed | Accept |
| AC09 | Guest feedback | Submit the feedback after the check-out | Feedback is saved | Feedback is saved | Accept |
| AC10 | Role-based access | Receptionist opens the admin report | Access is denied | Access is denied | Accept |

***User acceptance sign-off***

| **Item** | **Details** |
| --- | --- |
| Decision (Accepted / Accepted with conditions / Rejected) | Accepted (all 10 acceptance criteria are accepted) |
| Comments of the users | All the acceptance criteria are satisfied. Suggestion of the users: show the refund amount on the cancellation page. |
| Accepted by (name, designation, signature, date) | Hotel manager (customer representative), signed, 15 Nov 2026 |

## Result

Thus the acceptance testing of the hotel reservation system was executed against the acceptance criteria and the output was verified. The decision was taken on the basis of the acceptance criteria of the customer.
