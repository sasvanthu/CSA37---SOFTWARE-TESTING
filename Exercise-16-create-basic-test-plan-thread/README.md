# Exercise 16: Create a basic test plan using Thread Group, HTTP Request sampler and listeners in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to execute a basic test plan using Thread Group, HTTP Request sampler and listeners.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 2 in the Thread Group.

**Step 3:** Right click Thread Group, select Add > Sampler > HTTP Request and enter the protocol, server name, method and path of the home page.

**Step 4:** Right click Thread Group, select Add > Listener and add View Results Tree and Summary Report.

**Step 5:** Save the plan as Exercise16.jmx and click the Start button (green arrow).

**Step 6:** Observe the results in the listeners and verify that the number of samples = users x loops = 10.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 5 |
|  | Ramp-up period (seconds) | 5 |
|  | Loop Count | 2 |
| HTTP Request (Home Page) | Protocol | https |
|  | Server Name | the-internet.herokuapp.com |
|  | Method | GET |
|  | Path | / |
| Listeners | Added | View Results Tree, Summary Report |

> Build this plan in Apache JMeter and save it as `Exercise16.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label       # Samples   Average   Min   Max   Std. Dev.   Error %   Throughput Home Page          10       <ms>  <ms>  <ms>        <ms>     0.00%        <n>/sec TOTAL              10       <ms>  <ms>  <ms>        <ms>     0.00%        <n>/sec  View Results Tree : all 10 samplers are green, Response code : 200, Response message : OK (<ms> and <n> depend on your network and system.)
```

## Result

Thus Apache JMeter was used to execute a basic test plan using Thread Group, HTTP Request sampler and listeners and the results were verified.
