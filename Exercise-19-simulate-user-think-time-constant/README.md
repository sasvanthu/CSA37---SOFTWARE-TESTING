# Exercise 19: Simulate user think time using the Constant Timer in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to simulate user think time using the Constant Timer.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 3.

**Step 3:** Add an HTTP Request sampler for the home page (GET /).

**Step 4:** Right click the sampler, select Add > Timer > Constant Timer and set Thread Delay = 2000 milliseconds. The timer pauses every user for 2 seconds before the request.

**Step 5:** Add the Summary Report listener and run the plan once with the timer enabled. Disable the timer (right click > Disable) and run the plan again.

**Step 6:** Compare the throughput of both runs: the throughput is lower when the think time is used because the users behave like real users.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 5 |
|  | Ramp-up period (seconds) | 5 |
|  | Loop Count | 3 |
| HTTP Request (Home Page) | Protocol / Server Name | https / the-internet.herokuapp.com |
|  | Method / Path | GET / |
| Constant Timer | Thread Delay (milliseconds) | 2000 |

> Build this plan in Apache JMeter and save it as `Exercise19.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report (timer enabled) Label       # Samples   Error %   Throughput Home Page          15     0.00%   <lower value>/sec  Summary Report (timer disabled) Label       # Samples   Error %   Throughput Home Page          15     0.00%   <higher value>/sec
```

## Result

Thus Apache JMeter was used to simulate user think time using the Constant Timer and the results were verified.
