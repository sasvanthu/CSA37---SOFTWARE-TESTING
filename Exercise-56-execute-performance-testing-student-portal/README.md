# Exercise 56: Execute performance testing on a student portal using JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to execute performance testing on a student portal.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Add User Defined Variables for the host and the port of the student portal in the test environment, add HTTP Request Defaults that use them and add the HTTP Cookie Manager.

**Step 3:** Set Number of Threads = 20, Ramp-up period = 10 seconds and Loop Count = 2.

**Step 4:** Add four HTTP Requests: the login page, the login POST with a test account, the dashboard and the results page.

**Step 5:** Add a Duration Assertion of 3000 milliseconds to check that every page responds quickly.

**Step 6:** Add Summary Report and Aggregate Report, run the plan and analyse the average response time, the throughput and the error percentage.

**Step 7:** Stop.

*Note: load, stress and soak tests must be executed only against the college test server or a local copy of the application. Never run them against a web site that you do not own.*

## Test Plan Configuration

***Test plan configuration (replace the host and the paths with those of your portal)***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| User Defined Variables | host | localhost |
|  | port | 8080 |
| HTTP Request Defaults | Protocol / Server Name / Port | http / ${host} / ${port} |
| Thread Group | Number of Threads (users) | 20 |
|  | Ramp-up period (seconds) | 10 |
|  | Loop Count | 2 |
| HTTP Request 1 | Name / Method / Path | Login Page / GET / /login |
| HTTP Request 2 | Name / Method / Path | Login / POST / /login |
|  | Parameters | regno = <test regno>, password = <test password> |
| HTTP Request 3 | Name / Method / Path | Dashboard / GET / /dashboard |
| HTTP Request 4 | Name / Method / Path | Results / GET / /results |
| Duration Assertion | Duration in milliseconds | 3000 |

> Build this plan in Apache JMeter and save it as `Exercise56.jmx` in this folder.

## Output

```
student@lab: ~ Aggregate Report (expected sample count = 20 users x 2 loops x 4 requests = 160) Label        # Samples   Average   90% Line   95% Line   Error %   Throughput Login Page          40      <ms>       <ms>       <ms>     0.00%        <n>/sec Login               40      <ms>       <ms>       <ms>     0.00%        <n>/sec Dashboard           40      <ms>       <ms>       <ms>     0.00%        <n>/sec Results             40      <ms>       <ms>       <ms>     0.00%        <n>/sec TOTAL              160      <ms>       <ms>       <ms>     0.00%        <n>/sec  (The values <ms> and <n> depend on your portal. A failed Duration Assertion increases Error %.)
```

## Result

Thus Apache JMeter was used to execute performance testing on a student portal and the results were verified.
