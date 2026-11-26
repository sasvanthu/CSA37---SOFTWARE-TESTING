# Exercise 38: Correlate dynamic values using the JSON Extractor in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to correlate dynamic values using the JSON Extractor.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1.

**Step 3:** Add an HTTP Request GET /uuid that returns a new random id in the JSON response.

**Step 4:** Right click the sampler, select Add > Post Processors > JSON Extractor and extract the value using the JSON path $.uuid into the variable uid.

**Step 5:** Add a second HTTP Request GET /anything/${uid} that uses the extracted value in its path, and add a Response Assertion with the pattern ${uid}.

**Step 6:** Add View Results Tree, run the plan and verify that the id returned by the first request is used in the path of the second request.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 3 |
|  | Ramp-up period (seconds) | 3 |
|  | Loop Count | 1 |
| HTTP Request 1 | Protocol / Server Name | https / httpbin.org |
|  | Method / Path | GET /uuid |
| JSON Extractor | Names of created variables | uid |
|  | JSON Path expressions | $.uuid |
|  | Match No. | 1 |
|  | Default Values | NOT_FOUND |
| HTTP Request 2 | Method / Path | GET /anything/${uid} |
| Response Assertion | Pattern (Contains) | ${uid} |

> Build this plan in Apache JMeter and save it as `Exercise38.jmx` in this folder.

## Output

```
student@lab: ~ View Results Tree Request 1 : GET https://httpbin.org/uuid                 -> {"uuid": "<random-id>"} Request 2 : GET https://httpbin.org/anything/<random-id> -> Response code 200 Response Assertion : passed (the response contains the extracted id)  Summary Report : # Samples = 6, Error % = 0.00%
```

## Result

Thus Apache JMeter was used to correlate dynamic values using the JSON Extractor and the results were verified.
