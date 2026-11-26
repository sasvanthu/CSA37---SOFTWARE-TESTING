# Exercise 60: Create test cases for API testing of a weather information service using JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to create test cases for API testing of a weather information service.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 2. Add HTTP Request Defaults for the weather API server.

**Step 3:** Test case 1 (valid input): GET /v1/forecast with latitude = 13.08, longitude = 80.27 and current_weather = true. Add a Response Assertion for the code 200, a JSON Assertion for the path $.current_weather.temperature and a Duration Assertion of 2000 milliseconds.

**Step 4:** Test case 2 (invalid input): GET /v1/forecast with latitude = 999. Add a Response Assertion for the code 400 and select Ignore Status.

**Step 5:** Add View Results Tree and Summary Report, run the plan and verify the temperature value in the response of test case 1.

**Step 6:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 5 |
|  | Ramp-up period (seconds) | 5 |
|  | Loop Count | 2 |
| HTTP Request Defaults | Protocol / Server Name | https / api.open-meteo.com |
| TC1 : Valid Location | Method / Path | GET /v1/forecast |
|  | Parameters | latitude = 13.08, longitude = 80.27, current_weather = true |
|  | Response Assertion | Response Code Equals 200 |
|  | JSON Assertion | $.current_weather.temperature (path must exist) |
|  | Duration Assertion | 2000 ms |
| TC2 : Invalid Latitude | Method / Path | GET /v1/forecast |
|  | Parameters | latitude = 999, longitude = 80.27, current_weather = true |
|  | Response Assertion | Response Code Equals 400 |
|  | Ignore Status | Selected |

> Build this plan in Apache JMeter and save it as `Exercise60.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label                    # Samples   Error % TC1 : Valid Location            10     0.00% TC2 : Invalid Latitude          10     0.00% TOTAL                           20     0.00%  View Results Tree (TC1) : the JSON response contains "current_weather" with the fields "temperature" and "windspeed".
```

## Result

Thus Apache JMeter was used to create test cases for API testing of a weather information service and the results were verified.

**Topic 4: Test Planning and Test Documentation**

*CO4: Construct test plans and test documentation using manual testing, JUnit, Selenium and Apache JMeter*
