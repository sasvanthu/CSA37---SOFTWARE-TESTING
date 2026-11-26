# Exercise 36: Execute black-box testing of a login request using the HTTP POST sampler in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to execute black-box testing of a login request using the HTTP POST sampler.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1. Add the HTTP Cookie Manager because the login uses a session.

**Step 3:** Add an HTTP Request sampler with the method POST for /authenticate and add the parameters username and password with valid values. Select Follow Redirects.

**Step 4:** Add a Response Assertion that checks the text "You logged into a secure area!".

**Step 5:** Add a second HTTP Request with a wrong password and a Response Assertion for the text "Your password is invalid!".

**Step 6:** Add View Results Tree and Summary Report, run the plan and verify that both the valid and the invalid inputs give the expected outputs.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 3 |
|  | Ramp-up period (seconds) | 3 |
|  | Loop Count | 1 |
| HTTP Cookie Manager | Default settings | Added to the Thread Group |
| HTTP Request 1 (Valid Login) | Server Name | the-internet.herokuapp.com |
|  | Method / Path | POST /authenticate |
|  | Parameters | username = tomsmith, password = SuperSecretPassword! |
|  | Follow Redirects | Selected |
| Response Assertion 1 | Pattern (Contains) | You logged into a secure area! |
| HTTP Request 2 (Invalid Password) | Method / Path | POST /authenticate |
|  | Parameters | username = tomsmith, password = wrong123 |
|  | Follow Redirects | Selected |
| Response Assertion 2 | Pattern (Contains) | Your password is invalid! |

> Build this plan in Apache JMeter and save it as `Exercise36.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label               # Samples   Error % Valid Login                 3     0.00% Invalid Password            3     0.00% TOTAL                       6     0.00%  (Both groups are green because every response contains the expected message.)
```

## Result

Thus Apache JMeter was used to execute black-box testing of a login request using the HTTP POST sampler and the results were verified.
