# Exercise 58: Test session management and cookie handling using the HTTP Cookie Manager in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to test session management and cookie handling using the HTTP Cookie Manager.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1.

**Step 3:** Add the HTTP Cookie Manager. Add an HTTP Request POST /authenticate (login with valid data and Follow Redirects) and an HTTP Request GET /secure.

**Step 4:** Add a Response Assertion to the second request with the pattern "Welcome to the Secure Area". The page is shown only if the session cookie is sent with the request.

**Step 5:** Run the plan with the Cookie Manager enabled and note the result. Disable the Cookie Manager and run the plan again.

**Step 6:** Compare both results to understand that without the cookie the session is lost and the user is sent back to the login page.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 3 |
|  | Ramp-up period (seconds) | 3 |
|  | Loop Count | 1 |
| HTTP Cookie Manager | Added | Enabled in Run 1, Disabled in Run 2 |
| HTTP Request 1 | Server Name | the-internet.herokuapp.com |
|  | Method / Path | POST /authenticate |
|  | Parameters | username = tomsmith, password = SuperSecretPassword! |
|  | Follow Redirects | Selected |
| HTTP Request 2 | Method / Path | GET /secure |
| Response Assertion | Pattern (Contains) | Welcome to the Secure Area |

> Build this plan in Apache JMeter and save it as `Exercise58.jmx` in this folder.

## Output

```
student@lab: ~ Run 1 (Cookie Manager enabled) Label                # Samples   Error % POST /authenticate           3     0.00% GET /secure                  3     0.00%  Run 2 (Cookie Manager disabled) Label                # Samples   Error % POST /authenticate           3     0.00% GET /secure                  3   100.00%   (assertion fails, the login page is returned)
```

## Result

Thus Apache JMeter was used to test session management and cookie handling using the HTTP Cookie Manager and the results were verified.
