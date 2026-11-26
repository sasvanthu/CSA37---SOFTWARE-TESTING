# Exercise 18: Configure HTTP Request Defaults and HTTP Header Manager for REST API requests in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to configure HTTP Request Defaults and HTTP Header Manager for REST API requests.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 2, Ramp-up period = 2 seconds and Loop Count = 1.

**Step 3:** Add Config Element > HTTP Request Defaults and enter the protocol and the server name once for the whole plan.

**Step 4:** Add Config Element > HTTP Header Manager and add the headers Content-Type and Accept as application/json.

**Step 5:** Add two HTTP Request samplers (GET /posts/1 and GET /users/1) and leave the server name empty because it is taken from the defaults.

**Step 6:** Add View Results Tree and Summary Report, run the plan and verify the JSON response of both requests.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 2 |
|  | Ramp-up period (seconds) | 2 |
|  | Loop Count | 1 |
| HTTP Request Defaults | Protocol | https |
|  | Server Name | jsonplaceholder.typicode.com |
| HTTP Header Manager | Content-Type | application/json |
|  | Accept | application/json |
| HTTP Request 1 | Method / Path | GET /posts/1 |
| HTTP Request 2 | Method / Path | GET /users/1 |

> Build this plan in Apache JMeter and save it as `Exercise18.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label          # Samples   Error % GET /posts/1           2     0.00% GET /users/1           2     0.00% TOTAL                  4     0.00%  View Results Tree (GET /users/1) : Response code 200, the response body is a JSON object containing "id": 1 and "name": "Leanne Graham".
```

## Result

Thus Apache JMeter was used to configure HTTP Request Defaults and HTTP Header Manager for REST API requests and the results were verified.
