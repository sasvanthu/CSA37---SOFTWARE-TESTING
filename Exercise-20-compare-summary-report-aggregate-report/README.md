# Exercise 20: Compare the Summary Report and Aggregate Report listeners in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to compare the Summary Report and Aggregate Report listeners.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 10, Ramp-up period = 10 seconds and Loop Count = 1.

**Step 3:** Add two HTTP Request samplers: GET / (returns 200) and GET /status_codes/404 (returns 404, which JMeter counts as an error).

**Step 4:** Add the listeners Summary Report, Aggregate Report and Graph Results to the Thread Group.

**Step 5:** Run the plan and compare the columns of the two reports: Average, Median, 90% Line, 95% Line, 99% Line, Min, Max, Error % and Throughput.

**Step 6:** Note down the metric that is available only in the Aggregate Report (the percentile lines) and the use of every listener.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 10 |
|  | Ramp-up period (seconds) | 10 |
|  | Loop Count | 1 |
| HTTP Request 1 | Name | Home |
|  | Server Name | the-internet.herokuapp.com |
|  | Method / Path | GET / |
| HTTP Request 2 | Name | Status 404 |
|  | Method / Path | GET /status_codes/404 |
| Listeners | Added | Summary Report, Aggregate Report, Graph Results |

> Build this plan in Apache JMeter and save it as `Exercise20.jmx` in this folder.

## Output

```
student@lab: ~ Aggregate Report Label        # Samples   Average   Median   90% Line   95% Line   99% Line   Error % Home                10      <ms>     <ms>       <ms>       <ms>       <ms>     0.00% Status 404          10      <ms>     <ms>       <ms>       <ms>       <ms>   100.00% TOTAL               20      <ms>     <ms>       <ms>       <ms>       <ms>    50.00%
```

## Result

Thus Apache JMeter was used to compare the Summary Report and Aggregate Report listeners and the results were verified.

**Topic 2: Test Case Design Using Black-Box and White-Box Techniques**

*CO2: Design test cases using black-box and white-box techniques using manual testing, JUnit, Selenium and Apache JMeter*
