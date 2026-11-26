# Exercise 59: Execute end-to-end testing of a ticket booking flow using the Transaction Controller in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to execute end-to-end testing of a ticket booking flow using the Transaction Controller.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1. Add HTTP Request Defaults for the demo flight booking site and the HTTP Cookie Manager.

**Step 3:** Add Logic Controller > Transaction Controller named Book_Flight and select Generate parent sample.

**Step 4:** Add three HTTP Requests inside the controller: the home page (GET), the flight search (POST /reserve.php) and the flight selection (POST /purchase.php) with their parameters.

**Step 5:** Add Response Assertions: "Welcome to the Simple Travel Agency!", "Choose This Flight" and "Purchase Flight" for the three requests.

**Step 6:** Add Summary Report, run the plan and verify that the whole booking flow is reported as one transaction.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 3 |
|  | Ramp-up period (seconds) | 3 |
|  | Loop Count | 1 |
| HTTP Request Defaults | Protocol / Server Name | https / blazedemo.com |
| Transaction Controller | Name | Book_Flight |
|  | Generate parent sample | Selected |
| HTTP Request 1 | Method / Path | GET /index.php |
| HTTP Request 2 | Method / Path | POST /reserve.php |
|  | Parameters | fromPort = Paris, toPort = Buenos Aires |
| HTTP Request 3 | Method / Path | POST /purchase.php |
|  | Parameters | flight = 43, price = 472.56, airline = Virgin America, fromPort = Paris, toPort = Buenos Aires |
| Response Assertions | Patterns (Contains) | one assertion for each of the three requests |

> Build this plan in Apache JMeter and save it as `Exercise59.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label         # Samples   Error % Book_Flight           3     0.00% TOTAL                 3     0.00%  (Only the parent transaction is shown because Generate parent sample is selected.)
```

## Result

Thus Apache JMeter was used to execute end-to-end testing of a ticket booking flow using the Transaction Controller and the results were verified.
