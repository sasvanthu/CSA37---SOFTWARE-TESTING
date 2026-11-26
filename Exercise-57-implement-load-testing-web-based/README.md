# Exercise 57: Implement load testing for a web-based exam system using JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to implement load testing for a web-based exam system.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Add HTTP Request Defaults and the HTTP Cookie Manager for the exam server of the test environment.

**Step 3:** Set Number of Threads = 50, Ramp-up period = 25 seconds and Loop Count = 1 to simulate 50 students who start the exam over a period of 25 seconds.

**Step 4:** Add three HTTP Requests: student login (POST), download of the question paper (GET) and submission of the answers (POST).

**Step 5:** Add a Response Assertion for the status code 200 and a Duration Assertion of 5000 milliseconds.

**Step 6:** Add Summary Report and Aggregate Report, run the plan and compare the 90% Line and the Error % with the acceptance criteria (Error % = 0 and 90% Line less than 5 seconds).

**Step 7:** Stop.

*Note: load, stress and soak tests must be executed only against the college test server or a local copy of the application. Never run them against a web site that you do not own.*

## Test Plan Configuration

***Test plan configuration (replace the host and the paths with those of your exam system)***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| HTTP Request Defaults | Protocol / Server Name / Port | http / localhost / 8080 |
| Thread Group | Number of Threads (users) | 50 |
|  | Ramp-up period (seconds) | 25 |
|  | Loop Count | 1 |
| HTTP Request 1 | Name / Method / Path | Student Login / POST / /exam/login |
| HTTP Request 2 | Name / Method / Path | Get Questions / GET / /exam/questions?paper=CSA37 |
| HTTP Request 3 | Name / Method / Path | Submit Answers / POST / /exam/submit |
| Response Assertion | Field to Test / Rule / Pattern | Response Code / Equals / 200 |
| Duration Assertion | Duration in milliseconds | 5000 |

> Build this plan in Apache JMeter and save it as `Exercise57.jmx` in this folder.

## Output

```
student@lab: ~ Aggregate Report (expected sample count = 50 users x 3 requests = 150) Label            # Samples   Average   90% Line   Error % Student Login           50      <ms>       <ms>     0.00% Get Questions           50      <ms>       <ms>     0.00% Submit Answers          50      <ms>       <ms>     0.00% TOTAL                  150      <ms>       <ms>     0.00%
```

## Result

Thus Apache JMeter was used to implement load testing for a web-based exam system and the results were verified.
