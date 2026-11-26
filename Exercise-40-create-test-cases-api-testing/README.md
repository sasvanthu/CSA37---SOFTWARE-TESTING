# Exercise 40: Create test cases for API testing and verify status codes and response data in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to create test cases for API testing and verify the status codes and the response data.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 1. Add HTTP Request Defaults for the API server.

**Step 3:** Test case 1: GET /posts/1 with a Response Assertion for Response Code = 200 and a JSON Assertion for $.id = 1.

**Step 4:** Test case 2: GET /posts/9999 (invalid id) with a Response Assertion for Response Code = 404. Select Ignore Status so that the expected 404 is not counted as an error.

**Step 5:** Test case 3: GET /posts?userId=1 with a JSON Assertion for $[0].userId = 1.

**Step 6:** Add View Results Tree and Summary Report, run the plan and verify the status code and the data of every test case.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 5 |
|  | Ramp-up period (seconds) | 5 |
|  | Loop Count | 1 |
| HTTP Request Defaults | Protocol / Server Name | https / jsonplaceholder.typicode.com |
| TC1 : GET /posts/1 | Response Assertion | Response Code Equals 200 |
|  | JSON Assertion | $.id, Validate against expected value = 1 |
| TC2 : GET /posts/9999 | Response Assertion | Response Code Equals 404 |
|  | Ignore Status | Selected |
| TC3 : GET /posts?userId=1 | JSON Assertion | $[0].userId, Validate against expected value = 1 |

> Build this plan in Apache JMeter and save it as `Exercise40.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label                  # Samples   Error % TC1 : GET /posts/1             5     0.00% TC2 : GET /posts/9999          5     0.00% TC3 : GET /posts?userId=1      5     0.00% TOTAL                         15     0.00%
```

## Result

Thus Apache JMeter was used to create test cases for API testing and verify the status codes and the response data and the results were verified.

**Topic 3: Unit, Integration, System, Regression and Acceptance Testing**

*CO3: Analyse unit, integration, system, regression and acceptance testing using manual testing, JUnit, Selenium and Apache JMeter*
